//Ajouter, Modifier, Supprimer un Client NFA011
/************Supprimer avec PreparedStatement ********************************/
	public static void supprimerClientPrepared(Connection conn, int id) {
		PreparedStatement prep = null;
		try {
			String sql = "delete from clients WHERE id_client=?";
			prep = conn.prepareStatement(sql);
			prep.setInt(1, id);
			int res = prep.executeUpdate();
			prep.close();
			if (res > 0)
				System.out.println("Suppression effectuée!");
			else if (res == 0)
				System.out.println("Aucune suppression effectuée!");
		} catch (Exception ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
			System.out.println("Erreur : suppression!");
		}
	}
		