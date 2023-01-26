package com.avengers.studentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db=new HashMap<>();

    //get student
    public Student getStudent(int admNo)
    {
        return db.get(admNo);
    }

    //add student
    public String addStudent(Student student)
    {
        int admNo= student.getAdmNo();
        db.put(admNo,student);

        return "added successfully";

    }

    //delete student
    public String deleteStudent(int admNo)
    {
        if(!db.containsKey(admNo))
        {
            return "invalid id";
        }
        db.remove(admNo);
        return "deleted successfully";
    }
    //update student
    public String putStudent(int admNo, int age)
    {
        if(!db.containsKey(admNo))
            return null;
        db.get(admNo).setAge(age);
        return "updated successfully";
    }

}
