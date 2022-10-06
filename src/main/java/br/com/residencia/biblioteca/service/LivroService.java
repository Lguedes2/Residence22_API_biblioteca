package br.com.residencia.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.residencia.biblioteca.entity.Livro;
import br.com.residencia.biblioteca.repository.LivroRepository;
@Service
	public class LivroService {
	
		@Autowired
		LivroRepository LivroRepository;
	
	
	public  List<Livro> getAllLivro () {
		return LivroRepository.findAll();
	}
	
	public Livro getLivroById(Integer id)  {
		return LivroRepository.findById(id).get();
	//return alunoRepository.findById(id).orElse (null);
	}
	
	public Livro saveLivro(Livro livro) {
		return LivroRepository.save(livro);
	}
	
	public  Livro updateAluno ( Livro livro, Integer id) {
		//Aluno alunoExistenteNoBanco - alunoRepository.findById(id).get();
		
		//Alunos alunoExistenteNoBanco = getAlunoById(id);
		//alunoExistenteNoBanco.setBairro());
		return LivroRepository.save(livro);
	
	}
	
	public Livro deleteLivro(Integer id) {
		LivroRepository.deleteById(id);
		return getLivroById(id);
		
	}
	
	}

