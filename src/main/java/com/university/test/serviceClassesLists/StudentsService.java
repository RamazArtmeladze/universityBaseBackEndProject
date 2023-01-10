package com.university.test.serviceClassesLists;

import com.university.test.model.StudentsModel;
import com.university.test.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentsService {

    public final StudentsRepository studentsRepository;

    public StudentsModel saveStudentToDb (Long id, String name,String surname, String facultyName) {
        StudentsModel studentsModel = new StudentsModel(id, name, surname, facultyName);
        studentsRepository.save(studentsModel);
        return studentsModel;
    }
}
