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
		//return EditoraRepository.findById(id).get();
	return EditoraRepository.findById(id).orElse (null);
	}
	
	public Editora saveEditora(Editora editora) {
		return EditoraRepository.save(editora);
	}
	
	public  Editora updateEditora ( Editora editora, Integer id) {
		//Editora editoraExistenteNoBanco - editoraRepository.findById(id).get();
		
		Editora editoraExistenteNoBanco = getEditoraById(id);
	
		editoraExistenteNoBanco.setNome(editora.getNome());
		
		//return EditoraRepository.save(editora);
		return EditoraRepository.save(editoraExistenteNoBanco);
	
	}
	
	public Editora deleteEditora(Integer id) {
		if(null != getEditoraById(id))
			EditoraRepository.deleteById(id);
		
		return getEditoraById(id);
		}
	
	
	}
