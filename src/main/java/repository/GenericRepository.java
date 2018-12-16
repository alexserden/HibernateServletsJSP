package repository;

import java.util.List;

public interface GenericRepository <T, ID> {
    void create(T t);

    T getById(ID id);

    void update(T t);

    void delete(ID id);

    List<T> getAll();
}
