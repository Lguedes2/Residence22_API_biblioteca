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
	private Integer  numeroMatriculaeAluno;

	@Column(name = "nome")
	private String nome;

	@Column(name = "datanascimento")
	private Instant dataNascimento;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "numerologradouro")
	private String numeroLogradouro;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "bairro")
	private String Bairro;

	@Column(name = "cidade")
	private String Cidade;
	
	@OneToMany (mappedBy = "alunos")
	private Set<Empréstimo> emprestimos;

	

	public Integer getNumeroMatriculaeAluno() {
		return numeroMatriculaeAluno;
	}

	public void setNumeroMatriculaeAluno(Integer numeroMatriculaeAluno) {
		this.numeroMatriculaeAluno = numeroMatriculaeAluno;
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
		return logradouro;
	}

	public void setLougradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLougradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLougradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
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
