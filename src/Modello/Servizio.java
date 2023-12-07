package Modello;

public class Servizio {
	private int codice;
	private int numeroPostiDisponibili;
	private TipoTurno turno;
	private int costoSettimanale;
	
	public enum TipoTurno {
        SENIOR, ADVANCED, JUNIOR
    }
	
	public Servizio() {
	}

	public Servizio(int codice, int numeroPostiDisponibili, TipoTurno turno, int costoSettimanale) {
		super();
		this.codice = codice;
		this.numeroPostiDisponibili = numeroPostiDisponibili;
		this.turno = turno;
		this.costoSettimanale = costoSettimanale;
	}

	
	public void decrementaPostiDisponibili() {
        if (numeroPostiDisponibili > 0) {
            numeroPostiDisponibili--;
        }
    }
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getNumeroPostiDisponibili() {
		return numeroPostiDisponibili;
	}

	public void setNumeroPostiDisponibili(int numeroPostiDisponibili) {
		this.numeroPostiDisponibili = numeroPostiDisponibili;
	}

	public TipoTurno getTurno() {
		return turno;
	}

	public void setTurno(TipoTurno turno) {
		this.turno = turno;
	}

	public int getCostoSettimanale() {
		return costoSettimanale;
	}

	public void setCostoSettimanale(int costoSettimanale) {
		this.costoSettimanale = costoSettimanale;
	}

	@Override
	public String toString() {
		return "Servizio [codice=" + codice + ", numeroPostiDisponibili=" + numeroPostiDisponibili + ", turno=" + turno
				+ ", costoSettimanale=" + costoSettimanale + "]";
	}


	
	
}
