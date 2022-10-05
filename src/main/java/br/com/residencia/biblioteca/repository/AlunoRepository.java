package br.com.residencia.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.biblioteca.entity.Alunos;

public interface AlunoRepository extends
	JpaRepository<Alunos, Integer>
{

}
