public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA NUMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA DA URL " + url);
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MUSICA " + musica);
    }
}
