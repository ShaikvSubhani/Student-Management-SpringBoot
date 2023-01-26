package com.avengers.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

        @Autowired
        StudentService studentService;
        //get information

        @GetMapping("/get_student")
        public ResponseEntity getStudent(@RequestParam("q") int admNo)
        {
            Student student=studentService.getStudent(admNo);
            return new ResponseEntity<>(student, HttpStatus.FOUND);
        }


        //adding the information
        @PostMapping("/add_student")
        public ResponseEntity addStudent(@RequestBody Student student)
        {
            String result=studentService.addStudent(student);
            return new ResponseEntity<>(result,HttpStatus.FOUND);
        }

        //updating the student information
        @PutMapping("/update_student")
        public ResponseEntity putStudent(@RequestParam("admNo") int admNo,@RequestParam("age") int age)
        {
            String result= studentService.putStudent(admNo, age);
            if(result==null)
                    return new ResponseEntity<>("Invalid id",HttpStatus.NOT_FOUND);
            else
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        //deleting the student information
        @DeleteMapping("/delete_student")
        public ResponseEntity deleteStudent(@RequestParam("q")int admNo)
        {
            String result=studentService.deleteStudent(admNo);
            if(result.equals("invalid id"))
                    return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
            else
                    return new ResponseEntity<>(result,HttpStatus.FOUND);
        }

}
