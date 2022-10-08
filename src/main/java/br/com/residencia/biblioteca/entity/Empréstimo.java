package br.com.residencia.biblioteca.entity;


import java.math.BigDecimal;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table (name = "emprestimo")
public class Empréstimo {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column (name = "codigoemprestimo")
	  private Integer codigoemprestimo;
	  
	  
	  @ManyToOne
	  @JoinColumn (name = "codigolivro", referencedColumnName = "codigolivro")
	  private Livro livro; 
	  
	
	  @Column (name = "dataemprestimo")
	  private Instant dataEmprestimo;
	  
	  @Column (name = "dataentrega")
	  private Instant dataEntrega;
	  
	  @Column (name = "valoremprestimo")
	  private BigDecimal valoremprestimo;
	  
	  @ManyToOne
	  @JoinColumn (name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno")
	  private Alunos alunos;

	public Integer getCodigoemprestimo() {
		return codigoemprestimo;
	}

	public void setCodigoemprestimo(Integer codigoemprestimo) {
		this.codigoemprestimo = codigoemprestimo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Instant getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Instant dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public BigDecimal getValoremprestimo() {
		return valoremprestimo;
	}

	public void setValoremprestimo(BigDecimal valoremprestimo) {
		this.valoremprestimo = valoremprestimo;
	}

	public Alunos getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
	}

	public Instant getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Instant dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	
    
		

}
