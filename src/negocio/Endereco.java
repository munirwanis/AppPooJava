package negocio;

public class Endereco {

	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(String bairro, String cidade, String uf) {
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
	}

	public void exibir(){
		System.out.printf(
				  "Bairro: %s; "
				+ "Cidade: %s; "				
				+ "UF: %s\n", 
				this.bairro, 
				this.cidade, 
				this.uf
			);		
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
