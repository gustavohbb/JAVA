
public class Main {

    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];
        Luta luta = new Luta();
        l[0] = new Lutador("Pretty Boy", "Fraça", 31,
                1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29,
                1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35,
                1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28,
                1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Fausto Silva", "Brasil", 73,
                1.88f, 89.6f, 9, 1, 0);
        l[5] = new Lutador("Luciano Hulk", "Brasil", 52,
                1.73f, 100.1f, 8, 2, 1);
        luta.marcarLuta(l[4], l[5]);
        luta.lutar();
    }
}