package entities;

import java.util.Date;

public class Contratos {
	private Date data;
	private double valorHora;
	private int horasTrabalho;
	
	
	public Contratos(Date data, double valorHora, int horasTrabalho) {
		this.data = data;
		this.valorHora = valorHora;
		this.horasTrabalho = horasTrabalho;
	}

	

	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	public int getHorasTrabalho() {
		return horasTrabalho;
	}



	public void setHorasTrabalho(int horasTrabalho) {
		this.horasTrabalho = horasTrabalho;
	}



	public double valorTotal() {
		return valorHora * horasTrabalho;
		
	}
}
