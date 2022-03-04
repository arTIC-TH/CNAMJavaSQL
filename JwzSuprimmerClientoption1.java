//Ajouter, Modifier, Supprimer un Client NFA011
/************Supprimer avec PreparedStatement ********************************/
		public static void supprimerClient(Connection conn, int id) {
			Statement instruction = null;
		try {
			instruction = conn.createStatement();
				int res = instruction.executeUpdate("delete from clients WHERE id_client=" + id + "");
					instruction.close();
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
		