public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando pelo GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Vendo video pelo GooglePlus");

    }
}
