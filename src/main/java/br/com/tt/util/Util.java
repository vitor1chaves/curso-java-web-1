package br.com.tt.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tt.exception.SistemaException;
import br.com.tt.model.CadastroReceita;

public class Util {

	public static <T> T jsontoObject(String json, Class<T> valueType) throws SistemaException {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(json, valueType);
		} catch (Exception e) {
			String msgErro = "Falha ao converter o Json: " + json;
			SistemaException sistemaException = new SistemaException(msgErro, e);
			throw sistemaException;
		}
	}
}
