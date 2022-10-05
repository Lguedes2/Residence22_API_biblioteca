package br.com.residencia.biblioteca.entity;

import java.time.Instant;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "livros")
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigolivro")
	private Integer codigolivro;

	@Column(name = "nomelivro")
	private String nomeLivro;

	@Column(name = "nomeautor")
	private String nomeAutor;

	@Column(name = "datalancamento")
	private Instant dataLancamento;

	@Column(name = "codigoisbn")
	private Integer codigoIsbn;

	@Column(name = "codigoeditora")
	private Integer codigoEditora;

	public Integer getCodigolivro() {
		return codigolivro;
	}

	public void setCodigolivro(Integer codigolivro) {
		this.codigolivro = codigolivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Instant getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Instant dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(Integer codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public Integer getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	
	}
	
	@ManyToOne
	@JoinColumn (name = "codigoeditora", referencedColumnName = "codigoeditora")
	private Editora editora;

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@OneToOne (mappedBy = "livro" )
	private Empréstimo emprestimo;

	public Empréstimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Empréstimo emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	
	
}
