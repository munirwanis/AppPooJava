package negocio;

public class Universidade {

	private String razaoSocial;
	private String email;
	private String whatsApp;
	private Endereco endereco;
	
	public Universidade(String razaoSocial, String email, String whatsApp) {
		this.setRazaoSocial(razaoSocial);
		this.setEmail(email);
		this.setWhatsApp(whatsApp);
	}

	public void exibir(){
		System.out.printf(
				  "Razão Social: %s; "
				+ "E-mail: %s; "				
				+ "WhatsApp: %s\n", 
				this.razaoSocial, 
				this.email, 
				this.whatsApp
			);		
		
		if(this.getEndereco() != null){
			this.getEndereco().exibir();
		} else {
			System.out.println("Não existe endereço associado!");
		}
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWhatsApp() {
		return whatsApp;
	}
	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}