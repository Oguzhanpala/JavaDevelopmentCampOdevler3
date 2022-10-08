package kodlama.ioDemos.dataAccess;

import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public class HibernateProductDao implements BaseDao{

	@Override
	public void addCourse(Course course) {
		System.out.println("Kurs Hibernate ile veritabanına eklenmiştir.");
		
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Kategori Hibernate ile veritabanına eklenmiştir.");
		
	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklenmiştir.");
		
	}

}
