public class no {

    private String conteudo;
    private no proximoNo;

    public no(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo; 

    }
     public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public no getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(no proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() ; /*
            ", proximoNo='" + getProximoNo() + "'" +
            "}";*/
    }

/*    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }*/
}
