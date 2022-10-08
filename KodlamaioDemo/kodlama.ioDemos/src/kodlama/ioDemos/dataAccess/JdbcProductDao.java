package kodlama.ioDemos.dataAccess;

import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public class JdbcProductDao implements BaseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println(course.getName() + " " + "Kursu Jdbc ile veritabanına eklenmiştir.");

	}

	@Override
	public void addCategory(Category category) {
		System.out.println(category.getName() + " " + "Kategorisi Jdbc ile veritabanına eklenmiştir.");

	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ "Eğitmeni Jdbc ile veritabanına eklenmiştir.");

	}

}
