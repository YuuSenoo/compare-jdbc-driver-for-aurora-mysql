package com.senoo.mariadbjdbcdriversample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentsService {

    final StudentsRepository studentsRepository;

    @Transactional(readOnly = true)
    public List<Students> getStudents() {
        return studentsRepository.findAll();
    }

    @Transactional
    public Students postStudent(Students students) {
        return studentsRepository.save(students);
    }

}
