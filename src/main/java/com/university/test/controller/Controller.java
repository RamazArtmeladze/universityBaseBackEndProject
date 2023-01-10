package com.university.test.controller;

import com.university.test.model.StudentsModel;
import com.university.test.serviceClassesLists.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final StudentsService studentsService;
    @PostMapping("/result")
    public StudentsModel createStudents(@RequestParam Long id, @RequestParam String name, @RequestParam String surname, @RequestParam String facultyName) {
        return studentsService.saveStudentToDb(id, name, surname, facultyName);
    }
}
