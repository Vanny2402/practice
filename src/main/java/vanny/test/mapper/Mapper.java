package vanny.test.mapper;

import vanny.test.dto.BrandDTO;
import vanny.test.entity.Brand;

public class Mapper {

	public static Brand toBrand(BrandDTO dto) {
		
		Brand brn=new Brand();
		brn.setId(dto.getId());
		brn.setBrandName(dto.getBrandName());
		
		return brn;
	}
	
	public static BrandDTO fromEntity(Brand brn) {
		BrandDTO dto=new BrandDTO();
		dto.setId(brn.getId());
		dto.setBrandName(brn.getBrandName());
		
		return dto;
	}
	
}
