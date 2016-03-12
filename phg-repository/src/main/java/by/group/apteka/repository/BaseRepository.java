package by.group.apteka.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseRepository<ID, T> implements IBaseRepository<ID, T> {

    /**
     * Sql Session Template.
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    protected SqlSessionTemplate getTemplate() {
        return sqlSessionTemplate;
    }

    @Override
    public T findById(ID id) {
        return getTemplate().selectOne(getNamespace() + ".findById", id);
    }

    @Override
    public void update(ID id, T object) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", id);
        map.put("object", object);
        getTemplate().update(getNamespace() + ".update", map);
    }

    @Override
    public void insert(T object) {
        getTemplate().insert(getNamespace() + ".insert", object);
    }

    @Override
    public void delete(ID id) {
        getTemplate().delete(getNamespace() + ".delete", id);
    }

    @Override
    public boolean exists(ID id) {
        T result = findById(id);
        return null != result;
    }

    protected abstract String getNamespace();
}
