import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test05 {
	
	MascotaVirtual mascotavirtual = new MascotaVirtual();
	EstadoContento estadocontento = new EstadoContento();
	EstadoAburrido estadoaburrido = new EstadoAburrido(0);
	EstadoHambriento estadohambriento = new EstadoHambriento();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		assertFalse(mascotavirtual.PuedeJugar());
		mascotavirtual.comer();
		assertTrue(mascotavirtual.PuedeJugar());
		
	}
	
	@Test
	void test2() {
		estadoaburrido.setCantidadMinutos(50);
		mascotavirtual.setEstado(estadoaburrido);
		
		mascotavirtual.comer();
		
		
	}
	
	@Test
	void test3() {
		mascotavirtual.setNivel(1);

		mascotavirtual.setEstado(estadocontento);
		mascotavirtual.comer();
		
		assertEquals(2, mascotavirtual.getNivel());
		
		mascotavirtual.jugar();
		assertEquals(4, mascotavirtual.getNivel());
		
		
	}

}
