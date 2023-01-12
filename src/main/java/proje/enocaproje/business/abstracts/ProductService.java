package proje.enocaproje.business.abstracts;

import java.util.List;

import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.entities.concretes.Product;

public interface ProductService {
	
	Result add(Product product);
	Result delete(Product product);
	DataResult<List<Product>> getAll();
	Result update(Product product);

}
