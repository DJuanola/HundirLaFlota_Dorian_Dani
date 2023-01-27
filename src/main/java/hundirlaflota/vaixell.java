package hundirlaflota;
import java.util.ArrayList;

public class vaixell {
    private String nom;
    private int mida;
    private String posicio;
    public ArrayList<Integer> posvaixellx = new ArrayList<Integer>();
    public ArrayList<Integer> posvaixelly = new ArrayList<Integer>();

    public vaixell(int mida, String nom, String posicio) {
        this.mida = mida;
        this.nom = nom;
        this.posicio = posicio;
    }

    public int getMida() {
        return mida;
    }

    public void setMida(int mida) {
        this.mida = mida;
    }

    public String getNom() {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }

    public int posicions() {
        return this.posvaixellx.size();
    }

    public void tocat(int fila, int columna) {
        this.posvaixellx.add(fila);
        this.posvaixelly.add(columna);
    }

    @Override
    public String toString() {
        return "Vaixell{" + "nom=" + nom + ", mida=" + mida + ", posicio=" + posicio + '}';
    }
}
