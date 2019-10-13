package com.sv.inventario.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import com.sv.inventario.domain.Equipment;
import com.sv.inventario.util.JDBCConnection;

public class InventarioRepository {

	public void createEquipment(Equipment equipment) {
		Connection connection = JDBCConnection.getConnection();
		
		String sql = "INSERT INTO equipment(modelEquipment, valEquipment, dtEquipment, typeEquipment)" 
				+ "VALUES('" +equipment.getModelEquipment()+ "'," +equipment.getValEquipment()+ ", '"+equipment.getDtEquipment()+"' , '"+equipment.getTypeEquipment()+"' )";			
	
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
	
	public void updateEquipment(Equipment equipment) {
		
		Connection connection = JDBCConnection.getConnection();
		
		String sql = "UPDATE equipment SET "
				+ "modelEquipment = '" +equipment.getModelEquipment() + "', "
				+ "valEquipment =" +equipment.getValEquipment() + ", "
				+ "dtEquipment= '" + equipment.getDtEquipment() + "', "
				+ "typeEquipment= '" + equipment.getTypeEquipment() + "' "
				+ " WHERE codeEquipment=" + equipment.getCodeEquipment();
		
		try {
				connection.setAutoCommit(false);
				Statement statement = connection.createStatement();
				
				statement.execute(sql);
				connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
	}
	
	public void deleteEquipment(Long codeEquipment) {
		
		Connection connection = JDBCConnection.getConnection();
		
		String sql = "DELETE FROM equipment WHERE codeEquipment=" + codeEquipment;
		
		try {
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(sql);
			connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public Equipment searchEquipment(Long codeEquipment) {
		Connection connection = JDBCConnection.getConnection();
		
		String sql = "SELECT * FROM equipment WHERE codeEquipment=" + codeEquipment;
		Equipment equipment = new Equipment();
		
		try {
			
			connection.setAutoCommit(false);
			
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			
			if (resultset.next()) {
				equipment.setCodeEquipment(resultset.getLong("codeEquipment"));
				equipment.setValEquipment(resultset.getBigDecimal("valEquipment"));
				equipment.setDtEquipment(resultset.getDate("dtEquipment").toLocalDate());
				equipment.setModelEquipment(resultset.getString("modelEquipment"));
			}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return equipment;
	}

	
}
