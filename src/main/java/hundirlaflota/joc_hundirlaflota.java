package hundirlaflota;

import java.util.ArrayList;
import java.util.Scanner;

public class joc_hundirlaflota {
    public static String[][] taulell = new String[11][11];
    public static ArrayList<String> ocupadas = new ArrayList<String>();
    public static ArrayList<String> repetidas = new ArrayList<String>();
    public static ArrayList<String> posfinal = new ArrayList<String>();
    public static String user;
    public static int posx;
    public static int posy;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<vaixell> vaixells = new ArrayList<vaixell>();
        int intents = 0;
        omplir();

        for (int i = 0; i < 2; i++) {
            genenarvaixells(3);
            vaixell nautic = new vaixell(3, "Acorazado", posfinal.get(i));
            vaixells.add(nautic);
        }
        for (int i = 2; i < 5; i++) {
            genenarvaixells(2);
            vaixell nautic = new vaixell(2, "Buque", posfinal.get(i));
            vaixells.add(nautic);
        }
        for (int i = 5; i < 9; i++) {
            genenarvaixells(1);
            vaixell nautic = new vaixell(1, "Submarino", posfinal.get(i));
            vaixells.add(nautic);
        }
        genenarvaixells(4);
        vaixell nautic = new vaixell(4, "Portaavion", posfinal.get(9));
        vaixells.add(nautic);

        for (int i = 0; i < vaixells.size(); i++) {
            System.out.println(vaixells.get(i).toString());
        }
        do {
            System.out.println(vaixells.size() + " " + vaixells.toString());
            System.out.println("Introdueix la posició i lletra del vaixell: ");
            String jugador = kb.nextLine();
            posx = lletraanum(jugador);
            posy = Integer.parseInt(jugador.substring(1));
            String posxy = posx + "," + posy;
            System.out.println(posxy);
            boolean comprobacio = false;
            if (posx == 0 || posy > 10) {
                System.out.println("Introdueix una posició vàlida: " + posx + posy);
            } else {
                comprobacio = false;
                for (int i = 0; i < vaixells.size(); i++) {
                    String posvaixell = vaixells.get(i).getPosicio();
                    if (posvaixell.contains(posxy) == true) {
                        taulell[posx][posy] = "+";
                        System.out.println("Bien has dado a un barco");
                        comprobacio = true;
                        vaixells.get(i).tocat(posx, posy);
                        if (vaixells.get(i).posicions() == vaixells.get(i).getMida()) {
                            System.out.println("ENFONSAT!");
                            System.out.println("Has enfonsat un " + vaixells.get(i).getNom());
                            for (int o = 0; o < vaixells.get(i).posvaixellx.size(); o++) {
                                taulell[vaixells.get(i).posvaixellx.get(o)][vaixells.get(i).posvaixelly.get(o)] = "X";
                            }
                            vaixells.remove(i);
                        }
                    }
                }
            }
            if (comprobacio == false) {
                System.out.println("Agua");
                taulell[posx][posy] = Character.toString((char) 126);
            }
            mostartaulell();
            intents++;
            if (vaixells.size() == 0) {
                break;
            }

        } while (intents != 25);
    }

    private static int lletraanum(String jugador) {
        return 0;
    }

    private static void omplirtaulell() {
    }

    private static void genenarvaixells(int i) {
    }

    private static void mostartaulell() {
    }

    private static void omplir() {
    }
}