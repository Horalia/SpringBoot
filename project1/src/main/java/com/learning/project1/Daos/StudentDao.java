package com.learning.project1.Daos;

import java.util.List;

import com.learning.project1.Student;

public interface StudentDao {
    List<Student> retrieveAllStudents();
}