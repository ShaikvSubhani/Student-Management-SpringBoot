package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public  String addStudent(Student student)
    {
        return studentRepository.addStudent(student);
    }

    public String deleteStudent(int admNo)
    {
        return studentRepository.deleteStudent(admNo);
    }

    public Student getStudent(int admNo)
    {
        return studentRepository.getStudent(admNo);
    }

    public String putStudent(int id,int age)
    {
        return studentRepository.putStudent(id,age);
    }
}
