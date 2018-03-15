package negocio;

import java.util.List;

public class Secretaria {

	private String nome;
	private List<Documento> documentos;
	
	public void exibir(){
		System.out.println("Nome: " + this.getNome());
		for (Documento documento: this.getDocumentos()) {
			documento.exibir();
		}
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
}
