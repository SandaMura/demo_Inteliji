package FIS.documents;

public class JSON extends Document {


    public void createDocJSON() {
        setter(0, "nume1 :");
        setter(1, "valoare1");
        setter(2, "nume2 :");
        setter(3, "valoare2");

    }

    public String[] analizeaza() {
        String secventaAnalizata[] = new String[100];
        int contor = 0;
        for (String sir : (super.getter())) {
            if(sir == null)
                break;
            if (!(sir.charAt(sir.length() - 1) == (':'))) {
                secventaAnalizata[contor] = sir;
                contor++;
            }
        }
        return secventaAnalizata;
    }

    public String toString() {

        String toPrint = "JSON: ";
        for (String sir : (super.getter())) {
            toPrint += (" " + sir);
        }
        return toPrint;

    }
}
