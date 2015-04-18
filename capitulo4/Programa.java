class Programa{
	public static void main(String[] args){
		Conta minhaConta = new Conta(1,"Duke",0,0);
		
		//minhaConta.setDono("Duke");
		minhaConta.deposita(1000.0);
		
		System.out.println("Saldo atual: " + minhaConta.consultaSaldo());
	}
}