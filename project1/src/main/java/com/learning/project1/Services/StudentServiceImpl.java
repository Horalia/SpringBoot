//service does service formatter from DOA information
package com.learning.project1.Services;

import java.util.HashMap;
import java.util.List;

import com.learning.project1.Student;
import com.learning.project1.Daos.StudentDao;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDAO;

    @Override
    public String jsonReturn() {
        List<Student> listStudent = studentDAO.retrieveAllStudents();
        HashMap<String,String > dictStudent = new HashMap<>();
        for(Student student: listStudent){
            dictStudent.put(student.getName(),student.getPassportNumber());
       
        }
        return dictStudent.toString();
    }

    /**
     * @return the studentDAO
     */
    public StudentDao getStudentDAO() {
        return studentDAO;
    }

    /**
     * @param studentDAO the studentDAO to set
     */
    public void setStudentDAO(StudentDao studentDAO) {
        this.studentDAO = studentDAO;
    }

}