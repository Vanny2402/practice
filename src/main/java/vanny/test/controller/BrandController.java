package vanny.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vanny.test.dto.BrandDTO;
import vanny.test.entity.Brand;
import vanny.test.mapper.Mapper;
import vanny.test.service.BrandService;

@RestController
@RequestMapping("Brands")
public class BrandController {

	@Autowired
	 private BrandService brandService;
	
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody BrandDTO dto){
		Brand brn= Mapper.toBrand(dto); 	
		brn=this.brandService.create(brn);
		return ResponseEntity.ok(Mapper.fromEntity(brn));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>getOneBrand(@PathVariable("id") Long  ids){
		Brand byId = brandService.getById(ids);
		return ResponseEntity.ok(Mapper.fromEntity(byId));
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?>update(@PathVariable ("id") Long id, @RequestBody BrandDTO request){
		
		Brand brn=Mapper.toBrand(request);
		Brand update = brandService.update(id, brn);
		
		return ResponseEntity.ok(Mapper.fromEntity(update));
	}
}
