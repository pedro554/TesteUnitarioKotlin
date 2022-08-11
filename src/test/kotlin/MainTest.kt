import org.junit.jupiter.api.*

class MainTest {
    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            { Assertions.assertFalse(countXO("xxooo")) },
            { Assertions.assertEquals(countXO("xxoo"), true) },
            { Assertions.assertTrue(countXO("xXoo")) },
            { Assertions.assertTrue(countXO("XXOO")) },
        )
    }

    @Test
    @Disabled
    fun naoImplementado() { }

    @Test
    fun vaiFalhar() {
        fail("Não pode terminar o teste sem este metodo")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { excecao() }
    }
}