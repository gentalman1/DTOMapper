package com.psp.dtomapper.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.psp.dtomapper.dto.StudentDTO;
import com.psp.dtomapper.entity.Student;
import com.psp.dtomapper.repository.StudentRepository;
import com.psp.dtomapper.util.BasedClass;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	private final BasedClass basedClass;

	public StudentServiceImpl(StudentRepository studentRepository, BasedClass basedClass) {
		this.studentRepository = studentRepository;
		this.basedClass = basedClass;
	}

	public Object addStudent(StudentDTO studentDTO) {
		Student student = studentRepository.save(basedClass.dtoToEntity(studentDTO, Student.class));
		return student.getStudentName() + " Added!!";
	}

	public Object getStudent(Long id) throws Exception {
		Optional<Student> student = studentRepository.findById(id);
		if (!student.isPresent()) {
			throw new Exception("this student is not present!!");
		}
		return basedClass.entityToDto(student.get(), StudentDTO.class);
	}

	public Object getAll() {
		List<StudentDTO> studentsDto = studentRepository.findAll().stream()
				.map(stu -> basedClass.entityToDto(stu, StudentDTO.class)).collect(Collectors.toList());
		return studentsDto;
	};

}
