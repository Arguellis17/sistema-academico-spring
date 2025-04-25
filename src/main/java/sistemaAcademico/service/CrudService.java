package sistemaAcademico.service;

import org.springframework.stereotype.Service;
import sistemaAcademico.model.Semestre;

import java.util.List;

@Service
public interface CrudService <T, ID>{
    List<T> findAll() throws Exception;
    T save(T t) throws  Exception;
    T update(T t) throws Exception;
    Semestre findById(ID id) throws Exception;
    void deleteById(ID id) throws Exception;
    void deleteAll() throws Exception;

}
