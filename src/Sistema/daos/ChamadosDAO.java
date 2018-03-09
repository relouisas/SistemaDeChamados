package Sistema.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Sistema.models.Chamados;

public class ChamadosDAO {
	private Connection connection;
	
	
	public ChamadosDAO () {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir(Chamados chamados) {
		String sql = "insert into chamados (Id, Nome, Email, Mensagem, Status) " + "values (?, ?, ?, ?, ?);";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, chamados.getId());
			stmt.setString(2, chamados.getNome());
			stmt.setString(3, chamados.getEmail());
			stmt.setString(4, chamados.getMensagem());
			stmt.setString(5, chamados.getStatus());

			

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
}
