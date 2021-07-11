package entities;

import java.util.ArrayList;
import java.util.Calendar;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivel;
	private double salario;
	private Departamento departamento;
	private ArrayList<Contratos> contratos = new ArrayList<>();
	
	public Trabalhador(String nome, NivelTrabalhador nivel, double salario, String departamento) {	
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = new Departamento(departamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public ArrayList<Contratos> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(Contratos contrato) {
		contratos.add(contrato);
	}
	public void removerContrato(Contratos contrato) {
		contratos.remove(contrato);
	}
	public double ganhos (int ano, int mes) {
		
		double sum = salario;
		var calendario = Calendar.getInstance();
		
		for(var contrato : contratos) {
			calendario.setTime(contrato.getData());
			var calendarioAno = calendario.get(Calendar.YEAR);
			var calendarioMes = 1 + calendario.get(Calendar.MONTH);
			if(calendarioAno == ano && calendarioMes == mes) {
				sum += contrato.valorTotal();				
			}
		}
		
		return sum;
	}
	

}
