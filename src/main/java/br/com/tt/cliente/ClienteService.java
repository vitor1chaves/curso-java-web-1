package br.com.tt.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	List<Cliente> consulta() {

		//List<Cliente> resultado = repository.findByNomeLike("%4%");
		return repository.findAll();
	}

	public void salvar(Cliente cliente) {
		repository.save(cliente);

	}
}
