/**
 * @author Mykyta Shvets
 */
public class PopularGuitars {
    public static final Guitar Fender = newFender();

    static Guitar newFender() {
        final Guitar guitar = new Guitar();
        guitar.setBrand("Fender");
        guitar.setModel("dg8s nat");
        guitar.getMaterials().put(Guitar.Wood.MAHOGANY, 95);
        guitar.getMaterials().put(Guitar.Wood.BASSWOOD, 5);
        guitar.setHasTrussRod(true);
        guitar.setStrings(6);
        return guitar;
    }

    public static final Guitar Gibson = newGibson();

    static Guitar newGibson() {
        final Guitar guitar = new Guitar();
        guitar.setBrand("Gibson");
        guitar.setModel("Les Paul 60");
        guitar.getMaterials().put(Guitar.Wood.ALDER, 100);
        guitar.setHasTrussRod(true);
        guitar.setStrings(6);
        return guitar;
    }

    public static final Guitar Ibanez = newIbanez();

    static Guitar newIbanez() {
        final Guitar guitar = new Guitar();
        guitar.setBrand("Ibanez");
        guitar.setModel("GA35TCE");
        guitar.getMaterials().put(Guitar.Wood.ROSEWOOD, 80);
        guitar.getMaterials().put(Guitar.Wood.MAHOGANY, 20);
        guitar.setHasTrussRod(false);
        guitar.setStrings(6);
        return guitar;
    }
}
