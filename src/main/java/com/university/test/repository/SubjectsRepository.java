package com.university.test.repository;

import com.university.test.model.SubjectsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectsRepository extends JpaRepository<SubjectsModel, Long> {
}
