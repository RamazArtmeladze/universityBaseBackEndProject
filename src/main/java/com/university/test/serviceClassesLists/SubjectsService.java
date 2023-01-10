package com.university.test.serviceClassesLists;

import com.university.test.model.SubjectsModel;
import com.university.test.repository.SubjectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectsService {

    public final SubjectsRepository subjectsRepository;

    public SubjectsModel saveSubjectsToDb (Long id, String name, String facultyName) {
        SubjectsModel subjectsModel = new SubjectsModel(id, name, facultyName);
        subjectsRepository.save(subjectsModel);
        return subjectsModel;
    }


}
