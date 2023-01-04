package tr.edu.medipol.yova.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - Ön Hazırlıklar
		String orjinalMetin = "Üc tas hos 		ho  saf . . .";
		
		// WHEN - Asıl testi gerçekleştirir.
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);
		
		// THEN - Kontroller
		assertEquals("Üctashoshosaf...", sonuc);

	}

}
