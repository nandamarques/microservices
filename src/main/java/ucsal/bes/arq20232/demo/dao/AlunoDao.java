package ucsal.bes.arq20232.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AlunoDao {
	
	private Map<String, String> map;

	public Map<String, String> obterAluno() {
		alunos();
		return map;
	}

	
	private void alunos() {
		map = new HashMap<>();
		map.put("20230014", "Maria Santos");
		map.put("202320105", "João Souza");
		map.put("202320206", "Marcos Silva");
		map.put("202520308", "Jorge Matos");
		map.put("202320509", "Ana Freitas");
		this.map = map;
	}
}
