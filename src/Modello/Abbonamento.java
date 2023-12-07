package Modello;

import java.util.Arrays;

public class Abbonamento {
	private int codiceServizio;
	private String mese;
	private boolean[][] settimaneAbbonamento;
	private Servizio servizioAssociato;

	public Abbonamento(int codiceServizio, boolean[][] settimaneAbbonamento, String mese) {
	        this.codiceServizio = codiceServizio;
	        this.settimaneAbbonamento = settimaneAbbonamento;
	        this.mese=mese;
	        
	    }
	
	public Abbonamento() {}


    
	public Servizio getServizioAssociato() {
		return servizioAssociato;
	}



	public void setServizioAssociato(Servizio servizioAssociato) {
		this.servizioAssociato = servizioAssociato;
	}



	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public int getCodiceServizio() {
		return codiceServizio;
	}

	public void setCodiceServizio(int codiceServizio) {
		this.codiceServizio = codiceServizio;
	}

	public boolean[][]getSettimaneAbbonamento() {
		return settimaneAbbonamento;
	}

	public void setSettimaneAbbonamento(boolean[][] settimaneAbbonamento) {
		this.settimaneAbbonamento = settimaneAbbonamento;
	}
	
	
	@Override
	public String toString() {
		return "Abbonamento [codiceServizio=" + codiceServizio + ", mese=" + mese + ", settimaneAbbonamento="
				+ Arrays.toString(settimaneAbbonamento) + ", servizioAssociato=" + servizioAssociato + "]";
	}


	
	
    
    
}
