package com.sv.inventario.service;

import java.util.List;

import com.sv.inventario.domain.Equipment;

public interface IInventarioService {

	public void createEquipment(Equipment equipment);
	public void updateEquipment(Equipment equipment);
	public void deleteEquipment(Equipment equipment);
	public Equipment findByCodeEquipment(Equipment equipment);
	public List<Equipment> findAllEquipment();
	
}
