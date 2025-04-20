package edificio;

import java.util.ArrayList;
import java.util.List;
import moradores.Morador; 

public class Apartamento {
    private int numero;
    private int andar;
    private double metragem;
    private String situacao; 
    private List<Morador> moradores;

    public Apartamento(int numero, int andar, double metragem, String situacao) {
        this.numero   = numero;
        this.andar    = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    public int getNumero()       { return numero; }
    public int getAndar()        { return andar; }
    public double getMetragem()  { return metragem; }
    public String getSituacao()  { return situacao; }
    public List<Morador> getMoradores() { return moradores; }

    public void setNumero(int numero)         { this.numero = numero; }
    public void setAndar(int andar)           { this.andar = andar; }
    public void setMetragem(double metragem)  { this.metragem = metragem; }
    public void setSituacao(String situacao)  { this.situacao = situacao; }

    public void adicionarMorador(Morador m) {
        moradores.add(m);
    }

    public boolean removerMorador(Morador m) {
        return moradores.remove(m);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartamento ").append(numero)
          .append(" (Andar ").append(andar)
          .append(", ").append(metragem).append("m²")
          .append(", ").append(situacao).append(")\n");
        sb.append("  Moradores:\n");
        if (moradores.isEmpty()) {
            sb.append("    — nenhum —\n");
        } else {
            for (Morador m : moradores) {
                sb.append("    • ").append(m).append("\n");
            }
        }
        return sb.toString();
    }
}
