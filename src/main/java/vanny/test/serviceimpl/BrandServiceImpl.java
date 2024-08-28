package vanny.test.serviceimpl;

import java.util.List;

import vanny.test.entity.Brand;

public interface BrandServiceImpl {

	Brand create(Brand brand);
	Brand getById(Long id);
	List<Brand> findAll();
	Brand update(Long id,Brand brn);
};
