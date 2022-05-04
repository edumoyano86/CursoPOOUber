import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayListMap<String> seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayListMap<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}