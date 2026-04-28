package org.example;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class CreateCom implements Command{
    private final CourseCatalogService catalogService;
    private static Scanner scanner = new Scanner(System.in);

    public CreateCom(CourseCatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public void name() {
        System.out.println("Create course");
    }

    @Override
    public void build() {
        log.info("Createing course...");
        System.out.println("For enterrupt enter 0");
        Course course = new Course();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        if(name.equals("0"))
            return;
        System.out.println("Enter code:");
         String code = scanner.nextLine();
        if(code.equals("0"))
            return;
        if(name!=null || !name.isEmpty() && code  != null || !code.isEmpty()){
            course.setName(name);
            course.setCode(code);
            catalogService.create(course);
        }else{
            throw new BuisnessLogicException("Cannot create course");
        }
    }
}
