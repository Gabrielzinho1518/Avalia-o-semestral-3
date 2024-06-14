package pacote;
 
public class Atleta implements Comparable<Atleta> {
    private String nome;
    String altura;
    private String apelido;
    private String posição;

        @Override
        public int compareTo(Atleta outroAtleta) {
            return this.nome.compareTo(outroAtleta.nome);
        }
    //construtor:
    public Atleta(String nome, String altura, String apelido, String posição) {
        this.nome = nome;
        this.altura =  altura;
        this.apelido = apelido;
        this.posição = posição;
        
    }
    
    //getters:
    public String getNome() {
        return nome;
    }

    @Override
	public String toString() {
		return "Atleta [nome=" + nome + ", altura=" + altura + ", apelido=" + apelido + ", posicao=" + posição + "]";
	}
	public String getAltura() {
        return altura;
    }

    public String getApelido() {
        return apelido;
    }

    public String getPosição() {
        return posição;
    }
}
