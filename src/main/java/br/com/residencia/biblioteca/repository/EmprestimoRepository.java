package br.com.residencia.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.residencia.biblioteca.entity.Empréstimo;

public interface EmprestimoRepository extends
 	JpaRepository<Empréstimo, Integer>
{

}
