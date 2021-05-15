package projetoIntegrador;

public class PessoaFisica implements Cadastro, Comentario {
	
	private String nomePessoa;
	private String cpf;
	private String email;
	private int telefone;
	
	public PessoaFisica(String nomePessoa, String cpf, String email, int telefone) {
		super();
		this.nomePessoa = nomePessoa;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "PessoaFisica [nomePessoa=" + nomePessoa + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone
				+ "]";
	}
	
	public boolean validarCadastro() {
		return true;
	}
	
	@Override
	public boolean statusCadastro() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String inserirComentario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean like() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
