package db;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import business.Actor;


public class ActorTextFile implements DAO<Actor> {
	private List<Actor> actors = null;
	private Path actorsPath = null;
	private File actorsFile = null;
	private final String FIELD_SEP = "\t";

	public ActorTextFile() { 
		actorsPath = Paths.get("actors.txt");
		actorsFile = actorsPath.toFile();
		actors = getAll();
	}

	public Actor get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all products from text file if our list is null
	@Override
	public List<Actor> getAll() {
		if (actors != null) {
			return actors;
		}
		actors = new ArrayList<>();
		if (Files.exists(actorsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(actorsFile))) {

				// read products from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					int    actorID = Integer.parseInt(fields[0]);
					String actorFirstName = fields[1];
					String actorLastName = fields[2];
					String actorGender = fields[3];
					String actorBirthdate = fields [4];
					LocalDate bd = LocalDate.parse(actorBirthdate);
					Actor a = new Actor(actorID, actorFirstName, actorLastName, actorGender, bd);
					actors.add(a);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(actorsPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return actors;
	}

	@Override

	public boolean add(Actor a) {
		actors.add(a);
		return saveAll();
	}

	@Override
	public boolean update(Actor a) {
		// get old product and remove it
		Actor oldActor = this.get(a.getActorID());
		int i = actors.indexOf(oldActor);
		actors.remove(i);
		actors.add(i, a);
		return saveAll();
	}

	@Override
	public boolean delete(Actor a) {
		actors.remove(a);
		return saveAll();
	}

	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(actorsFile)))) {
			// write all products in the list to the file
			for (Actor a : actors) {
				out.print(a.getActorID() + FIELD_SEP);
				out.print(a.getActorFirstName() + FIELD_SEP);
				out.println(a.getActorFirstName());
				out.println(a.getActorGender());
				out.println(a.getActorBirthdate());
			}
			return true;
		} catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	@Override
	public Actor get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
