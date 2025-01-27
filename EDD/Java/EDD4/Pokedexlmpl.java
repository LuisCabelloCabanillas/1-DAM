public class Pokedexlmpl {
    public class PokedexImpl {
        private Pokemon pokemon;
        private Map<String,String> debilidades;
        private String ataque;
        private Pokemon comparador;

        public PokedexImpl(Pokemon pokemon, Map<String,String> debilidades, String ataque, Pokemon comparador) {
            this.pokemon = pokemon;
            this.debilidades = debilidades;
            this.ataque = ataque;
            this.comparador = comparador;
        }

    }
}
