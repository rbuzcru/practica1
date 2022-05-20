package Ejercicios7_2;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DBConnection {
		static String db = "pizzas";
		static String login = "root";
		static String password = "";
		static String url = "jdbc:mysql://localhost:3306/" + db + "?useSSL=false";
		Connection conn = null;

		public static void main(String[] args) {
			//llamo al constructor
			DBConnection dbc = new DBConnection();
		}
		
		public DBConnection() {
			/*
			 * Base de datos local/remota A continuaci�n se muestra un ejemplo de uso, para
			 * una base de datos llamada pizzas. El SGBD se encuentra en la m�quina local
			 * (localhost) y las credenciales de usuario son pizzauser/Perro20.
			 */
			try {
				conn = DriverManager.getConnection(url, login, password);
				if (conn != null) {
					//inserci�n
					int totalRows= conn.prepareStatement("INSERT INTO pizzas values(55,'5 quesos')").executeUpdate();
					System.out.println(totalRows+" filas modificadas");
					
					//consulta
					System.out.println("Conexi�n ok: " + conn);
					ResultSet rs = conn.prepareStatement("SELECT * FROM pizzas").executeQuery();
					
					System.out.println("\nID\tNOMBRE");
					while (rs.next()) {
						System.out.print(rs.getString("nombre")+"\t");
						System.out.print(rs.getInt("id"));
						System.out.println();
					}
					
				}
			} catch (SQLException e) {
				System.out.println("Se ha producido un error en la conexi�n:");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
