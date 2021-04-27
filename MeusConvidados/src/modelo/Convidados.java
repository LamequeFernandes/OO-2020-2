package modelo;

/**
 * Defini os dados dos convidados implementado os gets e sets dos convidados
 * 
 * @author Lameque Fernandes
 * @versão 1.0 (Abril 2021)
 */

import java.util.Scanner;

public class Convidados  extends Pessoa{	
	
	private String tipoConvidado;
	private Status status;
	private int numConvidados;
	private String[] convidadosCadastrados = new String[30];
	
		
	Scanner ler = new Scanner(System.in);

	public Convidados() {}
	public Convidados(String nome, String idadee, String telefone, String sexo, String tipoConvidado) {
	}
	// gets e sets
	public int getNumConvidados() {
		
		return numConvidados;
	}

	public void setNumConvidados(int numConvidados) {
		this.numConvidados = numConvidados;
	}


	public String getTipoConvidado() {
		return tipoConvidado;
	}

	public void setTipoConvidado(String tipoConvidado) {
		this.tipoConvidado = tipoConvidado;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// gets e sets herdados

	public String getNome() {
		return nome;
	}

	public void setNome(String nome, int i) {
		this.convidadosCadastrados[i] = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(long numTelefone) {
		this.numTelefone = numTelefone;
	}		

}
