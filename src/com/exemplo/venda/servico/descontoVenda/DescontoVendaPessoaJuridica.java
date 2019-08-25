package com.exemplo.venda.servico.descontoVenda;

import com.exemplo.venda.servico.DescontoVenda;

public class DescontoVendaPessoaJuridica implements DescontoVenda {

	@Override
	public double calcularDesconto(double valorVenda) {		
		return valorVenda * 0.04;
	}

}
