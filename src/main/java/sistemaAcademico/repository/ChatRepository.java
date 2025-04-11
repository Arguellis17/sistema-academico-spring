package sistemaAcademico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistemaAcademico.model.Chat;

import java.util.Date;
import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

    public List<Chat> findByFechaCreacion(Date fechaCreacion);
}
