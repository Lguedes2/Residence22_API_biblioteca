package br.com.residencia.biblioteca.entity;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeromatriculaaluno")
	private Integer nomeMatriculaeAluno;

	@Column(name = "nome")
	private String nome;

	@Column(name = "datanascimento")
	private Instant dataNascimento;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "lougradouro")
	private String lougradouro;

	@Column(name = "numerolougradouro")
	private String numeroLougradouro;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "bairro")
	private String Bairro;

	@Column(name = "cidade")
	private String Cidade;
	
	@OneToMany (mappedBy = "emprestimo")
	private Set<Empréstimo> emprestimos;


	public Integer getNomeMatriculaeAluno() {
		return nomeMatriculaeAluno;
	}

	public void setNomeMatriculaeAluno(Integer nomeMatriculaeAluno) {
		this.nomeMatriculaeAluno = nomeMatriculaeAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public String getNumeroLougradouro() {
		return numeroLougradouro;
	}

	public void setNumeroLougradouro(String numeroLougradouro) {
		this.numeroLougradouro = numeroLougradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public Set<Empréstimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(Set<Empréstimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	
}
