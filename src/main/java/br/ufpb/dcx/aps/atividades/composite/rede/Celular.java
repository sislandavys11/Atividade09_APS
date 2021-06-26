package br.ufpb.dcx.aps.atividades.composite.rede;
//
public class Celular extends ElementoRedeComposto{
    public Celular(String nome,String ip) {
        super(nome,ip);
    }

    public Celular(String nome) {
        super(nome);
    }
}
