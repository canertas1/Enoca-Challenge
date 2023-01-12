package proje.enocaproje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proje.enocaproje.business.abstracts.CategoryService;
import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.core.utulities.result.SuccessDataResult;
import proje.enocaproje.core.utulities.result.SuccessResult;
import proje.enocaproje.dataAccess.abstracts.CategoryDao;
import proje.enocaproje.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{

	

	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao=categoryDao;
	}
	
	
	
	@Override
	public Result add(Category category) {
		this.categoryDao.save(category);
		return new SuccessResult("Kategori Başarıyla Eklendi.");
	}

	@Override
	public Result delete(Category category) {
		this.categoryDao.delete(category);
		return new SuccessResult("Kategori Başarıyla Silindi");
	}

	@Override
	public DataResult<List<Category>> getAll() {
		
		return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"Kategoriler Başarıyla listelendi");
	}

	@Override
	public Result update(Category category) {
		this.categoryDao.save(category);
		return new SuccessResult("Kategori Başarıyla Güncellendi.");
	}
	
	

}
