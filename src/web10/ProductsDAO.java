package web10;
import java.util.*;
import java.sql.*;

public class ProductsDAO {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/web?serverTimezone=UTC";
	private static final String ACCOUNT = "root";
	private static final String PSD = "123456";
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Product> showAll() {
		List<Product> products = new ArrayList<Product>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER_OK.");
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL,ACCOUNT,PSD);
			System.out.println("CONNECTION_OK.");
			stmt = conn.createStatement();
			String sql="SELECT * FROM web.products";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int id =rs.getInt("id");
				String pName = rs.getString("pName");
				String origin = rs.getString("origin");
				Double price = rs.getDouble("price");
				int inventory = rs.getInt("inventory");
				Product prd=new Product(id,pName,origin,price,inventory);
				products.add(prd);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
	    	try {
	    		rs.close();
	    		stmt.close();
	    		conn.close();
	    		System.out.println("CONNECTION_CLOSED.");
	    	}catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
		}
		return products;
	}
	
	public static void addPrd(Product product) {
		try {
			Class.forName(DRIVER);
			System.out.println("DRIVER_OK.");
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL,ACCOUNT,PSD);
			System.out.println("CONNECTION_OK.");
			stmt = conn.createStatement();
			String sql = "INSERT INTO web.products (pName,origin,price,inventory) VALUES"
					+ "("+"'"+product.getPName()+"'"+","+"'"+product.getOrigin()+"'"+","
					+ String.valueOf(product.getPrice())+","+String.valueOf(product.getInventory())+")";
			stmt.executeUpdate(sql);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
	    	try {
	    		stmt.close();
	    		conn.close();
	    		System.out.println("CONNECTION_CLOSED.");
	    	}catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
		}
	}
	public static Product getPrdById(int id) {
		Product p = null;
		try {
			Class.forName(DRIVER);
			System.out.println("DRIVER_OK.");
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL,ACCOUNT,PSD);
			System.out.println("CONNECTION_OK.");
			stmt = conn.createStatement();
			String sql = "SELECT id,pName,origin,price,inventory FROM web.products WHERE id="+id;
			rs=stmt.executeQuery(sql);
			while(rs.next())
            {
				p=new Product(rs.getInt("id"),rs.getString("pName"),rs.getString("origin"),rs.getDouble("price"),rs.getInt("inventory"));
            }
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
	    	try {
	    		rs.close();
	    		stmt.close();
	    		conn.close();
	    		System.out.println("CONNECTION_CLOSED.");
	    	}catch(SQLException ex) {
	    		ex.printStackTrace();
	    	}
		}
		return p;
	}
}
