package br.ufpb.dcx.aps.atividades.composite.rede;
//
public class Notebook implements ElementoRede{

    private String nome;
    private String ip;

    public Notebook(String nome) {
        this.nome = nome;
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
