package allancslima.circleci.sample

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PokemonUnitTests {

    private val pokemons: List<Pokemon> = listOf(
        Pokemon("Bulbasaur", 49, 49, 16, "grass"),
        Pokemon("Charmander", 52, 43, 16, "fire"),
        Pokemon("Caterpie", 30, 35, 7, "bug"),
        Pokemon("Pidgey", 45, 40, 18, "normal"),
        Pokemon("Squirtle", 48, 65, 16, "water"),
        Pokemon("Ponyta", 85, 55, 40, "fire"),
        Pokemon("Bellsprout", 75, 35, 21, "grass"),
        Pokemon("Pikachu", 55, 40, 16, "electric"),
        Pokemon("Zubat", 45, 35, 22, "poison"),
        Pokemon("Psyduck", 52, 48, 33, "water")
    )

    @Test
    fun foo() {
        assertTrue(pokemons.all { it.attack < 100 })
        assertEquals(536, pokemons.fold(0) { acc, pokemon -> acc + pokemon.attack })
    }

    @Test
    fun pikachu() {
        assertEquals("electric", pokemons.find { it.name == "Pikachu" }?.type)
        assertEquals(55, pokemons.find { it.name == "Pikachu" }?.attack)
    }

    @Test
    fun fire_pokemons() {
        assertEquals(2, pokemons.count { it.type == "fire" })
        assertEquals("fire", pokemons.find { it.name == "Charmander" }?.type)
        assertArrayEquals(arrayOf("Charmander", "Ponyta"), pokemons.filter { it.type == "fire" }
            .map { it.name }.toTypedArray())
    }

}
