//Ajouter, Modifier, Supprimer un Client NFA011
//************Ajouetr avec PreparedStatement *****************
		public static String ajouterClientPrepared(Connection conn) {
			String message = "";
			PreparedStatement prep = null;
				String nom = "Dupont";
				String prenom = "Nicolas";
				String adresse = "52 Rue nationale";
				int code_p = 59000;
				String ville = "Lille";
				String mail = "nicolas.dupont@gmail.com";
				String tel = "0320698747";
		try {
			prep = conn.prepareStatement(
				"INSERT into clients (nom_cli, prenom_cli, adr_cli,cp_cli,ville_cli,date_crea_cli,email_cli,tel_cli) values (?,?,?,?,?,?,?,?)");
				prep.setString(1, nom);
				prep.setString(2, prenom);
				prep.setString(3, adresse);
				prep.setInt(4, code_p);
				prep.setString(5, ville);
				prep.setDate(6, Date.valueOf("2022-01-25"));
				prep.setString(7, mail);
				prep.setString(8, tel);
				prep.executeUpdate();
				prep.close();
				message = "L'insertion bien effectuée";
			} catch (SQLException ex) {
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
				System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
				message = "Une erreur se produit lors de l'insertion de données.";
			}
		return message;
		}