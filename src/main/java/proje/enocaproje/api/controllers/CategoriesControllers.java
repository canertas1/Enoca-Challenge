package proje.enocaproje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proje.enocaproje.business.abstracts.CategoryService;
import proje.enocaproje.core.utulities.result.DataResult;
import proje.enocaproje.core.utulities.result.Result;
import proje.enocaproje.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesControllers {


	private CategoryService categoryService;
	
	@Autowired
	public CategoriesControllers(CategoryService categoryService) {
		
		this.categoryService = categoryService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Category category) {
		
		return this.categoryService.add(category);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Category category) {
		
		return this.categoryService.delete(category);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Category>> getAll() {
		
		
		return this.categoryService.getAll();
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Category category) {
		
		
		return this.categoryService.update(category);
	}
	
	
	
	
	
	
	
	
	
}
