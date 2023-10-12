public class Operadores {
    public static void main(String args[]){
        //Variables Constantes
        //Una constante es una variable a la cual se antepuso la palabra final antes de establecer
        //su tipo durante su declaración. Esto hara que una vez inicializada la variable sea imposible
        //sobre escribir o asignar un nuevo valor a la variable. La hace inmutable.
        final float pi = 3.1416F;

        //Asignación
        int myInt = 4; //asigna un valor...
        myInt += 4; // acumula el nuevo valor al antiguo
        System.out.println(myInt);
        myInt -= 4; // extrae el valor indicado al antiguo
        System.out.println(myInt);
        myInt *= 2;
        System.out.println(myInt);
        myInt /= 2;
        System.out.println(myInt);
        myInt %= 3;
        System.out.println(myInt);
        /*
        *En general funciona con cada uno de los cinco operadores artimeticos.
         */


        //Aritmeticos
        int radio = 2;
        float area;

        radio = 2 + 2;
        radio = radio - 3;
        area = pi * radio * radio;
        float perimeto = (area / radio) * 2;
        float divEntera = area % 3; // regresa el residuo de una divición entera
        System.out.println(10/9);   // Si los operandos son numeros enteros (sin importar el signo) se hara
                                    // una división entera, a menos que se indique lo contrario mediante casteo.
        //Decremento e incremento
        int unidad = 1;
        System.out.println("Valor inicial: " + unidad);
        unidad++;
        System.out.println("Valor incrementado: " + unidad);
        unidad--;
        System.out.println("Valor decrementado: " + unidad);

        //Logicos y relacionales

        boolean puedeComprarlo;
        int presupuesto = 50;
        int costoProducto = 60;
        int descuento = 10;

        puedeComprarlo = presupuesto >= costoProducto;
        System.out.println("A precio normal no puede comprarlo: " + puedeComprarlo);
        System.out.println("Pero con un descuento si: " + (presupuesto >= (costoProducto - descuento)));

        boolean bol01 = 5 < 7; // true
        boolean bol02 = 5 > 7; // false
        boolean bol03 = 3 >= 3; // true
        boolean bol04 = 3 <= 3; // true

        boolean bol05 = presupuesto == costoProducto; //revisa una igualdad
        boolean bol06 = presupuesto != costoProducto; //corrobora que no sean iguales
        System.out.println("El costo y el presupuesto, son iguales? " + bol05);
        System.out.println("El costo y el presupuesto, son diferentes? " + bol06);

        boolean bol07 = true;
        boolean bol08 = false;

        /*
         * Los operadores logicos: &&, ||, ! (and, or, not) funcionan como
         * sus respectivas puertas lógicas.
         */
        System.out.println(bol07 && bol08);
        System.out.println(bol07 || bol08);
        System.out.println(!bol07);

        //Concatenación
        String cad01 = "Esta es la mitad de la cadena";
        String cad02 = ", y esta la segunda mitad.";
        String cadena = cad01 + cad02;
        System.out.println(cadena);

        /*
         *Existen más operadores cuya función es más especifica...
         *quiza no especifica, pero si con una función más particular.
         *Por ejemplo, >> el cual corresponde al corrimiento de bits.
         */

    }
}
