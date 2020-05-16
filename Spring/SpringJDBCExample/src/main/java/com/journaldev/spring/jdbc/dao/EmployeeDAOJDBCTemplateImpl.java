package com.journaldev.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.journaldev.spring.jdbc.model.Employee;
import com.journaldev.spring.jdbc.rowmapper.RowMapperImpl;

/**
 * @author Robin
 * 	{@link: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html }
 * 	int <-- update(PreparedStatementCreator psc)
	Issue a single SQL update operation (such as an insert, update or delete statement) using 
		a PreparedStatementCreator to provide SQL and any required parameters.
	int <-- update(PreparedStatementCreator psc, KeyHolder generatedKeyHolder)
	Issue an update statement using a PreparedStatementCreator to provide SQL and any required parameters.
	protected int 	update(PreparedStatementCreator psc, PreparedStatementSetter pss)
	 
	int <-- update(String sql)
	Issue a single SQL update operation (such as an insert, update or delete statement).
	
	int <-- update(String sql, Object... args)
	Issue a single SQL update operation (such as an insert, update or delete statement) via a 
		prepared statement, binding the given arguments.
		
	int <-- update(String sql, Object[] args, int[] argTypes)
	Issue a single SQL update operation (such as an insert, update or delete statement) via a 
		prepared statement, binding the given arguments.
		
	int <-- update(String sql, PreparedStatementSetter pss)
	Issue an update statement using a PreparedStatementSetter to set bind parameters, with given SQL.
	
	<T> T <-- queryForObject(String sql, Object[] args, RowMapper<T> rowMapper)
	Query given SQL to create a prepared statement from SQL and a list of arguments to bind to the query, 
		mapping a single result row to a result object via a RowMapper.
		
	List<Map<String,Object>> <-- queryForList(String sql)
	Execute a query for a result list, given static SQL.
 *
 */
public class EmployeeDAOJDBCTemplateImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void save(Employee employee) {
		String query = "insert into Employee (id, name, role) values (?,?,?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {employee.getId(), employee.getName(), employee.getRole()};
		
		int out = jdbcTemplate.update(query, args);
		
		if(out !=0){
			System.out.println("Employee saved with id="+employee.getId());
		}else System.out.println("Employee save failed with id="+employee.getId());
	}

	public Employee getById(int id) {
		String query = "select id, name, role from Employee where id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//using RowMapper implementation class
		RowMapperImpl rowMapper = new RowMapperImpl();
		Employee emp = jdbcTemplate.queryForObject(query, new Object[]{id}, rowMapper);

		//using RowMapper anonymous class, we can create a separate RowMapper for reuse
		/*Employee emp = jdbcTemplate.queryForObject(query, new Object[]{id}, new RowMapper<Employee>(){

			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setRole(rs.getString("role"));
				return emp;
			}});*/
		
		return emp;
	}

	public void update(Employee employee) {
		String query = "update Employee set name=?, role=? where id=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		Object[] args = new Object[] {employee.getName(), employee.getRole(), employee.getId()};
		
		int out = jdbcTemplate.update(query, args);
		
		if(out !=0){
			System.out.println("Employee updated with id="+employee.getId());
		}else System.out.println("No Employee found with id="+employee.getId());
	}

	public void deleteById(int id) {

		String query = "delete from Employee where id=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int out = jdbcTemplate.update(query, id);
		
		if(out !=0){
			System.out.println("Employee deleted with id="+id);
		}else System.out.println("No Employee found with id="+id);
	}

	public List<Employee> getAll() {
		String query = "select id, name, role from Employee";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Employee> empList = new ArrayList<Employee>();

		List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);
		
		for(Map<String,Object> empRow : empRows){
			Employee emp = new Employee();
			emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
			emp.setName(String.valueOf(empRow.get("name")));
			emp.setRole(String.valueOf(empRow.get("role")));
			empList.add(emp);
		}
		return empList;
	}

}
