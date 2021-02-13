
public class EstadoContento implements IEstado{

	@Override
	public void comer(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo...");
		mascotavirtual.setNivel(1);
		
	}

	@Override
	public void jugar(MascotaVirtual mascotavirtual) {
		// TODO Auto-generated method stub
		System.out.println("Estoy jugando...");
		mascotavirtual.setNivel(2);
	}

	@Override
	public boolean puedejugar() {
		// TODO Auto-generated method stub
		return true;
	}

}
