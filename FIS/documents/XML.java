package FIS.documents;

public class XML extends Document {

    public void createDocXML() {
        setter(0, "<tag1>");
        setter(1, "valoare1");
        setter(2, "</tag1>");
        setter(3, "<tag2>");
        setter(4, "</tag2>");
        setter(5, "<tag3>");
        setter(6, "valoare2");
        setter(7, "</tag3>");
    }


    public String[] analizeaza() {
        String secventaAnalizata[] = new String[100];
        int contor = 0;
        for (String sir : (super.getter())) {
            if(sir == null)
                break;
            if (!(sir.charAt(0) == ('<'))) {
                secventaAnalizata[contor] = sir;
                contor++;
            }
        }
        return secventaAnalizata;
    }

    public String toString() {

        String toPrint = "XML: ";
        for (String sir : (super.getter())) {
            toPrint += (" " + sir);
        }
        return toPrint;

    }


}
