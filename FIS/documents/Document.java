package FIS.documents;

public abstract class Document {

    private String[] secventa=new String[100];
    public abstract String[] analizeaza();
    public String[] getter(){
        return secventa;
    }
    public void setter(int index, String s)
    {
        secventa[index]=s;
    }

}

