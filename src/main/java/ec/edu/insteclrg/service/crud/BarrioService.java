package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Barrio;
import ec.edu.insteclrg.dto.BarrioDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class BarrioService extends GenericCrudServiceImpl<Barrio,BarrioDTO>{

	@Override
	public Optional<Barrio> find(BarrioDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public BarrioDTO mapToDto(Barrio domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Barrio mapToDomain(BarrioDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
