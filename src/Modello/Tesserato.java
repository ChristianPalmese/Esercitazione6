package Modello;


import java.util.ArrayList;
import java.util.List;

public class Tesserato {
	private String nome;
	private String cognome;
	private int dataDiNascita;
	private String codiceFiscale;
	private String codiceTessera;
	private int dataScadenza;
	private List <Abbonamento> listaAbbonamenti;
	
	public Tesserato(String nome, String cognome, int dataDiNascita, String codiceFiscale, String codiceTessera,
			int dataScadenza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;
		this.codiceTessera = codiceTessera;
		this.dataScadenza = dataScadenza;
		this.listaAbbonamenti = new ArrayList<>();
	}
	
    public void aggiungiAbbonamento(Abbonamento abbonamento) {
        listaAbbonamenti.add(abbonamento);
    }
    
	public Tesserato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(int dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceTessera() {
		return codiceTessera;
	}

	public void setCodiceTessera(String codiceTessera) {
		this.codiceTessera = codiceTessera;
	}

	public int getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(int dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public List<Abbonamento> getListaAbbonamenti() {
		return listaAbbonamenti;
	}

	public void setListaAbbonamenti(List<Abbonamento> listaAbbonamenti) {
		this.listaAbbonamenti = listaAbbonamenti;
	}

	@Override
	public String toString() {
		return "Tesserato [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", codiceFiscale=" + codiceFiscale + ", codiceTessera=" + codiceTessera + ", dataScadenza="
				+ dataScadenza + ", listaAbbonamenti=" + listaAbbonamenti + "]";
	}
	
	
	
	
	
}
