package proje.enocaproje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import proje.enocaproje.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	

}
