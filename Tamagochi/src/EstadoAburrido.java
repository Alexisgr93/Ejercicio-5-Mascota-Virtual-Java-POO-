
public class EstadoAburrido implements IEstado {
	private int CantidadMinutos;
	
	public int getCantidadMinutos() {
		return CantidadMinutos;
	}
	public void setCantidadMinutos(int cantidadMinutos) {
		CantidadMinutos = cantidadMinutos;
	}
	public EstadoAburrido(int CantidadMinutos) {
		this.getCantidadMinutos();
	}

	@Override
	public void comer(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo...");
		if(CantidadMinutos > 80) {
			System.out.println("Me pongo contento...");
			mascotavirtual.setEstado(new EstadoContento());
		}else {
			
			System.out.println("sigo aburrido...");
			
		}
	}

	@Override
	public void jugar(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("Me pongo contento...");
		mascotavirtual.setEstado(new EstadoContento());
	}

	@Override
	public boolean puedejugar() {
		// TODO Auto-generated method stub
		return true;
	}

}
