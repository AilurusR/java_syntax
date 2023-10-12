public class DatosPrimitivos {
    public static void main  (String args[]) {
        // Variables primitivas

        //Numericas
        //  Enteras
        byte myByte = Byte.MAX_VALUE;
        System.out.println("El valor maximo de byte: " + myByte);
        short myShort = Short.MAX_VALUE;
        System.out.println("El valor maximo de short: " + myShort);
        int myInt = Integer.MAX_VALUE;
        System.out.println("El valor maximo de int: " + myInt);
        long myLong = Long.MAX_VALUE;
        System.out.println("El valor maximo de long: " + myLong);


        //  El tipo de dato byte es el más pequeño de los cuatro, el cual solo tiene    
        //       un byte de capacidad. Y va desde -128 a 127. 
        //  El tipo de dato short tiene una capacidad de dos bytes. Cuyos valores van   
        //        desde el -32,768 a 32,767. 
        //  Mientras que int tiene una capacidad de cuatro bytes. El rango de sus valores es   
        //         -2,147,483,648 al 2,147,483,647
        //  Y finalmente long, el cual tiene una capacidad de ocho bytes. Ademas   
        //        se requiere utilizar el prefijo L para su correcto funcionamiento. 
        //  El uso de uno u otro esta en función de los valores que a lo largo de la    
        //  ejecución del programa se requieran guardar en la variable. 

        //  de coma flotante
        float myFloat = Float.MAX_VALUE;
        System.out.println("El valor maximo de float: " + myFloat);
        double myDouble = Double.MAX_VALUE;
        System.out.println("El valor maximo de double: " + myDouble);

        //  La variable mas pequeña es de tipo float, la cual utiliza cuatro bytes para   
        //        almacenar su valor. El uso de este tipo requiere el prefijo F. 
        //  La otra posibilidad es utilizar el tipo double, el cual no requiere de ningun   
        //        prefijo pero utiliza el doble de bytes para almacener su valor. 
        //  El uso de uno u otro se remite a que es lo que se quiera guardar, ya que    
        //        la precision de uno es más grande que el otro  al igual que la memoria reservada que se   
        //        requiere. 

        //Boolean
        boolean myBoolean = true;
        System.out.println("Los posibles valores de boolean son: " + true + " y " + false);

        //  El tipo de dato boolean solo requiere un bit de almacenamiento, y solo guarda dos    
        //      posibles valores: true or false. 

        //Caracter
        char myChar = 230;
        System.out.println("Este es un ejemplo de un valor asignado por su equivalente numerico \n" +
                " en unicode. 230 = "+ myChar);

        //  El tipo char utiliza dos bytes para su almacenamiento. Puede ser inicializado por   
        //        su valor señalado directamente entre comillas simples o por el valor numero en unicode. 

        Integer myInteger = 0;
        myInteger = Integer.MAX_VALUE;
        //  Todos los tipos  primitivos tienen su implementacion en una clase  digamos mas compleja    
        //        la cual extiende las 'capacidades' de su contraparte primitiva. 

        
    }
}
