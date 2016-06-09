/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author p1501016
 */
public class DisappearEffect extends Effect {

   /**
    * 
    * @param line correspond a la ligne joué
    * @param column correspond a la colonne joué
    * @param game correspond au modèle du jeu
    */
    
    @Override
    public void playEffect(int line, int column, Game game) {
        
        game.getBoard().getTileIJ(line, column).setStatus(-1);
        
    }
    
}
