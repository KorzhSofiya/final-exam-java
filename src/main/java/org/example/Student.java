package org.example;

import lombok.Data;

@Data
public class Student {
    private String pib;
    private String id;
    private Course course;
    private Enrollment enrollment;
}
