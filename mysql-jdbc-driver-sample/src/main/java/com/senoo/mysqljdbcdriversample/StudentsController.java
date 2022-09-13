package com.senoo.mysqljdbcdriversample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentsController {

    final StudentsService studentsService;

    @GetMapping
    public List<Students> getStudents() {
        return studentsService.getStudents();
    }

    @PostMapping
    public Students postStudent(@RequestBody Students students) {
        return studentsService.postStudent(students);
    }

}
