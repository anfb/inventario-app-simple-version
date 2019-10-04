package com.sv.inventario.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sv.inventario.domain.Equipment;

public interface IInventarioController {

	@RequestMapping(
			value = "/equipment",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.POST)
	public void createEquipment(Equipment equipment);
	
	@RequestMapping(
			value = "/equipment",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.PUT)
	public void updateEquipment(Equipment equipment);
	
	@RequestMapping(
			value = "/equipment/{codeEquipment}",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.GET)
	public Equipment searchEquipment(Long codeEquipment);
	
	@RequestMapping(
			value = "/equipment/{codeEquipment}",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.DELETE)
	public void deleteEquipment(Long codeEquipment);
	
	@RequestMapping(
			value = "/equipments",
			produces = {"application/json"},
			consumes = {"application/json"},
			method = RequestMethod.GET)
	public List<Equipment> listEquipments();
	
}
