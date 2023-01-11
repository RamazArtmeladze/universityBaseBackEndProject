package com.university.test.controller;

import com.university.test.model.LecturersModel;
import com.university.test.model.StudentsModel;
import com.university.test.model.SubjectsModel;
import com.university.test.serviceClassesLists.LecturersService;
import com.university.test.serviceClassesLists.StudentsService;
import com.university.test.serviceClassesLists.SubjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final StudentsService studentsService;
    @PostMapping("/students")
    public StudentsModel createStudents(@RequestParam Long id, @RequestParam String name, @RequestParam String surname, @RequestParam String facultyName) {
        return studentsService.saveStudentToDb(id, name, surname, facultyName);
    }
    private final LecturersService lecturersService;
    @PostMapping("/lecturers")
    public LecturersModel createLecturers(@RequestParam Long id, @RequestParam String name, @RequestParam String surname, @RequestParam String facultyName) {
        return lecturersService.saveLecturerToDb(id, name, surname, facultyName);
    }
    private final SubjectsService subjectsService;
    @PostMapping("/subjects")
    public SubjectsModel createSubjects(@RequestParam Long id, @RequestParam String name, @RequestParam String facultyName) {
        return subjectsService.saveSubjectsToDb(id, name, facultyName);
    }
}
