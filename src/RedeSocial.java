public abstract class RedeSocial {

    protected String senha;
    private int numAmigos;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

    public void postarFoto (){
        System.out.println("Postar fotos");

    }

    public void postarVideo(){
        System.out.println("Postar vídeos");

    }
    public void postarComentario(){
        System.out.println("Postar comentários");

    }
    public void curtirPublicacao (){
        System.out.println("Curtir publicações");

    }

     }
