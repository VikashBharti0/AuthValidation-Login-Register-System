package register.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import register.DBUtil.DBUtil;
import register.Entity.UserData;

public class UserDetails {
	
	
	//store registration user data 
	public static int save(UserData ud) {
		
		Connection con = DBUtil.getConnection();
		
		String sql = "insert into userdata values(?,?,?,?,?)";
		int res=0;
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, ud.getName());
			st.setString(2, ud.getUserid());
			st.setInt(3, ud.getAge());
			st.setString(4, ud.getEmail());
			st.setString(5, ud.getPassword());
			
			res=st.executeUpdate();
			
			con.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
	}
	
	//check is userid already exist or not
	public static boolean isExist(String userid) {
		
		Connection con = DBUtil.getConnection();
		
		String sql = "select * from userdata where userid=?";
		boolean status=false;
		
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, userid);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				status=true;
			}
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
	//validation of userid and password
	public static boolean isValid(String userid,String password) {
		
		Connection con = DBUtil.getConnection();
		
		String sql = "select * from userdata where userid=? and password=?";
		boolean status=false;
		
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, userid);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				status=true;
			}
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}
		
	

}
