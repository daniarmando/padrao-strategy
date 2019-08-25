package com.exemplo.venda.servico.descontoVenda;

import com.exemplo.venda.servico.DescontoVenda;

public class DescontoVendaPessoaFisica implements DescontoVenda  {

	@Override
	public double calcularDesconto(double valorVenda) {		
		return valorVenda * 0.05;
	}

}
