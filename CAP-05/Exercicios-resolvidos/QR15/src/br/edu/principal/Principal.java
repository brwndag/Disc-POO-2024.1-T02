package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,maiorp=0,menorp=0,qtdB=0,qtdN=0,qtdC=0;
		double preco,custoEst=0.0,imp=0.0,totImp=0.0,precoF=0.0,add=0.0;
		String refri,categ;
		
		for(i=1;i<=12;i++) {
			System.out.println("Digite o preço: ");
			preco=sc.nextDouble();
			System.out.println("Digite a refrigeraçao(S-sim ou N-nao): ");
			refri=sc.next();
			System.out.println("Digite a categoria(A-Alimentacao;L-Limpeza;V-Vestuario)");
			categ=sc.next();
			
			if(preco<=20) {
				if(categ.equals("A")) {
					custoEst=2;
				}
				else if(categ.equals("L")){
					custoEst=3;
			}
				else if(categ.equals("V")) {
					custoEst=4;
		    }
	        }
			 if(preco>20 && preco<=50) {
				if(refri.equals("S")){
					custoEst=6;
			   }else {
					custoEst=0;
				}
			}
			    if(preco>50) {
				if(refri.equals("S")) {
					if(categ.equals("A")) {
						custoEst=5;
					}
					else if(categ.equals("L")) {
						custoEst=2;
					}
					else if(categ.equals("V")) {
						custoEst=4;
				    }else {
				    	if(categ.equals("A") || categ.equals("V")) {
							custoEst=0;
					 }else if(categ.equals("L")) {
						  custoEst=1;
					 }
				    }
				}
			}
			 if(categ!="A" & refri!="S"){
				imp=preco*0.02;
				imp=preco*0.04;
				precoF=preco+custoEst+imp;
				
				System.out.println("Custo de estocagem: "+custoEst);
				System.out.println("imposto: "+imp);
				System.out.println("Preço final: "+precoF);
				
			}
			if(precoF<=20) {
				qtdB=qtdB+1;
				System.out.println("\nClassificaçao: BARATO");
			}else if(precoF>20 &&precoF<=100) {
				qtdN=qtdN+1;
				System.out.println("\n Classificaçao: NORMAL");
	     	}else if(precoF>100) {
				qtdC=qtdC+1;
				System.out.println("\n Classificaçao: CARO");
	     	}
	     	add=add+custoEst+imp;
	     	totImp=totImp+imp;
	     	
	     	if(i==1) {
	     		maiorp=(int)precoF;
	     		menorp=(int)precoF;
	     	}else {
	     		if(precoF>maiorp) {
	     			maiorp=(int)precoF;
	     		}else if(precoF<menorp) {
	     			menorp=(int)precoF;
	     		}
	     	}
		}
		add/=12;
		System.out.println("O adicional será de: "+add);
		System.out.println("O maior imposto é de: "+maiorp);
		System.out.println("O menor imposto é de: "+menorp);
		System.out.println("O total de imposto: "+totImp);
		System.out.println("A qtd de produtos baratos: "+qtdB);
		System.out.println("A qtd de produtos normais: "+qtdN);
		System.out.println("A qtd de produtos caros: "+qtdC);
		
	}
}

