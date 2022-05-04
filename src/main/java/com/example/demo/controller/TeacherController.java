package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Teacher;
import com.example.demo.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	TeacherService service;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("addTeacher")
	public String addTeacher(Teacher teacher) {
		service.addTeacher(teacher);
		return "home.jsp";
	}
	@RequestMapping("getTeacher")
	public ModelAndView getTeacher(Integer id) {
		ModelAndView mv = new ModelAndView();
		Teacher t = service.getTeacher(id);
		mv.addObject(t);
		mv.setViewName("display.jsp");
		return mv;
	}
	@RequestMapping("updateTeacher")
	public String updateTeacher(Teacher teacher) {
		service.updateTeacher(teacher);
		return "home.jsp";
	}
	@RequestMapping("deleteTeacher")
	public String deleteTeacher(Integer id) {
		service.deleteTeacher(id);
		return "home.jsp";
	}
//	@RequestMapping("getAll")
//	public ModelAndView getTeachers() {
//		ModelAndView mv = new ModelAndView();
//		List<Teacher> list = service.getTeachers();
//		mv.addObject(list);
//		mv.setViewName("display.jsp");
//		return mv;
//	}
}
