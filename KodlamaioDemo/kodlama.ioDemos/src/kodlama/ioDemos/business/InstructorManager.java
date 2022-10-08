package kodlama.ioDemos.business;

import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.BaseDao;
import kodlama.ioDemos.entities.Instructor;

public class InstructorManager {

	private BaseDao baseDao;
	private Logger[] loggers;

	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		baseDao.addInstructor(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName()+" "+instructor.getLastName());
		}

	}

}
