package com.university.test.repository;

import com.university.test.model.LecturersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturersRepository extends JpaRepository<LecturersModel, Long> {

}
