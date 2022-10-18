package kodlama.ioDemos.business;

import kodlama.ioDemos.core.logging.Logger;
import kodlama.ioDemos.dataAccess.BaseDao;
import kodlama.ioDemos.entities.Category;

public class CategoryManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(BaseDao baseDao, Logger[] loggers, Category[] categories) {
		this.baseDao = baseDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public CategoryManager() {
	}

	public void add(Category category) throws Exception {
		for (Category myCategory : categories) {
			if (category.getName() == myCategory.getName()) {
				throw new Exception("Kategori ismi kayıtlıdır.");
			}

		}

		baseDao.addCategory(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());

		}
	}
}
