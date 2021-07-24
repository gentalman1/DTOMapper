package com.psp.dtomapper.service;

import com.psp.dtomapper.dto.StudentDTO;

public interface StudentService {

	Object addStudent(StudentDTO studentDTO);

	Object getStudent(Long id) throws Exception;

	Object getAll();

}
