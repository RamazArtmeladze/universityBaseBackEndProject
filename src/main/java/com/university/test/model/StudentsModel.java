package com.university.test.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor

@AllArgsConstructor
public class StudentsModel {
    @Id
    Long id;
    String name;
    String surname;
    String facultyName;
}
