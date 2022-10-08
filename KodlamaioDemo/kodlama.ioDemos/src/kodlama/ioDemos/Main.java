package kodlama.ioDemos;

import kodlama.ioDemos.business.CategoryManager;
import kodlama.ioDemos.business.CourseManager;
import kodlama.ioDemos.business.InstructorManager;
import kodlama.ioDemos.core.logging.DatabaseLogger;
import kodlama.ioDemos.core.logging.FileLogger;
import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.HibernateProductDao;
import kodlama.ioDemos.dataAccess.JdbcProductDao;
import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;
import kodlama.ioDemos.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Programlamaya giriş için temel kurs");
		course1.setPrice(1000);
		/*-- iki şekildede göstermek istedim ama yukarıdaki tercih edilir. --*/
		Course course2= new Course(2,"Yazılım geliştirici kampı",50);
		//Burada kursları diziye atadım.
		Course[] courses = new Course[] {course2};
		/*------------------------------------------------------------*/
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		/*-- iki şekildede göstermek istedim ama yukarıdaki tercih edilir. --*/
		Category category2 = new Category(2,"Tümü");
		//Burada kategorileri diziye atadım.
		Category[] categories= new Category[] {category1,category2};
		/*------------------------------------------------------------*/
		Instructor instructor = new Instructor();
		instructor.setFirstName("Oğuzhan");
		instructor.setLastName("Pala");
		/*------------------------------------------------------------*/
		Logger[] loggers = new Logger[] {new DatabaseLogger(),new FileLogger()};
		
		
		CourseManager courseManager = new CourseManager(new HibernateProductDao(),loggers,courses);
		courseManager.add(course1);
		
		CategoryManager categoryManager = new CategoryManager(new JdbcProductDao(), loggers,categories);
		categoryManager.add(category1);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcProductDao(),loggers);
		instructorManager.add(instructor);

	}

}
