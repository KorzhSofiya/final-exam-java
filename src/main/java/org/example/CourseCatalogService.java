package org.example;

import java.util.HashMap;

public class CourseCatalogService implements CrudServ{
    private HashMap<Course, String> store = new HashMap<>();
    @Override
    public void create(Course course) {
        if(course.getCode().isEmpty())
            throw new BuisnessLogicException("Cannot create Course");
        store.put(course, course.getCode());
    }

    @Override
    public void delete(Course course) {
        store.remove(course);
    }
}
