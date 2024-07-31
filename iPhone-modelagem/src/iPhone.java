public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    private Boolean musicaTocando = false;
    private String musicaAtual = "";

    public Boolean getMusicaTocando() {
        return musicaTocando;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void tocar(){
        if (musicaTocando.equals(false)){
            System.out.println("Tocando Musica");
            musicaTocando = true;
        } else {
            System.out.println("Música já está tocando :)");
        }
    }
    public void pausar(){
        if (musicaTocando.equals(true)){
            System.out.println("Pausando a música");
            musicaTocando = false;
        } else {
            System.out.println("Música já está pausada :)");
        }
    }
    public void selecionaMusica(String musica){
        if (musicaAtual.equals(musica)){
            System.out.println(musica + " já está sendo tocada");
        } else {
            System.out.println("Alterando da música " + musicaAtual + "para a música " + musica);
            musicaAtual = musica;
        }
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero)
    }

    public void atender(){
        System.out.println("Triim triim, alguem está ligando");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando aba atual");
    }
}
