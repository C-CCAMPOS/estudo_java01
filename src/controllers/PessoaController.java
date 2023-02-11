package controllers;

import javax.swing.JOptionPane;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {

	public void CadastrarPessoa() {
		
		try {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setName(JOptionPane.showInputDialog("DIGITE O NOME"));
		pessoa.setEmail(JOptionPane.showInputDialog("DIGITE O EMAIL"));
		
		PessoaRepository pessoaRepository = new PessoaRepository();
		
		pessoaRepository.save(pessoa);
		
		JOptionPane.showMessageDialog(null,"CADASTRO EFETUADO COM SUCESSO");
		
		
	}catch(Exception e){
		
		System.out.println("ERRO AO CADASTRAR");
		e.printStackTrace();
		
	}
	
}
}