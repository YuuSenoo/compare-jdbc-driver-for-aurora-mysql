package com.senoo.awsjdbcdriversample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}
