public class Usuario {
    public static void main (String[] args){
        iPhone smartPhone = new iPhone();

        smartPhone.adicionarNovaAba();
        smartPhone.atender();
        smartPhone.atualizarPagina();
        smartPhone.ligar("(11)99999-9999");
        smartPhone.selecionarMusica("The Beatles - Eleonor Rigby");
        smartPhone.exibirPagina("https://teste.com");
        smartPhone.pausar();
        smartPhone.iniciarCorreioVoz();


    }

}
