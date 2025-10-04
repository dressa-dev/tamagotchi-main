package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal {
    public Gato() {
        super(80, 40, 70);
    }

    @Override
    public void brincar() {
        energia -= 15;
        fome += 10;
        felicidade += 20;
    }

    @Override
    public void comer() {
        fome -= 20;
        energia += 10;
    }

    @Override
    public void dormir() {
        energia += 30;
        fome += 5;
    }

    @Override
    public void turno() {
        energia -= 5;
        fome += 5;
        felicidade -= 5;
    }
}
