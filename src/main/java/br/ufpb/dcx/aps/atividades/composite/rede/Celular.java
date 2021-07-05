package br.ufpb.dcx.aps.atividades.composite.rede;
//
public class Celular implements ElementoRede{

    private String nome;
    private String ip;

    public Celular(String nome) {
        this.nome = nome;
    }
    public Celular(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getIp() {
        return ip;
    }

    @Override
    public void setIp(String s) {
        this.ip = ip;
    }
}
