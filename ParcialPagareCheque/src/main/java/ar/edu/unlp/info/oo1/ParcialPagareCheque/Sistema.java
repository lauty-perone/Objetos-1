package ar.edu.unlp.info.oo1.ParcialPagareCheque;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Pagare> pagares;
	private List<Cheque> cheques;
	
	public Sistema() {
		this.pagares = new ArrayList<Pagare>();
		this.cheques = new ArrayList<Cheque>();
	}

	public List<Pagare> getPagares() {
		return pagares;
	}

	public void setPagares(List<Pagare> pagares) {
		this.pagares = pagares;
	}

	public List<Cheque> getCheques() {
		return cheques;
	}

	public void setCheques(List<Cheque> cheques) {
		this.cheques = cheques;
	}
	
	public double valorLiquido() {
		return this.pagares.stream()
						   .filter(pagare -> pagare.estaVencido())
						   .mapToDouble(pagare -> pagare.getMonto())
						   .sum()
						   +
			   this.cheques.stream()
						   .filter(cheque -> !cheque.estaVencido())
						   .mapToDouble(cheque -> cheque.getMonto())
						   .sum();
						   
	}
	
}
