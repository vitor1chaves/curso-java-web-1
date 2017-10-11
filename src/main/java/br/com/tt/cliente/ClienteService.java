package br.com.tt.cliente;

import static br.com.tt.util.HttpClient.get;
import static br.com.tt.util.Util.jsontoObject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tt.exception.SistemaException;
import br.com.tt.model.CadastroReceita;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	List<Cliente> consulta() {

		// List<Cliente> resultado = repository.findByNomeLike("%4%");
		return repository.findAll();
	}

	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);

	}

	public Cliente buscar(Long id) {
		return repository.findOne(id);
	}

	public void excluir(Long id) {
		repository.delete(id);
	}

	public CadastroReceita consultaReceita(String cnpj) throws SistemaException {
		return jsontoObject(get("https://www.receitaws.com.br/v1/cnpj/" + cnpj), CadastroReceita.class);
	}

	public static void main(String[] args) throws SistemaException {
		CadastroReceita cad = new ClienteService().consultaReceita("27865757000102");
		System.out.println(cad.getFantasia());
	}
}
