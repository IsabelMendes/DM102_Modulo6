import java.util.ArrayList;
import java.util.List;

public class Metodo6Exemplos {

    public static void main(String[] args) {

        System.out.println("Suas redes sociais são:\n");

        //Facebook
        System.out.println("** Facebook **");
        Facebook facebook = new Facebook();
        facebook.setSenha("123456");
        System.out.println("Sua senha é: "+facebook.getSenha());
        facebook.setNumAmigos(20);
        System.out.println("Você tem "+facebook.getNumAmigos()+" amigos.");
        System.out.println("As ações que você pode fazer são:");
        facebook.compartilhar();
        facebook.fazStreaming();
        facebook.postarFoto();
        facebook.postarVideo();
        facebook.curtirPublicacao();
        facebook.postarComentario();
        System.out.println("\n------------\n");

        //Google Plus
        System.out.println("** GooglePlus **");
        GooglePlus googleplus = new GooglePlus();
        googleplus.setSenha("asdf");
        System.out.println("Sua senha é: "+googleplus.getSenha());
        googleplus.setNumAmigos(10);
        System.out.println("Você tem "+googleplus.getNumAmigos()+" amigos.");
        System.out.println("As ações que você pode fazer são:");
        googleplus.compartilhar();
        googleplus.fazStreaming();
        googleplus.postarFoto();
        googleplus.postarVideo();
        googleplus.curtirPublicacao();
        googleplus.postarComentario();
        System.out.println("\n------------\n");

        //Twitter
        System.out.println("** Twitter **");
        Twitter twitter = new Twitter();
        twitter.setSenha("123");
        System.out.println("Sua senha é: "+twitter.getSenha());
        twitter.setNumAmigos(4444);
        System.out.println("Você tem "+twitter.getNumAmigos()+" amigos.");
        System.out.println("As ações que você pode fazer são:");
        twitter.compartilhar();
        twitter.postarComentario();
        twitter.curtirPublicacao();
        System.out.println("\n------------\n");

        //Instagram
        System.out.println("** Instagram **");
        Instagram instagram = new Instagram();
        instagram.setSenha("123456");
        System.out.println("Sua senha é: "+instagram.getSenha());
        instagram.setNumAmigos(434);
        System.out.println("Você tem "+instagram.getNumAmigos()+" amigos.");
        System.out.println("As ações que você pode fazer são:");
        instagram.postarFoto();
        instagram.postarVideo();
        instagram.curtirPublicacao();
        instagram.postarComentario();

    }


}
