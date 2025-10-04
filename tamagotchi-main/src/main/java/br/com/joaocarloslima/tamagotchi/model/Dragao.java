package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal {
    public Dragao() {
        super(150, 70, 60);
    }

    @Override
    public void brincar() {
        energia -= 30;
        fome += 20;
        felicidade += 30;
    }

    @Override
    public void comer() {
        fome -= 40;
        energia += 20;
    }

    @Override
    public void dormir() {
        energia += 50;
        fome += 15;
    }

    @Override
    public void turno() {
        energia -= 15;
        fome += 20;
        felicidade -= 10;
    }
}
