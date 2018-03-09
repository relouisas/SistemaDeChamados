package Sistema.daos;

import java.sql.Connection;

import Sistema.models.Chamados;

public class ChamadosDAO {
	private Connection connection;
	
	
	public ChamadosDAO () {
		connection = ConnectionFactory.getConnection();
	}
	
	public boolean inserir(Chamados chamados) {
		String sql = "insert into contatos (Texto, Status) " + "values (?, ?);";
		
		
	}
	
}
