package DesafioIphone.main;

import DesafioIphone.aparelhotelefonico.Iphone;
import DesafioIphone.navegadorinternet.NavegadorInternet;
import DesafioIphone.reprodutormusical.ReprodutorMusical;

public class Main {
  public static void main(String[] args) {
    // Cria um reprodutor de música
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    // Toca uma música
    reprodutorMusical.tocar();

    // Pausa a música
    reprodutorMusical.pausar();

    // Seleciona uma música
    reprodutorMusical.selecionarMusica();

    // Cria um aparelho telefônico
    Iphone aparelhoTelefonico = new Iphone();

    // Liga o telefone
    aparelhoTelefonico.ligar();

    // Atende uma chamada
    aparelhoTelefonico.atender();

    // Inicia um correio de voz
    aparelhoTelefonico.iniciarCorreiroVoz();

    // Cria um navegador de internet
    NavegadorInternet navegadorInternet = new NavegadorInternet();

    // Exibe uma página
    navegadorInternet.exibirPagina();

    // Adiciona uma nova aba
    navegadorInternet.adicionarNovaAba();

    // Atualiza uma página
    navegadorInternet.atualizarPagina();
  }
}