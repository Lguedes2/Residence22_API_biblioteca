package br.com.residencia.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.biblioteca.entity.Empréstimo;
import br.com.residencia.biblioteca.repository.EmprestimoRepository;
@Service

        public class EmprestimoService {

		@Autowired
		EmprestimoRepository EmprestimoRepository;
		
		
		public  List<Empréstimo> getAllEmprestimo () {
			return EmprestimoRepository.findAll();
		}
		
		public Empréstimo getEmprestimoById(Integer id)  {
			return EmprestimoRepository.findById(id).get();
		//return EmprestimoRepository.findById(id).orElse (null);
		}
		
		public Empréstimo saveEmprestimo(Empréstimo emprestimo) {
			return EmprestimoRepository.save(emprestimo);
		}
		
		public  Empréstimo updateEmprestimo ( Empréstimo emprestimo, Integer id) {
			//Empréstimo EmprestimoExistenteNoBanco - EmprestimoRepository.findById(id).get();
			
			//Empréstimo EmprestimoExistenteNoBanco = getEmprestimoById(id);
			//EmprestimoExistenteNoBanco.setBairro());
			
			return EmprestimoRepository.save(emprestimo);
		
		}
		
		public Empréstimo deleteEmprestimo(Integer id) {
			EmprestimoRepository.deleteById(id);
			return getEmprestimoById(id);
			
		}
		
		}
		
