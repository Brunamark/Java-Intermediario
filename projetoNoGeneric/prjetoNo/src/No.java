public class No<T> {
    private T conteudo;
    private No<T> proximoNo = null;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() ;/*+ "'" +
            ", proximoNo='" + getProximoNo() + "'" +
            "}";*/
    }
   

}
