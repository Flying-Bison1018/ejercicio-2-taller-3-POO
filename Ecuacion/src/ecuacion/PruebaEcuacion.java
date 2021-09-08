
package ecuacion;


public class PruebaEcuacion {

    public static void main(String[] args) {
        Ecuacion e = new Ecuacion();
        e.setA(2);
        e.setB(6);
        e.setC(7);
        double x = 0;
        System.out.println("el valor de Y:"+e.evaluarEcuacion(x));
    }
    
}
