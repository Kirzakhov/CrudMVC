package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}
