
public class MascotaVirtual {
	
	private int nivel;
	private IEstado estado;
	
	public MascotaVirtual() {
		setEstado(new EstadoHambriento());
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		//le pongo el mas para que incremente un nivel
		this.nivel += nivel;
	}
	
	
	public IEstado getEstado() {
		return estado;
	}

	public void setEstado(IEstado estado) {
		this.estado = estado;
	}

	
	
	
	
	public void comer() {
		estado.comer(this);
	}
	
	
	public void jugar() {
		estado.jugar(this);
		
	}

	public boolean PuedeJugar() {
		return estado.puedejugar();
		
	}

	
}
