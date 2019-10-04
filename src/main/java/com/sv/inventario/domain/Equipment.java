package com.sv.inventario.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Equipment {
	
	private Long codeEquipment;
	private String modelEquipment;
	private BigDecimal valEquipment;
	private LocalDate dtEquipment;
	private String typeEquipment;
	
	
	public Long getCodeEquipment() {
		return codeEquipment;
	}
	public void setCodeEquipment(Long codeEquipment) {
		this.codeEquipment = codeEquipment;
	}
	public String getModelEquipment() {
		return modelEquipment;
	}
	public void setModelEquipment(String modelEquipment) {
		this.modelEquipment = modelEquipment;
	}
	public BigDecimal getValEquipment() {
		return valEquipment;
	}
	public void setValEquipment(BigDecimal valEquipment) {
		this.valEquipment = valEquipment;
	}
	public LocalDate getDtEquipment() {
		return dtEquipment;
	}
	public void setDtEquipment(LocalDate dtEquipment) {
		this.dtEquipment = dtEquipment;
	}
	public String getTypeEquipment() {
		return typeEquipment;
	}
	public void setTypeEquipment(String typeEquipment) {
		this.typeEquipment = typeEquipment;
	}
	

}
