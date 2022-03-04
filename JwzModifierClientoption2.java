//Ajouter, Modifier, Supprimer un Client NFA011
/************Modifier avec PreparedStatement ********************************/
		public static void modifierClientPreapared(Connection conn, int id) {
			PreparedStatement prep = null;
		try {
			String sql = "update clients SET nom_cli=?,prenom_cli=?,cp_cli=?,ville_cli=? "
					+ "WHERE id_client=?"; " " + "+ "prep = conn.prepareStatement(sql); prep.setString(1, "Dupont59");
				prep.setString(2, "Martin59");
				prep.setInt(3, 75000);
				prep.setString(4, "Paris");
				prep.setInt(5, id);
				prep.executeUpdate();
				prep.close();
			System.out.println("Modification effectuée!");
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
			System.out.println("Erreur : modification!");
		}
	}
		