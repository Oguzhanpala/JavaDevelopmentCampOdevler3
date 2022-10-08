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
		
		Course[] courses = new Course[] {course1,course2}; //Burada kursları diziye atadım.
		/*----------------------------------------------------------------------*/
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		/*-- iki şekildede göstermek istedim ama yukarıdaki tercih edilir. --*/
		Category category2 = new Category(2,"Sql");

		Category[] categories= new Category[] {category1,category2}; //Burada kategorileri diziye atadım.
		/*----------------------------------------------------------------------*/
		Instructor instructor = new Instructor();
		/*------------------------------------------------------------*/
		Logger[] loggers = new Logger[] {new DatabaseLogger(),new FileLogger()};
		
		
		CourseManager courseManager = new CourseManager(new HibernateProductDao(),loggers,courses);
		courseManager.add(new Course(3,"Java+React geliştirme",200));
		
		CategoryManager categoryManager = new CategoryManager(new JdbcProductDao(), loggers,categories);
		categoryManager.add(new Category(2,"Yazılım "));
		
		InstructorManager instructorManager = new InstructorManager(new JdbcProductDao(),loggers);
		instructorManager.add(new Instructor("Oguzhan","Pala"));

	}

}
