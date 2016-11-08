/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;
import script.Orc;
import script.Spider;

/**
 *
 * @author Trainerpl022
 */
public class LayerFoes extends MapLayer {

    private final int ORCS = 10;
    private final int SPIDERS = 10;
    

    public LayerFoes() {
        generateOrcs();
        generateSpiders();
    
    }

    public void generateOrcs() {
        for (int i = 0; i < ORCS; i++) {
           for (int j = 0;j < LINES; j++){
               if (j%2 == 0)
                this.objectos[4][j] = new Orc();
                   
           }
            
        }
    }

    public void generateSpiders() {
        for (int i = 0; i < SPIDERS; i++) {
            this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Spider();
            
        }
     
    
    }
}