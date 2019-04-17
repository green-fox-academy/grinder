package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = new ArrayList<>();
        pokemonOfAsh.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemonOfAsh.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemonOfAsh.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemonOfAsh.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemonOfAsh.add(new Pokemon("Kingler", "water", "fire"));

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "fire", "water");

        // Which pokemon should Ash use?

        System.out.print("I choose you, " + choosePokemon(pokemonOfAsh, wildPokemon));
    }

    public static String choosePokemon(List<Pokemon> listPokemon, Pokemon enemy) {
        for (Pokemon pokemon : listPokemon) {
            if (pokemon.isEffectiveAgainst(enemy)) {
                return pokemon.name;
            }
        }

        return "No";

    }
}