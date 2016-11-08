package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;

/**
 *
 * @author Trainerpl022
 */
public class LayerOuro extends MapLayer {

    private final int Ouro = 5;
   

    public LayerOuro() {
        generateOuro();
    }

    public void generateOuro() {
        for (int i = 0; i < Ouro; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Ouro2();
        }
    }


}


