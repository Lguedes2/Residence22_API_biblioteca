package br.com.residencia.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.biblioteca.entity.Alunos;
import br.com.residencia.biblioteca.repository.AlunoRepository;

@Service 
public class AlunoService {
	@Autowired
	AlunoRepository AlunoRepository;
	
	public  List<Alunos> getAllAlunos (){
		return AlunoRepository.findAll();
	}
	
	public Alunos getAlunoById(Integer id) {
		return AlunoRepository.findById(id).get();
	//return alunoRepository.findById(id).orElse (null);
	}
	
	public Alunos saveAluno(Alunos aluno) {
		return AlunoRepository.save(aluno);
	}
	
	public Alunos updateAluno (Alunos aluno, Integer id) {
		//Aluno alunoExistenteNoBanco - alunoRepository.findById(id).get();
		
		//Alunos alunoExistenteNoBanco = getAlunoById(id);
		//alunoExistenteNoBanco.setBairro());
		return AlunoRepository.save(aluno);
	
	}
	
	public Alunos deleteAluno(Integer id) {
		AlunoRepository.deleteById(id);
		return getAlunoById(id);
		
	}
	

	     	
	         		
	    
	
	
}
