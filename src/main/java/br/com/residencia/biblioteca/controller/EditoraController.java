package br.com.residencia.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.residencia.biblioteca.entity.Editora;

import br.com.residencia.biblioteca.service.EditoraService;

@RestController
@RequestMapping("/editora")
public class EditoraController {
	@Autowired
	EditoraService EditoraService;
	
	@GetMapping
	public ResponseEntity<List<Editora>> getAllEditora (){
		return new ResponseEntity<>(EditoraService.getAllEditora(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Editora> getEditoraById(@PathVariable Integer id) {
		return new ResponseEntity<>(EditoraService.getEditoraById(id) , 
				HttpStatus.OK);
	}
	
	@PostMapping 
	public  ResponseEntity<Editora>saveEditora(@RequestBody Editora editora){
		return new ResponseEntity<>(EditoraService.saveEditora(editora) , 
				HttpStatus.CREATED);
	}

	@PutMapping
	public  ResponseEntity<Editora>updateEditora(@RequestBody Editora editora,
			@PathVariable Integer id) {
		return new  ResponseEntity<>(EditoraService.updateEditora(editora, id),
						HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Editora> deleteEditora(@PathVariable Integer id) {
		Editora editora = EditoraService.getEditoraById(id);
		if(null == editora) 
			return new ResponseEntity<>(editora,
					HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(EditoraService.deleteEditora(id),
					HttpStatus.OK);
	}

}



