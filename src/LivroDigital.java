public class LivroDigital extends Livro {
    private String marcaDagua;

    public String getMarcaDagua() {
        return marcaDagua;
    }
    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

    public LivroDigital() {
        setTipoCapa(TipoCapaEnum.COMUM);
    }

    public LivroDigital(String titulo, String autor, double valor, Editora editora, int paginas, String resumo, String tipoCapa, String marcaDagua) {
        super(titulo, autor, valor, editora, paginas, resumo, tipoCapa);
        this.marcaDagua = marcaDagua;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nMarca D' Agua: " + this.marcaDagua +
                "\n----------------";
    }
}
