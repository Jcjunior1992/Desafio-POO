import iphone.funcionalidades.AparelhoTelefônico;
import iphone.funcionalidades.NavegadorNaInternet;
import iphone.funcionalidades.RepodutorMusicial;

public class iphone {
    public static void main(String[] args) {
        System.out.println("Iphone Ligado");
        System.out.println("-----------------------");

        NavegadorNaInternet navegador = new NavegadorNaInternet();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();

        System.out.println("----------------------");

        RepodutorMusicial ipod = new RepodutorMusicial();
        ipod.selecionarMuscia();
        ipod.tocar();
        ipod.pausar();

        System.out.println("----------------------");

        AparelhoTelefônico telefonia = new AparelhoTelefônico();
        telefonia.ligar();
        telefonia.Atender();
        telefonia.iniciarCorrerioVoz();


    }
}