package Sistema.models;


import org.springframework.web.bind.annotation.RequestMapping;

public class Usuario {
	
	private Long id;
	private String nome;
	private String email;
	private String Vinculo;
	private String Senha;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVinculo() {
		return Vinculo;
	}

	public void setDepartamento(String vinculo) {
		this.Vinculo = vinculo;
	}
	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		this.Senha = senha;
	}


}
