public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 7;


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false; 
    }

    public void aumentarVolume() {
        if (volume == 100) {
            System.out.println(volume);
        }else {
            volume++;
            System.out.println(volume);
        }
    }

    public void diminuirVolume() {
        if (volume == 0) {
            System.out.println(volume);
        }else {
            volume--;
            System.out.println(volume);
        }
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}