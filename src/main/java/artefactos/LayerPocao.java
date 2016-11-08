package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;

/**
 *
 * @author Trainerpl022
 */
public class LayerPocao extends MapLayer {

    private final int Pocao = 10;
   

    public LayerPocao() {
        generatePocao();
    }

    public void generatePocao() {
        for (int i = 0; i < Pocao; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Pocao();
        }
    }


}
