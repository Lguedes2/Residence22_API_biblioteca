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

import br.com.residencia.biblioteca.entity.Empréstimo;



import br.com.residencia.biblioteca.service.EmprestimoService;
@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
	@Autowired
	EmprestimoService EmprestimoService;
	
	@GetMapping
	public ResponseEntity<List<Empréstimo>> getAllEmprestimo (){
		return new ResponseEntity<>(EmprestimoService.getAllEmprestimo(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Empréstimo> getemprestimoById(@PathVariable Integer id) {
		return new ResponseEntity<>(EmprestimoService.getEmprestimoById(id) , 
				HttpStatus.OK);
	}
	
	@PostMapping 
	public  ResponseEntity<Empréstimo>saveEmprestimo(@RequestBody Empréstimo emprestimo){
		return new ResponseEntity<>(EmprestimoService.saveEmprestimo(emprestimo) , 
				HttpStatus.CREATED);
	}
	@PutMapping
	public  ResponseEntity<Empréstimo>updateEmprestimo(@RequestBody Empréstimo emprestimo,
			@PathVariable Integer id) {
		return new  ResponseEntity<>(EmprestimoService.updateEmprestimo(emprestimo, id),
						HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Empréstimo> deleteEmprestimo(@PathVariable Integer id) {
		Empréstimo emprestimo = EmprestimoService.getEmprestimoById(id);
		if(null == emprestimo) 
			return new ResponseEntity<>(emprestimo,
					HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(EmprestimoService.deleteEmprestimo(id),
					HttpStatus.OK);
	}


}	


