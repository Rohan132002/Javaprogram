package donor;
import java.sql.SQLException;
import java.util.*;

public class Blood_donor_main {
	public static void main(String args[]) throws SQLException
	{
		Scanner sc = new Scanner(System.in);
		BloodDonar bd = new BloodDonar(); 
		String email, name, contact, blood_group, address;
		
		System.out.println("enter email : ");
		email = sc.nextLine();
		
		System.out.println("enter name : ");
		name = sc.nextLine();
		
		System.out.println("enter contact : ");
		contact = sc.nextLine();
		
		System.out.println("enter blood group : ");
		blood_group = sc.nextLine();
		
		System.out.println("enter address : ");
		address = sc.nextLine();
		
		bd.setEmail(email);
		bd.setName(name);
		bd.setContact(contact);
		bd.setBlood_group(blood_group);
		bd.setAddress(address);
		int response = bd.addBloodDonor();
		if(response == 1)
		{
			System.out.println("Registration sucessful");
		}
		else 
		{
			System.out.println("Registration Failed");
		}
		
		
		
		
		
		
	}

}
