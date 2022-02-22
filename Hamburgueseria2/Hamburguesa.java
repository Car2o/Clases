package Hamburgueseria2;

public class Hamburguesa {
    protected int tamanho, tipo, contador;
    protected boolean servido = false;
    protected double precio;
    protected String servido2,tamanho2,tipo2;
    public void servir() {
        servido = true;
    }

    public Hamburguesa(int tamanho, int tipo, int contador) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.contador = contador;
        final boolean vegetariana = tipo == 1;
        final boolean simple = tipo == 2;
        final boolean doble = tipo == 3;
        final boolean grande = tamanho == 3;
        final boolean pequenha = tamanho == 1;
        final boolean mediana = tamanho == 2;

        if (vegetariana && pequenha) {
            precio = 1;

        }

        if (vegetariana && mediana) {
            precio = 1.5;
        }

        if (vegetariana && grande) {
            precio = 2;
        }

        if (simple && pequenha) {
            precio = 1.5;
        }
        if (simple && mediana) {
            precio = 2;
        }
        if (simple && grande) {
            precio = 2.5;
        }
        if (doble && pequenha) {
            precio = 2;
        }
        if (doble && mediana) {
            precio = 2.5;
        }
        if (doble && grande) {
            precio = 3;
        }
        if (!servido){
            servido2 = "Pedido";
        }else if(servido){
            servido2 = "Servido";
        }
        if (tipo == 1){
            tipo2 = "Vegetariana";
        }else if(tipo == 2){
            tipo2 = "Simple";
        }else if(tipo == 3){
            tipo2 = "Doble";
        }

        if (tamanho == 1){
            tamanho2 = "Pequeña";
        }else if(tamanho == 2){
            tamanho2 = "Mediana";
        }else if(tamanho == 3){
            tamanho2 = "Grande";
        }

    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido: "+contador+
                " Hamburguesa:" +
                " tipo: " + tipo2 +
                " tamanho: " + tamanho2 +
                " servido: " + servido2 +
                " precio: " + precio + "\n";
    }

}
