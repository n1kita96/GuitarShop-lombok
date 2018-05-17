import lombok.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mykyta Shvets
 */

@Data
@EqualsAndHashCode(of = {"brand", "model"})
@ToString(exclude = "materials")
public class Guitar {
    private String brand;
    private String model;
    private int strings = 6;
    private boolean hasTrussRod;

    public enum Wood {SPRUCE, CEDAR, MAHOGANY, ROSEWOOD, ALDER, BASSWOOD}

    private Map<Wood, Integer> materials = new HashMap<>();

    public boolean isClassic(){
        return !hasTrussRod &&
                (materials.getOrDefault(Wood.CEDAR, 0) >= 75 ||
                        materials.getOrDefault(Wood.ROSEWOOD, 0) >= 70);
    }

    public boolean isDreadnought(){
        return hasTrussRod &&
                materials.getOrDefault(Wood.MAHOGANY, 0) >= 80;
    }

}
