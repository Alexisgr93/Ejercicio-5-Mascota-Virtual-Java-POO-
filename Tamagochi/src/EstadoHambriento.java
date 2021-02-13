
public class EstadoHambriento implements IEstado {

	@Override
	public void comer(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo...");
		mascotavirtual.setEstado(new EstadoContento());
		
	}

	@Override
	public void jugar(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("No puedo jugar tengo hambre...");
		
	}

	@Override
	public boolean puedejugar() {
		// TODO Auto-generated method stub
		return false;
	}

}
