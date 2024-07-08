package classes;

import java.util.HashMap;

public class Tradutor {

    private HashMap<String, String> traducoes = new HashMap<>();

    public void adicionarTraducao(String palavra, String traducao) {
        this.traducoes.put(palavra, traducao);
    }

    public String traduzir(String palavra) {
        return traducoes.get(palavra);
    }

    public String traduzFrase(String frase) {
        String[] palavras = frase.split(" ");
        String fraseTraduzida = "";
        for (String palavra : palavras) {
            String traducao = traduzir(palavra);
            fraseTraduzida += traducao + " ";
        }

        fraseTraduzida.trim();
        return fraseTraduzida;
    }
    
}
