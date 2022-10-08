package kodlama.ioDemos.dataAccess;

import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public class JdbcProductDao implements BaseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println("Kurs Jdbc ile veritabanına eklenmiştir.");
		
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Kategori Jdbc ile veritabanına eklenmiştir.");
		
	}

	@Override
	public void addInstructor(Instructor ınInstructor) {
		System.out.println("Eğitmen Jdbc ile veritabanına eklenmiştir.");
		
	}
	

}
