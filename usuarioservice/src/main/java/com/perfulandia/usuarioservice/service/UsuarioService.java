package com.perfulandia.usuarioservice.service;

//Imports
import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

//Imports 2
import java.util.List;


@Service
public class UsuarioService {


    private final UsuarioRepository repo;

    //Constructor para poder inyectar el repositorio
    public UsuarioService(UsuarioRepository repo){
        this.repo = repo;
    }

    //Metodos para trabajar con crud
    //1.Guardar
    public Usuario guardar(Usuario usuario){
        return repo.save(usuario);
    }
    //2.Mostrar todos
    public List<Usuario> listar(){
        return repo.findAll();
    }
    //3.Buscar por ID
    public Usuario buscar(long id){
        return repo.findById(id).orElse(null);
    }
    //4.Eliminar por ID
    public void eliminar(long id){
        repo.deleteById(id);
    }


}
