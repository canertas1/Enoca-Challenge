package proje.enocaproje.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import proje.enocaproje.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
