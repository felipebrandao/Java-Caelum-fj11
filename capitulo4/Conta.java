class Conta{
	
	private int numero;
	private String dono;
	private double saldo;
	private double limite;
	
	private Conta(){
		this(0,"",0,0);
		
		//this.numero = 0;
		//this.saldo = 0;
		//this.limite = 0;
	}
	
	public Conta(int numero, String dono, double saldo, double limite){
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double quantidade){
		this.saldo -= quantidade;
	}
	
	public void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	public void nomeDono(){
		System.out.println(this.dono);
	}
	
	public double consultaSaldo(){
		return this.saldo;
	}
	
	public void transfere(Conta outraConta, double quantidade){
		this.sacar(quantidade);
		outraConta.deposita(quantidade);
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public void setDono(String dono){
		this.dono = dono;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
}