import java.util.HashMap;
import java.util.Map;

public class PokedexImpl {
    private Pokemon pokemon;
    private Map<String,String> debilidades;
    private String ataque;

    public PokedexImpl(Pokemon pokemon, Map<String,String> debilidades, String ataque) {
        this.pokemon = pokemon;
        this.debilidades = debilidades;
        this.ataque = ataque;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
    public Map<String, String> getDebilidades() {
        return debilidades;
    }
    public String getAtaque() {
        return ataque;
    }

    public static PokemonImpl compararPokemons(PokedexImpl p1, PokedexImpl p2){
        String tipo1 = p1.getPokemon().getTipo();
        String tipo2 = p2.getPokemon().getTipo();

        if (p1.getDebilidades().get(tipo1).equals(tipo2)) {
            return p1.getPokemon();
        }

        if (p2.getDebilidades().get(tipo1).equals(tipo2)) {
            return p2.getPokemon()
        }else
            return null;
    }

    public static void main(String[] args) {
        Map<String,String> debilidades = Map.of(
                "Fuego","Agua",
                "Agua", "Planta",
                "Planta","Fuego"
        );

        Pokemon charmander =new Pokemon("Charmander", "Fuego");
        Pokemon bulbasura =new Pokemon("Bulbasura", "Planta");

        PokedexImpl pokedexCharmander = new PokedexImpl(charmander, debilidades, "Fuego");
        PokedexImpl pokedexBulbasur =new PokedexImpl(bulbasura, debilidades, "Planta");

        Pokemon debil=PokedexImpl.compararPokemons(pokedexCharmander,pokedexBulbasur);

    }
}
