package ejercicio6_6;

// BigDog extiende Dog y cambia sus saludos
class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    // Nuevo método: saluda específicamente a otro BigDog
    public void greets(BigDog another) {
        System.out.println("Wooooooow");
    }
}

