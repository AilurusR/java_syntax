public class Casteo {
    public static void main(String args[]){
        /*
         *El casteo o casting consiste en convertir una varieable de un tipo
         *en otro, por ejemplo de tipo double a int. El casteo no siempre es un proceso
         *lineal (sim complicaciones), ya que se corre el riesgo de perder información
         *durante el proceso.
         */
        int raiz = (int) Math.sqrt(10); //sqrt regresa un valor de tipo double, por lo que se requiere hacer
                                        //casting a int para poder almacernarlo como un tipo entero
                                        //pero en el proceso se pierden los decimales.
        System.out.println(raiz);

        String text = "23"; //Se declara un String
        /*
         *En java t0do es un on objeto, esto significa que t0do hereda de la clase padre
         *object. Esto significa que siempre se puede hacer casteo hacia esta clase, aunque esto
         *tiene el inconveniente de que se perderan atributos y metodos (de ser el caso).
         *Al t0do provenir de esta clase, t0do puede ser almacenado como object.
         */
        Object num = Integer.valueOf(text); //Se ocupa un metodo de la clase Integer para hacer
                                            //casting de string a integer. Y se guarda en la clase object para
                                            //poder utilizar un metodo propio de la clase object que nos permite
                                            //saber el tipo de clase que es la variable que guarda.
        System.out.println(num.getClass());
        System.out.println((int)num + 7);   //Como num es de tipo object (aunque el valor que almacena es de
                                            //tipo integer) no se puede realizar una operación aritmetica...
                                            //porque oficialmente es de tipo object. Se requiere hacer casting
                                            //a int para poder operar sobre el.


        /*
         *En java hay dos tipos de clases, las que forman parte del lenguaje (por decirlo de una forma)
         *y las declaradas por el usuario. Java tiene muchas clases que resuelven ciertas necesidades
         *una de estas es la clase Math, la cual contiene metodos y atributos que dan soporte a operaciones
         *aritmeticas más alla de las cinco cotidianas.
         */

    }
}
