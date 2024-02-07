public class Jogo {

    protected String nome;
    protected String genero;
    protected Double valor;
    protected Integer anoLancamento;
    protected Integer qtdJogos;


    public Jogo(String nome, String tipoJogo, Double valor, Integer anoLancamento, Integer qtdJogos) {
        this.nome = nome;
        this.genero = tipoJogo;
        this.valor = valor;
        this.anoLancamento = anoLancamento;
        this.qtdJogos = qtdJogos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoJogo() {
        return genero;
    }

    public void setTipoJogo(String tipoJogo) {
        this.genero = tipoJogo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getQtdJogos() {
        return qtdJogos;
    }

    public void setQtdJogos(Integer qtdJogos) {
        this.qtdJogos = qtdJogos;
    }

    public void RetornarNomeJogo() {
        System.out.println("O jogo escolhido para a compra é " + nome);
    }

    public void RetornarValorTotal(){
        Double resultado = qtdJogos * valor;
        System.out.println("Você selecinou " + qtdJogos + " jogos, no valor de " + valor + " cada. Totalizando o valor da compra em: " + resultado);
    }

    public void RetornarIdadeJogo() {
        Integer anoAtual = 2024;
        Integer idadeJogo = (anoAtual - anoLancamento);

        if (idadeJogo.equals(1)) {
            System.out.println("O jogo foi lançado há " +  idadeJogo + " ano.");
        } else if (anoLancamento.equals(anoAtual)) {
            System.out.println("O jogo foi lançado em " +  anoLancamento + ".");
        } else if (idadeJogo >= 2) {
            System.out.println("O jogo foi lançado há " +  idadeJogo + " anos");
        } else {
            System.out.println("O jogo será lançado em " + anoLancamento);
        }
    }

    @Override
    public String toString() {
        return """
           Nome: %s
           Gênero: %s
           Preço: %.2f
           Ano de Lançamento: %d
           Quantidade de jogos: %d
           """.formatted(nome, genero, valor, anoLancamento, qtdJogos);
    }


    //%s: String
    //%d: Integer
    //%f: Double
    //%b: Boolean
}
