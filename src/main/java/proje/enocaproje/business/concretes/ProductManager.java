package proje.enocaproje.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proje.enocaproje.business.abstracts.ProductService;
import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.core.utulities.result.SuccessDataResult;
import proje.enocaproje.core.utulities.result.SuccessResult;
import proje.enocaproje.dataAccess.abstracts.ProductDao;
import proje.enocaproje.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}
	
	
	@Override
	public Result add(Product product) {
		
		this.productDao.save(product);
	
		return new SuccessResult("Ürün Başarıyla Eklendi");
	}

	@Override
	public Result delete(Product product) {
		
		this.productDao.delete(product);
		
		return new SuccessResult("Ürün Başarıyla Silindi");
		
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Ürünler Başarıyla Listelendi,");
	}

	@Override
	public Result update(Product product) {
		
		this.productDao.save(product);
		
		return new SuccessResult("Ürün Başarıyla Güncellendi");
	}
	
	
	

}
