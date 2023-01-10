package com.university.test.serviceClassesLists;

import com.university.test.model.LecturersModel;
import com.university.test.repository.LecturersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class LecturersService {
    public final LecturersRepository LecturersRepository;

    public LecturersModel saveLecturerToDb (Long id, String name, String surname, String facultyName) {
        LecturersModel lecturersModel = new LecturersModel(id, name, surname, facultyName);
        LecturersRepository.save(lecturersModel);
        return lecturersModel;
    }



}
