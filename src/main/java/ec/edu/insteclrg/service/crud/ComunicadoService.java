package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Comunicado;
import ec.edu.insteclrg.dto.ComunicadoDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class ComunicadoService extends GenericCrudServiceImpl<Comunicado,ComunicadoDTO> {

	@Override
	public Optional<Comunicado> find(ComunicadoDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ComunicadoDTO mapToDto(Comunicado domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comunicado mapToDomain(ComunicadoDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
