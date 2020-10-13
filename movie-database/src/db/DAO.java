package db;

import java.util.List;

import business.Actor;
import business.Movie;

//p479 //<T> means any object type
public interface DAO<T> {
 T get(int ID);
 List<T> getAll();
 List<T> findByLastName(String string);
 boolean add(T t);
 boolean update(T t);
 boolean delete(T t);



 
}
