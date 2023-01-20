public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        /*
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
        */

        int resultadoSumaTresNumeros = sumaTresNumeros(10,5,95);
        System.out.println("Suma total de 3 numeros : " + resultadoSumaTresNumeros);


        //Ejercicio 2
        /*Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.*/

        Coche miCoche = new Coche();
        System.out.println("Numero de puertas : " + miCoche.getPuertas());
        miCoche.setPuertas(4);
        System.out.println("Numero de puertas : " + miCoche.getPuertas());

    }

    private static int sumaTresNumeros(int a, int b, int c) {
        return a+b+c;
    }
}