package kodlama.ioDemos.business;

import java.util.Iterator;

import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.BaseDao;
import kodlama.ioDemos.entities.Category;

public class CategoryManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(BaseDao baseDao, Logger[] loggers, Category[] categories) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public CategoryManager() {
	}

	public void add(Category category) throws Exception {
		for (Category cat : categories) {
			if (category.getName() == cat.getName()) {
				throw new Exception("category name exists");
			}

		}
		baseDao.addCategory(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());

		}
	}
}
