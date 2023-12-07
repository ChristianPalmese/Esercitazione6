package Controllo;

import java.util.ArrayList;

import Modello.Abbonamento;
import Modello.CentroSportivo;
import Modello.Servizio;
import Modello.Tesserato;



public class Main {
    public static void main(String[] args) {
        CentroSportivo centroSportivo = new CentroSportivo();

        // Creazione e aggiunta di alcuni tesserati al centro sportivo
        Tesserato tesserato1 = new Tesserato("Mario", "Rossi", 1980, "ABC123", "T001", 2024);
        Tesserato tesserato2 = new Tesserato("Luigi", "Verdi", 1990, "DEF456", "T002", 2023);

        centroSportivo.aggiungiTesserato(tesserato1);
        centroSportivo.aggiungiTesserato(tesserato2);

        // Creazione e aggiunta di alcuni servizi al centro sportivo
        Servizio servizio1 = new Servizio(1, 5, Servizio.TipoTurno.SENIOR, 100); // Turno senior, costo 100
        Servizio servizio2 = new Servizio(2, 8, Servizio.TipoTurno.ADVANCED, 80); // Turno advanced, costo 80
        Servizio servizio3 = new Servizio(3, 10, Servizio.TipoTurno.JUNIOR, 120); // Turno junior, costo 120

        centroSportivo.aggiungiServizio(servizio1);
        centroSportivo.aggiungiServizio(servizio2);
        centroSportivo.aggiungiServizio(servizio3);

        // Impostiamo dei posti disponibili per i servizi
        servizio1.setNumeroPostiDisponibili(3);
        servizio2.setNumeroPostiDisponibili(6);
        servizio3.setNumeroPostiDisponibili(9);
        
        
        boolean[][] matrix = {
                {true, true, true, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true},
                {true, false, false, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true},
                {true, false, false, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true}
            };
        
        // Chiamata al metodo aggiorna per verificare il suo funzionamento
        boolean risultatoAggiornamento = centroSportivo.aggiorna("ABC123", 1, "Gennaio", matrix);
        System.out.println("Risultato dell'aggiornamento: " + risultatoAggiornamento);

        // Chiamata al metodo serviziOrdinati()
        ArrayList<Servizio> serviziOrdinati = centroSportivo.serviziOrdinati();

        // Stampiamo l'elenco dei servizi ordinati
        System.out.println("Elenco dei servizi ordinati:");
        for (Servizio servizio : serviziOrdinati) {
            System.out.println(servizio);
        }
        
        centroSportivo.reportIscritti(0);
    }
}






