package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{
private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public Department findById(Integer id) {
		
	}

	@Override
	public List<Department> findAll() {}

	@Override
	public void insert(Department obj) {}

	@Override
	public void update(Department obj) {}

	@Override
	public void deleteById(Integer id) {}
}
