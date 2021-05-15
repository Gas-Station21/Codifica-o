package projetoIntegrador;

public class CadastroPosto implements Cadastro{
	
	private String nomePosto;
	private String email;
	private int telefone;
	private int cnpj;
	private String coordenadaGeografica;
	private String razaoSocial;
	private Endereco endereco;
	
	public CadastroPosto(String nomePosto, String email, int telefone, int cnpj, String coordenadaGeografica,
			String razaoSocial, Endereco endereco) {
		super();
		this.nomePosto = nomePosto;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.coordenadaGeografica = coordenadaGeografica;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
	}


	

	@Override
	public String toString() {
		return "CadastroPosto [nomePosto=" + nomePosto + ", email=" + email + ", telefone=" + telefone + ", cnpj="
				+ cnpj + ", coordenadaGeografica=" + coordenadaGeografica + ", razaoSocial=" + razaoSocial
				+ ", endereco=" + endereco + "]";
	}




	@Override
	public boolean validarCadastro() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean statusCadastro() {
		// TODO Auto-generated method stub
		return false;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
