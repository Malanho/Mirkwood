/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.Map;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class Ouro2 extends MapObject {
    
    public Ouro2() {
        super();
        setSymbol(SymbolsMirk.Ouro);
       
        setForegroundColor(new TextColor.RGB(230, 230, 0));
        setBackgroundColor(Map.bkgColor);
        setWalkthrough(false);
        
    }
      
}
