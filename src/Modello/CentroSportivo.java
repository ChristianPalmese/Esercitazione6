package Modello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CentroSportivo {
	List <Tesserato> listaTesserati;
	List <Servizio> listaServizi;
	
    public CentroSportivo() {
        listaTesserati = new ArrayList<>();
        listaServizi = new ArrayList<>();
    }
    
    public void aggiungiTesserato(Tesserato tesserato) {
        listaTesserati.add(tesserato);
    }

    public void aggiungiServizio(Servizio servizio) {
        listaServizi.add(servizio);
    }
    
	public List<Tesserato> getListaTesserati() {
		return listaTesserati;
	}

	public void setListaTesserati(List<Tesserato> listaTesserati) {
		this.listaTesserati = listaTesserati;
	}

	public List<Servizio> getListaServizi() {
		return listaServizi;
	}

	public void setListaServizi(List<Servizio> listaServizi) {
		this.listaServizi = listaServizi;
	}
	
	Abbonamento abb = new Abbonamento();

	public boolean aggiorna(String codiceFiscale, int codServizio, String mese, boolean[][] settimane) {
	    for (Tesserato tesserato : listaTesserati) {
	        if (tesserato.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)) {
	            for (Servizio servizio : listaServizi) {
	                if (servizio.getCodice() == codServizio) {
	                    if (servizio.getNumeroPostiDisponibili() > 0) {
	                        abb.setCodiceServizio(codServizio);
	                        abb.setSettimaneAbbonamento(settimane);
	                        abb.setMese(mese);
	                        tesserato.getListaAbbonamenti().add(abb);
	                        servizio.decrementaPostiDisponibili();
	                        return true; // Operazione completata con successo
	                    } else {
	                        return false; // Posti non disponibili per il servizio
	                    }
	                }
	            }
	        }
	    }
	    return false; // Tesserato non trovato o servizio non trovato
	}

	
	
	
	public ArrayList<Servizio> serviziOrdinati() {
        List<Servizio> servizi = new ArrayList<>(listaServizi);

        // Ordina la lista dei servizi usando un comparatore personalizzato
        Collections.sort(servizi, new Comparator<Servizio>() {
            @Override
            public int compare(Servizio s1, Servizio s2) {
                // Ordinamento per turno: senior -> advanced -> junior
                int comparazioneTurno = s1.getTurno().compareTo(s2.getTurno());
                if (comparazioneTurno != 0) {
                    return comparazioneTurno;
                }

                // A parità di turno, ordina per costo mensile decrescente
                return Integer.compare(s2.getCostoSettimanale(), s1.getCostoSettimanale());
            }
        });

        return new ArrayList<>(servizi);
    }
	
	public void reportIscritti (int mese){
		
		
		int[][] matrice = new int[1][2];
		
		int countTrue = countTrueInRow(abb.getSettimaneAbbonamento(), mese);
		
		
		System.out.println(countTrue);
		
		
		}
	
	public static int countTrueInRow(boolean[][] matrix, int row) {
        int count = 0;
        if (row < 0 || row >= matrix.length) {
            // Restituisce -1 se l'indice della riga è fuori dal range della matrice
            return -1;
        }

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i]) {
                count++;
            }
        }
        return count;
    }

	
	
	@Override
	public String toString() {
		return "CentroSportivo [listaTesserati=" + listaTesserati + ", listaServizi=" + listaServizi + "]";
	}

	
	
}
