package br.com.residencia.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.residencia.biblioteca.entity.Alunos;
import 	br.com.residencia.biblioteca.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	AlunoService AlunoService;
	
	@GetMapping
	public ResponseEntity<List<Alunos>> getAllAlunos (){
		return new ResponseEntity<>(AlunoService.getAllAlunos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Alunos> getAlunoById(@PathVariable Integer id) {
		return new ResponseEntity<>(AlunoService.getAlunoById(id) , 
				HttpStatus.OK);
	}
	
	@PostMapping 
	public  ResponseEntity<Alunos>saveAluno(@RequestBody Alunos aluno){
		return new ResponseEntity<>(AlunoService.saveAluno(aluno) , 
				HttpStatus.OK);
	}
}

