package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import classes.Tradutor;

public class TradutorTeste {
    
    @Test
    public void traduzUmaPalavra() {
        Tradutor t = new Tradutor();
        t.adicionarTraducao("Olá", "Hello");
        assertEquals("Hello", t.traduzir("Olá"));
    }

    @Test
    public void traduzDuasPalavras() {
        Tradutor t = new Tradutor();
        t.adicionarTraducao("Olá", "Hello");
        t.adicionarTraducao("Bom", "Good");
        assertEquals("Hello", t.traduzir("Olá"));
        assertEquals("Good", t.traduzir("Bom"));
    }

    @Test
    public void traduzFrase() {
        Tradutor t = new Tradutor();
        t.adicionarTraducao("Olá", "Hello");
        t.adicionarTraducao("Tudo", "All");
        t.adicionarTraducao("Bom", "Good");
        assertEquals("Hello All Good ", t.traduzFrase("Olá Tudo Bom"));
    }

    @Test
    public void traduzUmaPalavraDoisSignificados() {
        Tradutor t = new Tradutor();
        t.adicionarTraducao("Olá", "Hello");
        t.adicionarTraducao("Bom", "Good, Nice");
        assertEquals("Good, Nice", t.traduzir("Bom"));
    }
}
