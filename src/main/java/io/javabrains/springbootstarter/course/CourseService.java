package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	  
	@Autowired
	private CourseRepository courseRepository;
//	private List<Topic> topics = 
//    new ArrayList<> (Arrays.asList(new Topic("Spring Framework", "Sring Framework Description", "Spring ")));
//    
//	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
//		return topics;
	}
	public Optional<Course> getCourse(String id)
	{
		return courseRepository.findById(id);
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addCourse(Course course) {
	 courseRepository.save(course);
//		topics.add(topic);
		
	}
	public void updateCourse(Course course) {
		
	   courseRepository.save(course);
	
//		for(int i = 0 ; i< topics.size(); i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//			{
//				topics.set(i, topic);
//				return;
//			}
//		}
		
	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
//		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
