package br.com.residencia.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.biblioteca.entity.Editora;
import br.com.residencia.biblioteca.repository.EditoraRepository;
@Service
	public class EditoraService {
		@Autowired
		EditoraRepository EditoraRepository;
	
	
	public  List<Editora> getAllEditora () {
		return EditoraRepository.findAll();
	}
	
	public Editora getEditoraById(Integer id)  {
		return EditoraRepository.findById(id).get();
	//return alunoRepository.findById(id).orElse (null);
	}
	
	public Editora saveEditora(Editora editora) {
		return EditoraRepository.save(editora);
	}
	
	public  Editora updateAluno ( Editora editora, Integer id) {
		//Aluno alunoExistenteNoBanco - alunoRepository.findById(id).get();
		
		//Alunos alunoExistenteNoBanco = getAlunoById(id);
		//alunoExistenteNoBanco.setBairro());
		return EditoraRepository.save(editora);
	
	}
	
	public Editora deleteEditora(Integer id) {
		EditoraRepository.deleteById(id);
		return getEditoraById(id);
		
	}
	
	}
