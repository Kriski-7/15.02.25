package org.example.edu.repository;

import org.example.edu.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }
    public long save(Student st){
        studentList.add(st);
                return st.getId();
    }
    public Student getById(Long id) {
        Student findStudent = null;

        for (Student st: studentList) {
            if (st.getId() == id) {
                findStudent = st;
            }
        }
        return findStudent;
    }
    public void deleteById(Long id) {
    if(studentList.get(1).getid() == id),{
    for (int 1 = 0; 1< studentList.size();1++){
    }
    studentList.remove
}



