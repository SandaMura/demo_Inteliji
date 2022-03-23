package FIS.processors;

import FIS.documents.Document;

public class ProcesorCautare implements Procesor {

    private String cautat;

    public ProcesorCautare(String s) {
        cautat = s;
    }

    private boolean exista(String x, String[] tab) {
        for (String s : tab) {
            if(s == null)
                break;
            if (s.equals(x)) return true;
        }
        return false;
    }


    public int proceseaza(Document[] tab) {
        int total = 0;
        for (Document d : tab) {
            if (exista(cautat, d.analizeaza())) {
                total++;
            }
        }
        return total;
    }

}
