package com.exemplo.venda;

import java.util.Scanner;

import com.exemplo.venda.servico.DescontoVenda;
import com.exemplo.venda.servico.TipoPessoa;

public class Principal {
	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Informe o tipo de pessoa (1) Física, (2) Jurídica: ");
			int opcaotipoPessoa = entrada.nextInt();
			
			System.out.print("Informe o valor da venda: ");
			double valorVenda = entrada.nextDouble();
						
			TipoPessoa tipoPessoa = TipoPessoa.values()[opcaotipoPessoa -1];			
			 
			DescontoVenda descontoVenda = tipoPessoa.obterDescontoVenda();
			
			valorVenda -= descontoVenda.calcularDesconto(valorVenda);									
								
			System.out.printf("Valor da venda com desconto para pessoa %s é de %f", tipoPessoa.getDescricao(), valorVenda);					
		}	
	}	

}
