package vanny.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import vanny.test.entity.Brand;
import vanny.test.exception.ApiException;
import vanny.test.exception.ResourceNotfoundException;
import vanny.test.repository.BrandRepository;
import vanny.test.serviceimpl.BrandServiceImpl;

@Service
public class BrandService implements BrandServiceImpl {

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return this.brandRepository.save(brand);
	}

	@Override
	public Brand getById(Long id) {	
		return brandRepository.findById(id).orElseThrow(()-> new ResourceNotfoundException("Brand", id));
	}

	@Override
	public List<Brand> findAll() {
		return null;
	}

	@Override
	public Brand update(Long id, Brand brn) {
		Brand br= getById(id);
		br.setBrandName(brn.getBrandName());
		return brandRepository.save(br);
	}



}
