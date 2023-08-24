package smartphone;
import usabilidades.multifuncional;
import usabilidades.telefone;
import usabilidades.reprodutorMusica;
import usabilidades.navegadorInternet;
public class Iphone {
    public static void main(String[] args) {
        multifuncional iphone = new multifuncional(); 
        telefone tel = iphone;
        navegadorInternet internet = iphone;
        reprodutorMusica reprodutor = iphone;
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.correioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
