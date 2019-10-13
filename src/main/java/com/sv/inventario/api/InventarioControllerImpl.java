package com.sv.inventario.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sv.inventario.domain.Equipment;

@RestController
public class InventarioControllerImpl implements IInventarioController{

	@Override
	public void createEquipment(Equipment equipment) {
		
	}

	@Override
	public void updateEquipment(Equipment equipment) {
		
	}

	@Override
	public Equipment searchEquipment(Long codeEquipment) {
		return null;
	}

	@Override
	public void deleteEquipment(Long codeEquipment) {
		
	}

	@Override
	public List<Equipment> listEquipments() {
		return null;
	}


}
