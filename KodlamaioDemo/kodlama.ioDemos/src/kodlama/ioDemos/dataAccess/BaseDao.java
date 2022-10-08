package kodlama.ioDemos.dataAccess;

import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public interface BaseDao {
	
	void addCourse(Course course);
	void addCategory(Category category);
	void addInstructor(Instructor instructor);

}
