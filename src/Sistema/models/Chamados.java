package Sistema.models;

import org.springframework.web.bind.annotation.RequestMapping;

public class Chamados {
	private Long Id;
	private String Nome;
	private String Email;
	private String Mensagem;
	private String Status;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setTexto(String mensagem) {
		Mensagem = mensagem;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
