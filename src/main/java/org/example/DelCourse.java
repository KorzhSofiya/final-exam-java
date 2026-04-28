package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;
@Slf4j
public class DelCourse implements Command{
    private final CourseCatalogService catalogService;
    private static Scanner scanner = new Scanner(System.in);

    public DelCourse(CourseCatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public void name() {
        System.out.println("Delete course");
    }

    @Override
    public void build() {
        log.info("Starting delete course command");
        System.out.println("Enter course id:");
    }
}
