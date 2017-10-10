package br.com.tt.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertTest {

	@Test
	public void testCpf() {
		String cpf = new Convert().cpf("12345678910");
		assertEquals("123.456.789-10", cpf);
	}

}
