package com.learning.project1.Daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.learning.project1.Student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> retrieveAllStudents() {

        String sqlStatement = "SELECT * FROM STUDENT";

        List<Student> results = jdbcTemplate.query(sqlStatement, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getLong("ID"));
                student.setName(rs.getString("NAME"));
                student.setPassportNumber(rs.getString("PASSPORT_NUMBER"));
                return student;
            }

        });

      return results;

    }

    /**
     * @return the jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



}