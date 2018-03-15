package negocio;

public class Avaliacao {

	private String disciplina;
	private float p1;
	private float t1;
	private float p2;
	private float t2;
	
	public void exibir(){
		System.out.printf(
				"Disciplina: %s; "
				+ "P1: %.2f; "
				+ "T1: %.2f; "
				+ "P2: %.2f; "
				+ "T2: %.2f; "
				+ "Média: %.2f\n", 
				this.getDisciplina(), 
				this.getP1(), 
				this.getT1(),
				this.getP2(), 
				this.getT2(),
				this.calcularMedia()
			);
	}
	
	private float calcularMedia(){
		return (this.getP1() + this.getT1()) * 0.4f + 
			   (this.getP2() + this.getT2()) * 0.6f;
	}

	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getP1() {
		return p1;
	}
	public void setP1(float p1) {
		this.p1 = p1;
	}
	public float getT1() {
		return t1;
	}
	public void setT1(float t1) {
		this.t1 = t1;
	}
	public float getP2() {
		return p2;
	}
	public void setP2(float p2) {
		this.p2 = p2;
	}
	public float getT2() {
		return t2;
	}
	public void setT2(float t2) {
		this.t2 = t2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliacao other = (Avaliacao) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		return true;
	}
}