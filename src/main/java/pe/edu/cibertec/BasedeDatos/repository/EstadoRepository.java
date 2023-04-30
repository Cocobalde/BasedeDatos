package pe.edu.cibertec.BasedeDatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.BasedeDatos.model.bd.Estado;

@Repository
public interface EstadoRepository 
		extends JpaRepository<Estado, Integer>{
	
	
}
