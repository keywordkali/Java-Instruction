package db;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import business.Actor;


public class ActorTextFile implements DAO<Actor> {
	private List<Actor> actor = null;
	private Path actorPath = null;
	private File actorFile = null;
	private final String FIELD_SEP = "\t";

	public ActorTextFile() { 
		actorPath = Paths.get("actor.txt");
		actorFile = actorPath.toFile();
		actor = getAll();
	}

	public Actor get(int actorID) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all products from text file if our list is null
	@Override
	public List<Actor> getAll() {
		if (actor != null) {
			return actor;
		}
		actor = new ArrayList<>();
		if (Files.exists(actorPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(actorFile))) {

				// read products from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String actorIDstr = fields[0];
					int    actorID = Integer.parseInt(actorIDstr);
					String actorFirstName = fields[1];
					String actorLastName = fields[2];
					String actorGender = fields[3];
					String actorBirthdate = fields [4];
					LocalDate bd = LocalDate.parse(actorBirthdate);
					Actor a = new Actor( actorFirstName, actorLastName, actorGender, bd);
					actor.add(a);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(actorPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return actor;
	}

	@Override

	public boolean add(Actor a) {
		actor.add(a);
		return saveAll();
	}

	@Override
	public boolean update(Actor a) {
		// get old product and remove it
		Actor oldActor = this.get(a.getActorID());
		int i = actor.indexOf(oldActor);
		actor.remove(i);
		actor.add(i, a);
		return saveAll();
	}

	@Override
	public boolean delete(Actor a) {
		actor.remove(a);
		return saveAll();
	}

	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(actorFile)))) {
			// write all products in the list to the file
			for (Actor a : actor) {
				out.print(a.getActorID() + FIELD_SEP);
				out.print(a.getActorFirstName() + FIELD_SEP);
				out.print(a.getActorLastName()+FIELD_SEP);
				out.print(a.getActorGender()+FIELD_SEP);
				out.println(a.getActorBirthdate());
			}
			return true;
		} catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	@Override
	public List<Actor> findByLastName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


