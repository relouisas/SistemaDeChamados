package Sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Sistema.daos.UsuarioDAO;
import Sistema.models.Usuario;

@Controller
public class UsuariosController {

	@RequestMapping ("CadastroUsuario")
	public String Usuarios(){
		return "CadastroUsuario";
	}
	
	@RequestMapping(value="usuario", method=RequestMethod.POST)
	public String gravar(Usuario a){
		System.out.println("Acessando o metodo de gravar um usuario");
		
		System.out.println("Nome: " + a.getNome());
		System.out.println("Email: " + a.getEmail());
		System.out.println("Departamento: " + a.getDepartamento());
		System.out.println("Senha:" + a.getSenha());
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.inserir(a);
		
		return "redirect:usuarios";
	}
}
