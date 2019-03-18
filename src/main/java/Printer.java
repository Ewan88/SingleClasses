public class Printer {

    private int sheets, tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets() {
        return sheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void Print(int nPages, int nCopies){ // 10, 10
        int total = nPages * nCopies; // 10
        if (sheets >= total && tonerVolume >= total){ // true
            sheets -= (nPages * nCopies);
            tonerVolume -= (nPages * nCopies);
        }
    }

    public void Refill(int nSheets, int vToner){
        sheets += nSheets;
        tonerVolume += vToner;
    }

}
