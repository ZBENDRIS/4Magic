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
public class RandomEffect extends Effect {
               
   /*
    La classe RandomEffect ne fonctionne pas
    Elle est censée faire apparaitre un pion dans une case aléatoire
    */
    @Override
    public void playEffect(int line, int column, Game game) {
                java.util.Random rand = new java.util.Random();
                //Tire un nombre aléatoire entre min et max compris
                int random = rand.nextInt(7 - 1 + 1) + 1;

                 game.getBoard().getTileIJ(random, column).setStatus(-1);
    }
              
}
