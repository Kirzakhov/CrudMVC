package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	TeacherRepository repo;
	
	public void addTeacher(Teacher teacher) {
		repo.save(teacher);
		
	}

	public Teacher getTeacher(Integer id) {
		Teacher t = repo.findById(id).orElse(new Teacher());
		return t;
	}

	public void updateTeacher(Teacher teacher) {
		boolean b = repo.existsById(teacher.getId());
		if(b)
			repo.save(teacher);
		
	}

	public void deleteTeacher(Integer id) {
		boolean b = repo.existsById(id);
		if(b)
			repo.deleteById(id);
		
	}

//	public List<Teacher> getTeachers() {
//		List<Teacher> list = (List<Teacher>) repo.findAll();
//		return list;
//	}

}
