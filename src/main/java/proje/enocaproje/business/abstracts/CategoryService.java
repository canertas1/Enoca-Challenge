package proje.enocaproje.business.abstracts;

import java.util.List;

import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.entities.concretes.Category;

public interface CategoryService {
	Result add(Category category);
	Result delete(Category category);
	DataResult<List<Category>> getAll();
	Result update(Category category);

}
