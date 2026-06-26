package edu.utvt.alumnos.mapper;

import edu.utvt.alumnos.dto.request.AlumnoRequest;
import edu.utvt.alumnos.dto.response.AlumnoResponse;
import edu.utvt.alumnos.entity.Alumno;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-11T18:50:14-0600",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AlumnoMapperImpl implements AlumnoMapper {

    @Override
    public AlumnoResponse toResponse(Alumno alumno) {
        if ( alumno == null ) {
            return null;
        }

        Long id = null;
        String matricula = null;
        String nombre = null;
        String apellidoPaterno = null;
        String apellidoMaterno = null;
        String correoElectronico = null;
        String telefono = null;
        LocalDate fechaNacimiento = null;
        String carrera = null;
        Integer semestre = null;
        boolean activo = false;
        LocalDateTime fechaRegistro = null;

        id = alumno.getId();
        matricula = alumno.getMatricula();
        nombre = alumno.getNombre();
        apellidoPaterno = alumno.getApellidoPaterno();
        apellidoMaterno = alumno.getApellidoMaterno();
        correoElectronico = alumno.getCorreoElectronico();
        telefono = alumno.getTelefono();
        fechaNacimiento = alumno.getFechaNacimiento();
        carrera = alumno.getCarrera();
        semestre = alumno.getSemestre();
        activo = alumno.isActivo();
        fechaRegistro = alumno.getFechaRegistro();

        AlumnoResponse alumnoResponse = new AlumnoResponse( id, matricula, nombre, apellidoPaterno, apellidoMaterno, correoElectronico, telefono, fechaNacimiento, carrera, semestre, activo, fechaRegistro );

        return alumnoResponse;
    }

    @Override
    public List<AlumnoResponse> toResponse(List<Alumno> alumnos) {
        if ( alumnos == null ) {
            return null;
        }

        List<AlumnoResponse> list = new ArrayList<AlumnoResponse>( alumnos.size() );
        for ( Alumno alumno : alumnos ) {
            list.add( toResponse( alumno ) );
        }

        return list;
    }

    @Override
    public Alumno toEntity(AlumnoRequest alumnoRequest) {
        if ( alumnoRequest == null ) {
            return null;
        }

        Alumno alumno = new Alumno();

        alumno.setApellidoMaterno( alumnoRequest.apellidoMaterno() );
        alumno.setApellidoPaterno( alumnoRequest.apellidoPaterno() );
        alumno.setCarrera( alumnoRequest.carrera() );
        alumno.setCorreoElectronico( alumnoRequest.correoElectronico() );
        alumno.setFechaNacimiento( alumnoRequest.fechaNacimiento() );
        alumno.setMatricula( alumnoRequest.matricula() );
        alumno.setNombre( alumnoRequest.nombre() );
        alumno.setSemestre( alumnoRequest.semestre() );
        alumno.setTelefono( alumnoRequest.telefono() );

        return alumno;
    }

    @Override
    public void updateEntity(Alumno alumno, AlumnoRequest alumnoRequest) {
        if ( alumnoRequest == null ) {
            return;
        }

        alumno.setApellidoMaterno( alumnoRequest.apellidoMaterno() );
        alumno.setApellidoPaterno( alumnoRequest.apellidoPaterno() );
        alumno.setCarrera( alumnoRequest.carrera() );
        alumno.setCorreoElectronico( alumnoRequest.correoElectronico() );
        alumno.setFechaNacimiento( alumnoRequest.fechaNacimiento() );
        alumno.setNombre( alumnoRequest.nombre() );
        alumno.setSemestre( alumnoRequest.semestre() );
        alumno.setTelefono( alumnoRequest.telefono() );
    }
}
