package by.group.apteka.repository;

/**
 * Base repository interface.
 * @param <ID> stored object primary key
 * @param <T> stored object type
 * <p/>
 * Date: Март 12, 2016
 */
public interface IBaseRepository<ID, T> {

    T findById(ID id);

    void update(ID id, T object);

    void insert(T object);

    void delete(ID id);

    boolean exists(ID id);
}
