import org.junit.jupiter.api.*

class MainTest {
//    @Test
//    @DisplayName("Teste metodo xxoo")
//    fun testCountXO() {
//        Assertions.assertAll(
//            {Assertions.assertTrue(countXO("xxoo"))},
//            { Assertions.assertFalse(countXO("xxooo")) },
//            { Assertions.assertEquals(countXO("xxoo"), true) },
//            { Assertions.assertTrue(countXO("xXoo")) },
//            { Assertions.assertTrue(countXO("XXOO")) },
//        )
//    }
//
//    @Test
//    @Disabled
//    fun naoImplementado() { }
//
//    @Test
//    fun vaiFalhar() {
//        fail("Não pode terminar o teste sem este metodo")
//    }
//
//    @Test
//    fun assumption() {
//        Assumptions.assumeTrue(countXO("xxoo"))
//        Assertions.assertTrue(abc())
//    }
//
//    @Test
//    fun exception() {
//        assertThrows<NullPointerException> { excecao() }
//    }

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(0, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")
        Assertions.assertEquals(portaria(24, "abc", ""), "Negado.")
        Assertions.assertEquals(portaria(24, "comun", "abc"), "Negado.")
        Assertions.assertEquals(portaria(24, "comun", "xt"), "Welcome.")
        Assertions.assertEquals(portaria(24, "premium", "abc"), "Negado.")
        Assertions.assertEquals(portaria(24, "premium", "xl"), "Welcome.")
        Assertions.assertEquals(portaria(24, "luxo", "abc"), "Negado.")
        Assertions.assertEquals(portaria(24, "luxo", "xl"), "Welcome.")
    }
}