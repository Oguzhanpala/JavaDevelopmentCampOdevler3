package kodlama.ioDemos.business;

import java.util.Iterator;

import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.BaseDao;
import kodlama.ioDemos.entities.Category;
import kodlama.ioDemos.entities.Course;

public class CourseManager {

	private BaseDao baseDao;
	private Logger[] loggers;
	private Course[] courses;

	// constructor
	public CourseManager(BaseDao baseDao, Logger[] loggers, Course[] courses) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı sıfırdan küçük olamaz");
		}
		for (Course course1 : courses) {
			if (course1.getName().equals(course.getName())) {
				throw new Exception("Kurs zaten kayıtlıdır.");

			}

		}

		baseDao.addCourse(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

}
