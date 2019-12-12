package daos;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {

    T findById(int id) throws SQLException;

    List<T> findAll() throws SQLException;

    Boolean update(T dto);

    Boolean create(T dto);

    Boolean delete(int id);
}
