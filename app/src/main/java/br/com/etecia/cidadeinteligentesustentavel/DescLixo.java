package br.com.etecia.cidadeinteligentesustentavel;

public class DescLixo {

    private String titulo;
    private String descricao;
    private String catrgoria;
    private int imagem;


    public DescLixo(String titulo, String descricao, String catrgoria, int imagem){
        this.titulo = titulo;
        this.descricao = descricao;
        this.catrgoria = catrgoria;
        this.imagem = imagem;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCatrgoria() {
        return catrgoria;
    }

    public void setCatrgoria(String catrgoria) {
        this.catrgoria = catrgoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
