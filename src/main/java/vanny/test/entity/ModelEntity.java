package vanny.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="models")
public class ModelEntity {

	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="modelName",length = 30,nullable = false)
	private String modelName;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Brand brand;
	
	
}
