package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal {
    public Cachorro() {
        super(100, 50, 80);
    }

    @Override
    public void brincar() {
        energia -= 20;
        fome += 15;
        felicidade += 25;
    }

    @Override
    public void comer() {
        fome -= 25;
        energia += 15;
    }

    @Override
    public void dormir() {
        energia += 40;
        fome += 10;
    }

    @Override
    public void turno() {
        energia -= 10;
        fome += 10;
        felicidade -= 5;
    }
}
