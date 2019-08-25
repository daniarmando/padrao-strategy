package com.exemplo.venda.servico;

import com.exemplo.venda.servico.descontoVenda.DescontoVendaPessoaFisica;
import com.exemplo.venda.servico.descontoVenda.DescontoVendaPessoaJuridica;

public enum TipoPessoa {
	
	FISICA("Física") {
		@Override
		public DescontoVenda obterDescontoVenda() {			
			return new DescontoVendaPessoaFisica();
		}
	},
	JURIDICA("Jurídica") {
		@Override
		public DescontoVenda obterDescontoVenda() {			
			return new DescontoVendaPessoaJuridica();
		}
	};
	
	private String descricao;
	
	TipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract DescontoVenda obterDescontoVenda();

}
