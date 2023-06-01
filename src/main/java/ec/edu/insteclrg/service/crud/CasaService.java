package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Casa;
import ec.edu.insteclrg.dto.CasaDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;
@Service
public class CasaService extends GenericCrudServiceImpl<Casa,CasaDTO>{

	@Override
	public Optional<Casa> find(CasaDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public CasaDTO mapToDto(Casa domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Casa mapToDomain(CasaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
