package Sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuariosController {

	@RequestMapping ("CadastroUsuario")
	public String Usuarios(){
		return "CadastroUsuario";
	}
}
