package org.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.module.ModuleDescriptor;

public class AppTest

{
    @Test
    void returnBuissnessLogicException(){
    CourseCatalogService catalogService = new CourseCatalogService();
    Course course = new Course();
    course.setName("AOS");
    course.setCode("");
    catalogService.create(course);

}
}
