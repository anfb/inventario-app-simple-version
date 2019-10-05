package com.sv.inventario.api;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sv.inventario.domain.Equipment;
import com.sv.inventario.util.JDBCConnection;

@RestController
public class InventarioControllerImpl implements IInventarioController{

	@Override
	public void createEquipment(Equipment equipment) {
		String sql = "INSERT INTO equipment(modelEquipment, valEquipment, dtEquipment, typeEquipment)" 
					+ "VALUES('" +equipment.getModelEquipment()+ "'," +equipment.getValEquipment()+ ", '"+equipment.getDtEquipment()+"' , '"+equipment.getTypeEquipment()+"' )";			

		executeSql(sql);
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

	
	private void executeSql(String sql) {
		
		Connection connection = JDBCConnection.getConnection();
		
		try {
			connection.setAutoCommit(false);
			
			Statement statement = connection.createStatement();
			statement.execute(sql);
			
			connection.commit();
			
		} catch (SQLException e) {
			try {
				
				connection.rollback();
				
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		} finally {
			try {
				
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
