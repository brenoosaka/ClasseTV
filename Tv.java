class Tv {
    private int canal;
    private int volume;

    public Tv() {
        canal = 1;
        volume = 30;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("O volume já está no máximo!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        } else {
            System.out.println("O volume já está no mínimo!");
        }
    }

}