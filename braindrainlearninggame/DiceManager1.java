/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

/**
 *
 * @author luisp
 */
public class DiceManager1 {

    private JLabel lblDiceResult;

    // Constructor to initialize with the dice button
    public DiceManager1(JLabel lblDiceResult) {
        this.lblDiceResult = lblDiceResult;
    }

    // Method to update the dice button image based on the roll result
    public void updateDiceImage(int rollResult) {
        //String imagePath = "/braindrainlearninggame/Images/"; // Set the path to your dice images

        // Based on the roll result, set the appropriate image
        switch (rollResult) {
            case 1:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice1.png")));
                break;
            case 2:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice2.png")));
                break;
            case 3:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice3.png")));
                break;
            case 4:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice4.png")));
                break;
            case 5:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice5.png")));
                break;
            case 6:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice6.png")));
                break;
            default:
                lblDiceResult.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/dice1.png"))); // Default image
                break;
        }

        // Set the new image to the dice button
    }
}
