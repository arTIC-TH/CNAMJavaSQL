//Ajouter, Modifier, Supprimer un Client NFA011

public static String ajouterClient(Connection conn) {
	String message = "";
		Statement statement = null;
		String nom = "Dupont100";
		String prenom = "Nicolas100";
		String adresse = "520 Rue nationale";
		int code_p = 59000;
		String ville = "Lille";
		String mail = "nicolas100.dupont@gmail.com";
		String tel = "0320698747";
	try {
		String sqlAjouter = "INSERT INTO clients (nom_cli, prenom_cli, adr_cli, cp_cli,ville_cli,date_crea_cli,email_cli,tel_cli)"
							+ "VALUES ('" + nom + "','" + prenom + "' ,'" + adresse + "' ," + code_p + ",'" + ville + "',now(),'" + mail + "','" + tel + "')";
			statement = conn.createStatement();
			statement.executeUpdate(sqlAjouter);
			statement.close();
			message = "L'insertion bien effectuée";
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
			message = "Une erreur se produit lors de l'insertion de données.";
		}
		return message;
		}
