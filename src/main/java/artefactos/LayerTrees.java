/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import static gui.Map.BRANCHESCOUNT;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;
import gui.Tree;

/**
 *
 * @author Trainerpl022
 */
public class LayerTrees extends MapLayer {
    public LayerTrees() {
        super();
        
        generateTrees();
        
        this.objectos[5][5] = new Tree2();
        this.objectos[7][3] = new Tree2();
        this.objectos[8][2] = new Tree2();
        this.objectos[7][7] = new Tree2();
        this.objectos[7][8] = new Tree2();
    }
    
    public void generateTrees() {
		for (int i=0; i < TREECOUNT; i++)
			this.objectos[_rand.nextInt(COLUMNS)][_rand.nextInt(LINES)] = new Tree2();
    }
}