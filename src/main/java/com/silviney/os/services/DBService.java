package com.silviney.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silviney.os.domain.Cliente;
import com.silviney.os.domain.OS;
import com.silviney.os.domain.Tecnico;
import com.silviney.os.domain.enuns.Prioridade;
import com.silviney.os.domain.enuns.Status;
import com.silviney.os.repositories.ClienteRepository;
import com.silviney.os.repositories.OSRepository;
import com.silviney.os.repositories.TecnicoRepository;

@Service
public class DBService {

	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;
	
	
	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Silviney", "144.785.300-84", "(88) 98888-8888");
		Cliente c1 = new Cliente(null, "Thais", "598.508.200-80", "(88) 98888-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Trocar fone do notebook", Status.ANDAMENTO, t1, c1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
