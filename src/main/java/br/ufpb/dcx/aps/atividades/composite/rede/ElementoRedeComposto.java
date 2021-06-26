package br.ufpb.dcx.aps.atividades.composite.rede;
//
import java.util.LinkedList;
import java.util.List;

public class ElementoRedeComposto implements ElementoRede{

    private String ip;

    private  String nome;

    private List<ElementoRede> elementoRedes = new LinkedList<>();

    public ElementoRedeComposto(String nome, String ip) {
        this.ip = nome;
        this.nome = ip;
    }

    public ElementoRedeComposto(String nome) {
        this.nome = nome;
    }


    public List<ElementoRede> getElementoRedes() {
        return elementoRedes;
    }

    public void addElementoRede(ElementoRede componente){

        elementoRedes.add(componente);
    }

    public List<ElementoRede> getElementos() {
        return elementoRedes;
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
