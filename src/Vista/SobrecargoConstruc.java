package Vista;

import Modelo.Bidin;

//@author Sebas
public class SobrecargoConstruc {

    public static void main(String[] args) {
        Bidin ob1=new Bidin();
        Bidin ob2=new Bidin(1);
        Bidin ob3=new Bidin(ob1,ob2);
        ob1.impri();
        ob2.impri();
        ob3.impri();
    }

}
