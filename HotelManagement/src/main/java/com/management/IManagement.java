package com.management;

import com.model.Room;

import java.util.List;

public interface IManagement<T> {
    void add(T t);
    void delete(Long id) throws Exception;
    void update(Long id) throws Exception;

    void update(Long id, T t) throws Exception;

    T findByID(Long id) throws Exception;
    List<T> findAll();
    int findIndexById (Long id) throws Exception;
}
