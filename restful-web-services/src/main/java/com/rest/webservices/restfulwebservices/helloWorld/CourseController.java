package com.rest.webservices.restfulwebservices.helloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/course")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(0, "abc", "xyz"),
				new Course(1, "abc1", "xyz1"),
				new Course(2, "abc2", "xyz2")
				);
		
	}

}
