package controller;

public class metodos {

	
	 // método que recebe o tamanho do vetor
	 public void tempoVetor(int tamanho)
	 {
	  int vetor[] = new int[tamanho];
	  
	  // preenchendo com 0
	  for(int i = 0; i < tamanho; i++)
	  {
	   vetor[i] = 0;
	  }
	  
	  long inicio = System.currentTimeMillis();
	  
	  // percorrendo o vetor
	  for(int i = 0; i < tamanho; i++)
	  {
	   int aux = vetor[i];
	  }
	  
	  long fim = System.currentTimeMillis();
	  
	  double tempo = (fim - inicio) / 1000.0;
	  
	  System.out.println("Tamanho: " + tamanho);
	  System.out.println("Tempo gasto: " + tempo + " segundos");
	  System.out.println("----------------------------");
	 }
	}


