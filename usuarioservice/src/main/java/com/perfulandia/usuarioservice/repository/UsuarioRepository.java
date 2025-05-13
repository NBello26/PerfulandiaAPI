package com.perfulandia.usuarioservice.repository;

//Imports
import com.perfulandia.usuarioservice.model.Usuario;

//Imports 2
import org.springframework.data.jpa.repository.JpaRepository;


//Esta interfaz hereda de JPA y gestiona la entidad usuario con ID de tipo Long
//Métodos heredados :findAll() Mostrar Todos, findById() Buscar , save() Guardar,delete Eliminar
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{



}
