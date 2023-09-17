import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controle c = new Controle();
        for (;;) {
            System.out.println("1-Ligar/Desligar\n2-Menu\n3-Mais Volume 4-Menos Volume\n5-Mute|Unmute\n6-Play|Pause\n0-Encerrar");
            int opc = in.nextInt();
            switch (opc) {
                case 1:
                    if (c.isLigado()) {
                        c.desligar();
                    } else {
                        c.ligar();
                    }
                    break;
                case 2:
                    c.abrirMenu();
                    c.fecharMenu();
                    break;
                case 3:
                    c.maisVolume();
                    break;
                case 4:
                    c.menosVolume();
                    break;
                case 5:
                    if (c.getVolume() > 0) {
                        c.ligarMudo();
                    } else {
                        c.desligarMudo();
                    }
                    break;
                case 6:
                    if (c.isTocando()) {
                        c.pause();
                    } else {
                        c.play();
                    }
                    break;
                default:
                    break;
            }
            if (opc == 0) {
                break;
            }
        }
    }
}