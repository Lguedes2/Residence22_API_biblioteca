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
		//Alunos alunoExistenteNoBanco = AlunoRepository.findById(id).get();
		
		Alunos alunoExistenteNoBanco = getAlunoById(id);
		alunoExistenteNoBanco.setBairro(aluno.getBairro());
		alunoExistenteNoBanco.setCidade(aluno.getCidade());
		alunoExistenteNoBanco.setComplemento(aluno.getComplemento());
		alunoExistenteNoBanco.setCpf(aluno.getCpf());
		alunoExistenteNoBanco.setDataNascimento(aluno.getDataNascimento());
		alunoExistenteNoBanco.setEmprestimos(aluno.getEmprestimos());
		alunoExistenteNoBanco.setLougradouro(aluno.getLougradouro());
		alunoExistenteNoBanco.setNome(aluno.getNome());
		alunoExistenteNoBanco.setNumeroLougradouro(aluno.getNumeroLougradouro());
		alunoExistenteNoBanco.setNumeroMatriculaeAluno(aluno.getNumeroMatriculaeAluno());
		
		return AlunoRepository.save(alunoExistenteNoBanco);
		
		//return AlunoRepository.save(aluno);
	
	}
	
	public Alunos deleteAluno(Integer id) {
		AlunoRepository.deleteById(id);
		return getAlunoById(id);
		
	}
	

	     	
	         		
	    
	
	
}
