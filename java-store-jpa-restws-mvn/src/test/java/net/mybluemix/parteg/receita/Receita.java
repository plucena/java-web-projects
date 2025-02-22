package net.mybluemix.parteg.receita;


public class Receita extends java.lang.Object implements java.lang.Cloneable{
	
	public State state;
	public Integer nome;
	public Integer descricao;
	public Integer tipo;
	public Integer sku;
	public Integer unidade;
	public Integer quantidade;
	public Boolean incluir;
	
	public AdapterInterface adapter;
	public AdapterInterfaceDados dados;

	public String   nomeOk;
	public String   descricaoOk;
	public String   tipoOk;
	public Integer  skuOk;
	public String   unidadeOk;
	public Integer  quantidadeOk;
	public Integer  sku2Ok;
	public String   unidade2Ok;
	public Integer  quantidade2Ok;
	
	public Receita()
	{
	state = State.mostrando;
	adapter = new ReceitaPageAdapter();
	dados = new Dados();
	}
	
	public Receita clone()
	{
		try {
			return (Receita)super.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace(java.lang.System.err);
		}
		return null;
	}
	
	public void handleEvent(Object... in_colObject)
	{
	
		
		if(in_colObject.length > 0)
		{
			String sEventName = (String)in_colObject[0];
	
			if((state == State.mostrando) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				nome        = ((Integer)in_colObject[1]).intValue();
				descricao   = ((Integer)in_colObject[2]).intValue();
				tipo        = ((Integer)in_colObject[3]).intValue();
				sku   	    = ((Integer)in_colObject[4]).intValue();
				unidade     = ((Integer)in_colObject[5]).intValue();
				quantidade  = ((Integer)in_colObject[6]).intValue();
				incluir     = ((Boolean)in_colObject[7]).booleanValue();
				
				nomeOk      = dados.dado_tipo(nome);
				descricaoOk = dados.dado_descricao(descricao);
				tipoOk      = dados.dado_tipo(tipo);
				skuOk      = dados.dado_sku(sku);
				unidadeOk   = dados.dado_unidade(unidade);
				quantidadeOk   = dados.dado_quantidade(quantidade);
				sku2Ok      = dados.dado_sku2(sku, incluir);
				unidade2Ok   = dados.dado_unidade2(unidade, incluir);
				quantidade2Ok   = dados.dado_quantidade2(quantidade, incluir);
				
				if(cadastrar(nomeOk, descricaoOk, tipoOk, skuOk, unidadeOk, quantidadeOk, incluir, sku2Ok, unidade2Ok, quantidade2Ok))
					 state = State.cadastrando;
				else
					 state = State.mostrando;
			}
		

			if((state == State.mostrando) && (sEventName.compareTo("alterarEvent") == 0))
			{
				
				nome        = ((Integer)in_colObject[1]).intValue();
				descricao   = ((Integer)in_colObject[2]).intValue();
				tipo        = ((Integer)in_colObject[3]).intValue();
				sku   	    = ((Integer)in_colObject[4]).intValue();
				unidade     = ((Integer)in_colObject[5]).intValue();
				quantidade  = ((Integer)in_colObject[6]).intValue();
				incluir     = ((Boolean)in_colObject[7]).booleanValue();
				
				nomeOk      = dados.dado_tipo(nome);
				descricaoOk = dados.dado_descricao(descricao);
				tipoOk      = dados.dado_tipo(tipo);
				skuOk      = dados.dado_sku(sku);
				unidadeOk   = dados.dado_unidade(unidade);
				quantidadeOk   = dados.dado_quantidade(quantidade);
				sku2Ok      = dados.dado_sku2(sku, incluir);
				unidade2Ok   = dados.dado_unidade2(unidade, incluir);
				quantidade2Ok   = dados.dado_quantidade2(quantidade, incluir);
				
				if(alterar(nomeOk, descricaoOk, tipoOk, skuOk, unidadeOk, quantidadeOk, incluir, sku2Ok, unidade2Ok, quantidade2Ok))
					 state = State.alterando;
				else
					 state = State.mostrando;
			}
			
			
			if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroEvent") == 0))
			{
				if(fazerCadastro() && nome>0 && tipo>0 && sku>0 && unidade>0 && quantidade>0)
					 state = State.mostrando;
				else
					 state = State.cadastrando;
			}
			
			if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesEvent") == 0))
			{
				if(fazerAlteracoes() && nome>0 && tipo>0 && sku>0 && unidade>0 && quantidade>0)
					 state = State.mostrando;
				else
					 state = State.alterando;
			}
		  }
   }
	
	public Boolean cadastrar(String nome, String descricao, String tipo, Integer sku, String unidade, Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2)
	{
	  	//return true;
	  	return adapter.cadastrarEvent(nome, descricao, tipo, sku, unidade, quantidade, incluir, sku2, unidade2, quantidade2);
	}
	
	public Boolean alterar(String nome, String descricao, String tipo, Integer sku, String unidade, Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2)
	{
	  	//return true;
		return adapter.alterarEvent(nome, descricao, tipo, sku, unidade, quantidade, incluir, sku2, unidade2, quantidade2);
	}
	
	public Boolean fazerCadastro()
	{
	   //return true;
	   return adapter.fazerCadastroEvent();
	}
	

	public Boolean fazerAlteracoes()
	{
	  	//return true;
	  	return adapter.fazerAlteracoesEvent();
	}	
	
	
	
	

}
