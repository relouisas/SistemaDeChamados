package Sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChamadosController {
	
	@RequestMapping ("/chamados/RealizarChamados")
	public String RealizarChamados() {
		System.out.println("Acessando Realizar chamados");
		return "chamados/RealizarChamado.jsp";
	}

}
