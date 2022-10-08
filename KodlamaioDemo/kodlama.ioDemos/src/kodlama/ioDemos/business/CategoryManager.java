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

	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category1.getName().equals(category.getName())) {
				throw new Exception("Kategori zaten kayıtlıdır farklı bir kurs giriniz.");
			}
			baseDao.addCategory(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}

		}

	}

}
