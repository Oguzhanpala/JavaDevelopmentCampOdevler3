package kodlama.ioDemos.business;

import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.BaseDao;
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

		for (Course cours : courses) {
			if (cours.getName().equals(course.getName())) {
				throw new Exception("Kurs zaten kayıtlıdır.");
			}

		}

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı sıfırdan küçük olamaz");
		}

		baseDao.addCourse(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

}
