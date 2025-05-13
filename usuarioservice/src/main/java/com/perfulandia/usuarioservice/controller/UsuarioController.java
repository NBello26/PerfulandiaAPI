package com.perfulandia.usuarioservice.controller;

//Imports
import com.perfulandia.usuarioservice.service.UsuarioService;
import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.web.bind.annotation.*;

//Imports 2
import java.util.List;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    //Crear un constructor
    public UsuarioController (UsuarioService service){
        this.service = service;
    }

    @GetMapping
    //listar
    public List<Usuario> listar(){
        return service.listar();
    }

    @PostMapping
    //Guardar
    public Usuario guardar(@RequestBody Usuario usuario){
        return service.guardar(usuario);
    }
    //Buscar por ID
    @GetMapping
    public Usuario buscar(@PathVariable long id){
        return service.buscar(id);
    }

    //Eliminar por ID
    @DeleteMapping
    public void eliminar(@PathVariable long id){
        service.eliminar(id);
    } 












}
