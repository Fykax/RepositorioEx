package jcolonia.daw2020.quinielabd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestQuiniela {
	
	/**
	 * ElementoPartido creado en las pruebas
	 */
	private ElementoPartido1X2 Partido;

	/**
	 * Valores de prueba.
	 */
	private String texto, clave, claveEquivocada;

	/**
	 * Campo que permite mantener un contador de secuencia en algunos test.
	 */
	private int nConsulta;

	/**
	 * Preparación general común previa al conjunto de test.
	 */
	@BeforeAll
	static void setUpBeforeClass() {
	}

	/**
	 * Finalización general común posterior al conjunto de test.
	 */
	@AfterAll
	static void tearDownAfterClass() {
	}

	/**
	 * Prepara diversos valores de texto y claves a utilizar, antes de cada uno de
	 * los test. Empleando campos se evitan las limitaciones de las expresiones
	 * lamba al usar variables locales no efectivamente finales.
	 */

	@BeforeEach
	void setUp() throws Exception {
		
		clave = "1234567890";
		claveEquivocada = "1234567899";
		texto = "Buenos días";

		nConsulta = 0;
	}

	@Test
	void test() {
		fail("No implementado aun");
	}
	
	/**
	 * Comprueba que el constructor se ejecuta sin incidencias en casos «normales»:
	 * texto de una o más letras/números/caracteres y claves banales de 8 caracteres
	 * o más
	 * 
	 * @throws ClaveMalaException NO esperada
	 * @throws TextoNuloException NO esperada
	 */
	@Test
	@DisplayName("Constructor: casos correctos")
	void testConstructor1() throws TextoNuloException, ClaveMalaException {
		new ElementoPartido1X2("texto", "12345678");
		new ElementoPartido1X2("texto", "123456789");
		new ElementoPartido1X2("Á", "12345678");
		new ElementoPartido1X2("Á", "123456789");
		new ElementoPartido1X2("0", "12345678");
		new ElementoPartido1X2("0", "123456789");
		new ElementoPartido1X2(" ", "12345678");
		new ElementoPartido1X2(" ", "123456789");
	}
	
	/**
	 * Comprueba que la consulta con claves correctas se realiza bien y sin
	 * variación en sucesivos intentos.
	 * 
	 * @throws TextoBloqueadoException NO esperada
	 * @throws ClaveMalaException      NO esperada
	 * @throws TextoNuloException      NO esperada
	 */
	@Test
	@DisplayName("Consulta: claves correctas")
	void testConsulta1() throws TextoBloqueadoException, TextoNuloException, ClaveMalaException {
		texto = " ";
		// Preparación
		Partido = new ElementoPartido1X2();
		// Verificaciones
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));
		assertEquals(texto, Partido.setDato(clave));

		texto = "A";
		// Preparación
		Partido = new ElementoPartido1X2();
		// Verificaciones
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));

		texto = "«AÁaá»";
		// Preparación
		Partido = new ElementoPartido1X2(texto, clave);
		// Verificaciones
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
		assertEquals(texto, caja.getTexto(clave));
	}

}
