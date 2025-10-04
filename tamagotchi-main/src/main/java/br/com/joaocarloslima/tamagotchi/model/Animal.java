package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {
    protected int energia;
    protected int fome;
    protected int felicidade;

    public Animal(int energia, int fome, int felicidade) {
        this.energia = energia;
        this.fome = fome;
        this.felicidade = felicidade;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();
}
