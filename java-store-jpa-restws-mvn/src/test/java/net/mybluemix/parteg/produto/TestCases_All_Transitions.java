package net.mybluemix.parteg.produto;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_All_Transitions{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_All_Transitions.class);
	}
	
	@Test
	public void test1()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 823171;
		Integer receitaVal5 = -522851;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		assertEquals(true, (oTestObject.receita.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test2()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 1;
		Integer receitaVal5 = 0;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		assertEquals(true, (oTestObject.receita.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test3()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 169010;
		Integer receitaVal5 = 793745;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		assertEquals(true, (oTestObject.receita.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test4()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 1;
		Integer receitaVal5 = 1;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		assertEquals(true, (oTestObject.receita.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test5()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = -791700;
		Integer receitaVal5 = -305963;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		assertEquals(true, (oTestObject.receita.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test6()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 0;
		Integer receitaVal5 = 0;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		assertEquals(true, (oTestObject.receita.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = -564128;
		Integer receitaVal5 = 418566;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		assertEquals(true, (oTestObject.receita.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test8()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		Integer precoVal5 = 0;
		Integer receitaVal5 = 1;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", precoVal5, receitaVal5);
		assertEquals(true, (oTestObject.preco.intValue() == precoVal5.intValue()));
		assertEquals(true, (oTestObject.receita.intValue() == receitaVal5.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		assertEquals(true, (oTestObject.receita.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test9()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("alterarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test10()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = true;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test11()
	{
		Produto oTestObject = new Produto();
		Boolean nextVal1 = false;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal1);
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test12()
	{
		Produto oTestObject = new Produto();
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		
	}
	
	@Test
	public void test13()
	{
		Produto oTestObject = new Produto();
		Integer precoVal1 = 207339;
		Integer receitaVal1 = -19721;
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("cadastrarEvent", precoVal1, receitaVal1);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}