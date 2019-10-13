package com.sv.inventario.service;

import java.util.List;

import com.sv.inventario.domain.Equipment;
import com.sv.inventario.repository.InventarioRepository;

public class InventarioServiceImpl implements IInventarioService{
	
	
	private InventarioRepository repository;

	@Override
	public void createEquipment(Equipment equipment) {
		if (equipment != null) {
			repository.createEquipment(equipment);
		}
	}

	@Override
	public void updateEquipment(Equipment equipment) {
		
	}

	@Override
	public void deleteEquipment(Equipment equipment) {
		
	}

	@Override
	public Equipment findByCodeEquipment(Equipment equipment) {
		return null;
	}

	@Override
	public List<Equipment> findAllEquipment() {
		return null;
	}

}
