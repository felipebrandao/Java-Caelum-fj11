class ExercicioX{
	public static void main(String[] args){
		//exercicio 1
		for(int i =150; i <= 300; i++){
			System.out.println("Número " + i);
		}
		
		//exercicio 2
		int soma = 0;
		for(int i = 1; i <=1000; i++){
			soma+=i;
		}
		
		System.out.println(soma + "\n");
		
		//exercicio 3
		for(int i = 1; i <=100;i++){
			if (i % 3 ==0){
				System.out.println(i);
			}
		}
		
		//exercicio 4
		int fatorial = 1;
		for(int i = 1; i <=10;i++){
			fatorial*=i;
			System.out.println("O fatorial de " + i + " é (" + (i-1) + "!) * " + i + " = " + fatorial);
		}
		
		//exercicio Fibonacci
		int maxFibonacci = 40;
		for(int i = 1; i <=maxFibonacci;i++){
			System.out.println("(" + i + ") : " + fib(i));
		}
		
	}
	
	//abordagem recursiva do fibonacci
	//if normal
	static long fib(long n){
		if (n < 2){
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	//if ternario
	static long fibonacci(long n){
		return (n < 2) ? n : fib(n - 1) + fib(n - 2);
	}
}