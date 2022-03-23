package FIS.processors;

import FIS.documents.Document;

public class ProcesorCompus implements Procesor {

    private Procesor[] secventaProcesoare = new Procesor[100];

    public ProcesorCompus(Procesor[] p) {
        secventaProcesoare = p;
    }


    public int proceseaza(Document[] tab) {
        int total = 0;
        for (Procesor p : secventaProcesoare) {
            total += p.proceseaza(tab);
        }
        return total;
    }

}
