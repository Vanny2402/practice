package vanny.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vanny.test.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>{

	
}
