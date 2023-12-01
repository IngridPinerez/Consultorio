package com.example.Clinica.Services;

import com.example.Clinica.DTOs.CrearOdontologoDTO;
import com.example.Clinica.Exceptions.ConsultorioApiException;
import com.example.Clinica.Repositories.OdontologoRepository;
import com.example.Clinica.entities.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class OdontologoService {

    OdontologoRepository odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo crear(CrearOdontologoDTO dto){

        Odontologo existe = this.odontologoRepository.findByMatricula(dto.getMatricula());
        if(existe != null){
            throw new ConsultorioApiException("El odontologo ya existe", HttpStatusCode.valueOf(400));
        }

        Odontologo nuevoOdontologo = new Odontologo(dto.getNombre(),dto.getApellido(),dto.getMatricula());
        nuevoOdontologo = this.odontologoRepository.save(nuevoOdontologo);

        return nuevoOdontologo;
    }

    public List<Odontologo> listar(){
        return StreamSupport.stream(this.odontologoRepository.findAll().spliterator(), false).toList();
    }


    public Odontologo eliminar(Long id) {

        if (!this.odontologoRepository.existsById(id)) {
            throw new ConsultorioApiException("No existe un odontologo con el id " + id, HttpStatusCode.valueOf(400));
        }
        Odontologo odontologo = this.odontologoRepository.findById(id).get();
        this.odontologoRepository.deleteById(id);
        return odontologo;
    }


}
