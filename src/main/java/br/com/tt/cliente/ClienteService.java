package br.com.tt.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	List<Cliente> consulta() {
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(1L, "Carlos", "03258", new Date()));
		clientes.add(new Cliente(2L, "Maria", "545646", new Date()));
		clientes.add(new Cliente(3L, "Marcia", "0345646258", new Date()));
		clientes.add(new Cliente(4L, "Juca", "0325456468", new Date()));
		clientes.add(new Cliente(5L, "Bruno", "4646403258", new Date()));
		clientes.add(new Cliente(6L, "Daniel", "03465456258", new Date()));

		return clientes;
	}
}
