package Sistema.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Sistema.daos.ConnectionFactory;
import Sistema.models.Usuario;


public class UsuarioDAO {
	private Connection connection;

	public UsuarioDAO() {
		connection = ConnectionFactory.getConnection();
	}

	public boolean inserir(Usuario usuario) {

		String sql = "insert into usuario (nome, email, vinculo, senha) " + "values (?, ?, ?, ?);";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getVinculo());
			stmt.setString(4, usuario.getSenha());

			

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean alterar(Usuario usuario) {
		String sql = "update usuario set nome=?, email=?, vinculo=?, senha=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getVinculo());
			stmt.setString(4, usuario.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean remover(Usuario usuario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from usuario where id=?");
			stmt.setLong(1, usuario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}	
	public Usuario getById(Long id) {
		Usuario result = null;

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from usuario where id = ?;");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Usuario
				result = new Usuario();
				result.setId(rs.getLong("id"));
				result.setNome(rs.getString("nome"));
				result.setEmail(rs.getString("email"));
				result.setDepartamento(rs.getString("vinculo"));
				result.setSenha(rs.getString("senha"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
}



