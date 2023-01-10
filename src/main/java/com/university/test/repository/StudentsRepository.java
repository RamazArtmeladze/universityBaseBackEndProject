package com.university.test.repository;

import com.university.test.model.StudentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<StudentsModel, Long> {
}
