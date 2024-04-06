package br.com.alura.loja;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		assertEquals("teste", p.getNome());
		assertEquals(BigDecimal.TEN, p.getPreco());
	}

}
