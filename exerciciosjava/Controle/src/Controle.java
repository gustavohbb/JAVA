public class Controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public Controle() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(50);
    }
    public boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("Tocando: " + this.isTocando());
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }
    @Override
    public void maisVolume() {
         if (this.isLigado()) {
             this.setVolume(this.getVolume() + 5);
         }
    }
    @Override
    public void menosVolume() {
         if (this.isLigado()) {
             this.setVolume(this.getVolume() - 5);
         }
    }
    @Override
    public void ligarMudo() {
         if (this.isLigado() && this.getVolume() > 0) {
             this.setVolume(0);
         }
    }
    @Override
    public void desligarMudo() {
         if (this.isLigado() && this.getVolume() == 0) {
             this.setVolume(50);
         }
    }
    @Override
    public void play() {
         if (this.isLigado()) {
             this.setTocando(true);
         }
    }

    @Override
    public void pause() {
         if (this.isLigado()) {
             this.setTocando(false);
         }
    }
}
