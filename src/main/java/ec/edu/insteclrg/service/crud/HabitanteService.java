package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Habitante;
import ec.edu.insteclrg.dto.HabitanteDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class HabitanteService extends GenericCrudServiceImpl <Habitante, HabitanteDTO>{

	@Override
	public Optional<Habitante> find(HabitanteDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public HabitanteDTO mapToDto(Habitante domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Habitante mapToDomain(HabitanteDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
