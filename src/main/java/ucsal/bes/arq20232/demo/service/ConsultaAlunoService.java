package ucsal.bes.arq20232.demo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import ucsal.bes.arq20232.demo.dao.AlunoDao;

@Service
public class ConsultaAlunoService {

	public String consultaNome(String matricula) {
		AlunoDao base = new AlunoDao();
		Map<String, String> map = base.obterAluno();
		for (Map.Entry mapa : map.entrySet()) {
			if(mapa.getKey().equals(matricula)) {
				return (String) mapa.getValue();
			}
		}
		return "Não encontrado";
	}
}
