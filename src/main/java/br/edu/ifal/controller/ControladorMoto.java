package br.edu.ifal.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifal.model.Moto;
import br.edu.ifal.model.MotoModelo;
import br.edu.ifal.model.MotoModeloRepositorio;
import br.edu.ifal.model.MotoRepositorio;
import br.edu.ifal.model.Usuario;
import br.edu.ifal.model.UsuarioRepositorio;

@RestController
public class ControladorMoto {

    @Autowired
    MotoRepositorio repo;
    @Autowired
    MotoModeloRepositorio repositorioModelosMotos;
    @Autowired
    UsuarioRepositorio repositorioUsuario;

    @RequestMapping(value = "/motos", method = RequestMethod.GET)
    @GetMapping
    public Iterable<MotoModelo> buscarTodasMotos() {
        return repositorioModelosMotos.findAll();
    }

    @RequestMapping(value = "/usuarios/motos", method = RequestMethod.GET, produces = "application/json")
    @GetMapping
    public Iterable<Moto> buscarMotosDosUsuarios() {
        return repo.findAll();
    }

    @GetMapping("/usuarios/{id}/moto")
    public Moto buscarMotoPorId(@PathVariable(value = "id") long id) {
        // passa o id do usuário como parametro
        // e não o id da moto;
        Optional<Usuario> usuario;
        usuario = repositorioUsuario.findById(id);
        return usuario.get().getMoto();
    }

    @PutMapping("/usuarios/{id}/moto")
    public ResponseEntity<Moto> renovarAtributosDaMoto(@PathVariable(value = "id") long id, @Valid @RequestBody Moto novaMoto) {
        Optional<Usuario> usuario;
        usuario = repositorioUsuario.findById(id);
        Moto oldMoto = usuario.get().getMoto();
        if (oldMoto != null) {
        	if(novaMoto.getNome() != null) {
        		oldMoto.setNome(novaMoto.getNome());
        	}
        	if(novaMoto.getModelo() != null) {
        		oldMoto.setModelo(novaMoto.getModelo());
        	}
        	if(novaMoto.getMarca() != null) {
        		oldMoto.setMarca(novaMoto.getMarca());
        	}
        	if(novaMoto.getCilindradas() != null) {
        		oldMoto.setCilindradas(novaMoto.getCilindradas());
            }
            if(novaMoto.getKm_max_acelerador() != null){
            	oldMoto.setKm_max_acelerador(novaMoto.getKm_max_acelerador());
            }
            if(novaMoto.getKm_max_embreagem() != null) {
            	oldMoto.setKm_max_embreagem(novaMoto.getKm_max_embreagem());
            }
            if(novaMoto.getKm_max_freio() != null) {
            	oldMoto.setKm_max_freio(novaMoto.getKm_max_freio());
            }
            if(novaMoto.getKm_max_pneus() != null){
            	oldMoto.setKm_max_pneus(novaMoto.getKm_max_pneus());
            }
            if(novaMoto.getKm_max_suspensao() != null){
            	oldMoto.setKm_max_suspensao(novaMoto.getKm_max_suspensao());
            }
            if(novaMoto.getKm_max_troca_oleo() != null){
            	oldMoto.setKm_max_troca_oleo(novaMoto.getKm_max_troca_oleo());
            }
            if(novaMoto.getKm_atual_vela() != null){
            	oldMoto.setKm_max_vela(novaMoto.getKm_max_vela());
            }
            oldMoto.setContador_dias(novaMoto.getContador_dias());
            oldMoto.setKm_atual_acelerador(novaMoto.getKm_atual_acelerador());
            oldMoto.setKm_atual_embreagem(novaMoto.getKm_atual_embreagem());
            oldMoto.setKm_atual_freio(novaMoto.getKm_atual_freio());
            oldMoto.setKm_atual_pneus(novaMoto.getKm_atual_pneus());
            oldMoto.setKm_atual_suspensao(novaMoto.getKm_atual_suspensao());
            oldMoto.setKm_atual_troca_oleo(novaMoto.getKm_atual_troca_oleo());
            oldMoto.setKm_atual_vela(novaMoto.getKm_atual_vela());
            repo.save(oldMoto);
            return new ResponseEntity<Moto>(oldMoto, HttpStatus.OK.CREATED);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}