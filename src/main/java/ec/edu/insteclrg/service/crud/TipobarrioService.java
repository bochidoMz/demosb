package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Tipobarrio;
import ec.edu.insteclrg.dto.TipobarrioDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;
@Service
public class TipobarrioService extends GenericCrudServiceImpl <Tipobarrio, TipobarrioDTO>{

	@Override
	public Optional<Tipobarrio> find(TipobarrioDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public TipobarrioDTO mapToDto(Tipobarrio domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tipobarrio mapToDomain(TipobarrioDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
