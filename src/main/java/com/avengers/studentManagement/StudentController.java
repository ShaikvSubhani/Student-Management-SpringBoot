package com.avengers.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

        Map<Integer,Student> db=new HashMap<>();

        //get information
        @GetMapping("/get_student")
        public Student getStudent(@RequestParam("q") int admNo)
        {
            return db.get(admNo);
        }


        //adding the information
        @PostMapping("/add_student")
        public String addStudent(@RequestBody Student student)
        {
            int admNo= student.getAdmNo();
            db.put(admNo,student);

            return "Student added successfully";
        }

        //updating the student information
//        @PutMapping("/put_student")
//        public String putStudent(@RequestParam("q") int admNo,@RequestParam("q") String name,@RequestParam("q") int age,@RequestParam("q")String state)
//        {
//            db.put(admNo,);
//            return "updated successfully";
//        }
        //deleting the student information
        @DeleteMapping("/delete_student")
        public String deleteStudent(@RequestParam("q")int admNo)
        {
            db.remove(admNo);
            return "deleted successfully";
        }

}
