package FIS;
import FIS.documents.*;
import FIS.processors.*;

public class main {

    public static void main(String[] args){
        //instantiaza 2 documente
        Document d1=new XML();
        Document d2=new JSON();
        ((XML)d1).createDocXML();
        ((JSON)d2).createDocJSON();

        //instantiaza 3 procesoare
        Procesor p1=new ProcesorCautare("valoare1");
        Procesor p2=new ProcesorCautare("valoare3");
        Procesor p3=new ProcesorCautare("valoare2");


        Procesor p4=new ProcesorCompus(new Procesor[]{p1, p2});

        Procesor p5=new ProcesorCompus(new Procesor[]{p1, p2, p4});

        System.out.println(p5.proceseaza(new Document[]{d1, d2}));
    }

}
