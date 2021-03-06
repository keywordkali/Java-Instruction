package db;

import java.util.List;

//p479 //<T> means any object type
public interface DAO<T> {
 T get(String code);
 List<T> getAll();
 boolean add(T t);
 boolean update(T t);
 boolean delete(T t);
 
}
