package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Defini os dados do evento implementado os gets e sets dos convidados
 * 
 * @version 1.0 (Abril 2021)
 * @author lameque
 */
public class Evento {

	//atributos
	private String nomeEvento;
	private String tipoEvento;
	private Status status;
	private String dataEvento;
	private int horarioInicio;
	private String anotacoes;
	private int parar;
//	private ArrayList<Convidados> listaConvidados = new ArrayList<Convidados>();
	
	
	//objetos instanciados 
	Scanner ler = new Scanner(System.in);
	Convidados convidados = new Convidados();
	Gastos gastos = new Gastos();
	Tarefas tarefa = new Tarefas();

	//construtores
	
	public Evento() {}

	public Evento(String nomeEvento, String tipoEvento, Status status, String dataEvento, int horarioInicio,
			String anotacoes, Convidados convidados) {
		this.nomeEvento = nomeEvento;
		this.tipoEvento = tipoEvento;
		this.status = status;
		this.dataEvento = dataEvento;
		this.horarioInicio = horarioInicio;
	}

	//gets e sets
	
	public int getParar() {
		return parar;
	}

	public void setParar(int parar) {
		this.parar = parar;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

	}
	
	public String getDataEvento() {		
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public int getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(int horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	@Override
	public String toString() {
		return nomeEvento;
	}
	
	/**
	 * Verifica se o horario esta entre as 24horas presentes no dia.
	 * @param horario
	 * @return true quaso o usuario tenha digitado um horario valido.
	 */
	public boolean validaHorario(int horario) {
		boolean aux = true;
		setHorarioInicio(horario);
		if(getHorarioInicio() < 0) 
			aux = false;		
		
		if(getHorarioInicio() > 24) 
			aux = false;					
		return aux;
	}
	
	/**
	 * Verifica se a data é valida
	 * @param data
	 * @return true se a data for valida
	 */
	public boolean validaData(String data) {
		boolean aux = true;
		setDataEvento(data);
		
		String[] dataSeparada = getDataEvento().split("/");		
		
		if(Integer.parseInt(dataSeparada[2]) < 2020) 
			aux = false;		
		
		if(Integer.parseInt(dataSeparada[1]) < 1 || Integer.parseInt(dataSeparada[1]) > 12)
			aux = false;
				
		if(Integer.parseInt(dataSeparada[0]) < 1 || Integer.parseInt(dataSeparada[0]) > 31)
			aux = false;
				
		return aux;
	}
	
}
