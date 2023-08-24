package donor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BloodDonar 
{
	private String email, name, contact, blood_group, address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public int addBloodDonor() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:mysql://localhost:3306/my_1st_database";
		String user = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url,user,password);
		
		String sql = "insert into blood_donor values(?, ?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, email);
		ps.setString(2, name);
		ps.setString(3, contact);
		ps.setString(4, blood_group);
		ps.setString(5, address);
		
		int response = ps.executeUpdate();
		

		conn.close();
		return response;
		
		
		
		
	}
	public void updateBloodDonor() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:mysql://localhost:3306/my_1st_database";
		String user = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url,user,password);
		
		
	}
	public void deleteBloodDonor()
	{
		
	}
	public void getAllBloodDonorByGroup()
	{
		
	}
	public void loginBloodDonor()
	{
		
	}
	
	

}
