package com.cfl.dao;

import com.cfl.comment.PageQuery;
import com.cfl.comment.StatusQuery;

import java.util.List;

/**
 *
 * @param <T>
 */
public interface BaseDAO<T> {

    public T queryById(long id);

    public void update(T t);

    public void add(T t);

    public void delete(long id);

    public List<T> pagelist(PageQuery pageQuery);

    public void updateStatus(StatusQuery statusQuery);

    public int count();

    public List<T> listAll();

}
