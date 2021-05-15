package projetoIntegrador;

public class MainTeste {

	public static void main(String[] args) {
		
		var endereco1 = new Endereco("caiosjvioa", 2523, "rrghhsdh", "6415465156", "vila madalena", "sao paulo");
		var empresa1 = new CadastrarEmpresa(null, null, null, 0, endereco1);
		System.out.println(empresa1);
		
	}

}
