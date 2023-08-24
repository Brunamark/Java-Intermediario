package usabilidades;
import usabilidades.navegadorInternet;
import usabilidades.reprodutorMusica;
import usabilidades.telefone;
public class multifuncional implements navegadorInternet, reprodutorMusica,telefone {
    public void tocar(){
        System.out.println("Tocando musica smartphone");
    }
    public void pausar(){
        System.out.println("Pausando musica no smartphone");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica no smartphone");
    }
    public void ligar(){
        System.out.println("Fazendo chamada no smartphone");
    }
    public void atender(){
        System.out.println("Atendendo chamada no smartphone");
    }
    public void correioVoz(){
        System.out.println("Acionando correio de voz no smartphone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo pagina no smartphone");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicioanndo nova aba no smartphone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizanfo pagina no smartphone");
    }
    
    
    
}
