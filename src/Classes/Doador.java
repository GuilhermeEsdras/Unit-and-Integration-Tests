package Classes;

public class Doador {
	private String nome;
	private int idade;
	private double peso;
	private char sexo;
	private boolean gravida;
	private boolean amamentando;
	private boolean parto;
	private boolean doador;
	private boolean febre;
	
	
	public Doador() {
	}


	public Doador(String nome, int idade, double peso, char sexo, boolean gravida, boolean amamentando, boolean parto,
			boolean doador, boolean febre) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
		this.gravida = gravida;
		this.amamentando = amamentando;
		this.parto = parto;
		this.doador = doador;
		this.febre = febre;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public boolean isGravida() {
		return gravida;
	}


	public void setGravida(boolean gravida) {
		this.gravida = gravida;
	}


	public boolean isAmamentando() {
		return amamentando;
	}


	public void setAmamentando(boolean amamentando) {
		this.amamentando = amamentando;
	}


	public boolean isParto() {
		return parto;
	}


	public void setParto(boolean parto) {
		this.parto = parto;
	}


	public boolean isDoador() {
		return doador;
	}


	public void setDoador(boolean doador) {
		this.doador = doador;
	}


	public boolean isFebre() {
		return febre;
	}


	public void setFebre(boolean febre) {
		this.febre = febre;
	}


	@Override
	public String toString() {
		return "Doador [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", sexo=" + sexo + ", gravida="
				+ gravida + ", amamentando=" + amamentando + ", parto=" + parto + ", doador=" + doador + ", febre="
				+ febre + "]";
	}
	
	
}
