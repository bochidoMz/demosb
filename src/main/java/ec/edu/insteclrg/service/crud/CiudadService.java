package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Ciudad;
import ec.edu.insteclrg.dto.CiudadDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class CiudadService extends GenericCrudServiceImpl<Ciudad, CiudadDTO>{

	@Override
	public Optional<Ciudad> find(CiudadDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public CiudadDTO mapToDto(Ciudad domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ciudad mapToDomain(CiudadDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
