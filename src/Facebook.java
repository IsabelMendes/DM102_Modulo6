public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    @Override
    public void compartilhar() {
        System.out.println("Compartilhar fotos e vídeos");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Assistir vídeos.");

    }
}

