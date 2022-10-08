package kodlama.ioDemos.dataAccess;

import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public class HibernateProductDao implements BaseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println(course.getName() + " " + "Kursu Hibernate ile veritabanına eklenmiştir.");

	}

	@Override
	public void addCategory(Category category) {
		System.out.println(category.getName() + " " + "Kategorisi Hibernate ile veritabanına eklenmiştir.");

	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " "
				+ "Eğitmeni Hibernate ile veritabanına eklenmiştir.");

	}

}
