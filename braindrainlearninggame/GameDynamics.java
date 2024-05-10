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
public class GameDynamics {
    protected JLabel lblP1;
    protected JLabel lblP2;
    protected JLabel lblDiceResult;

    public GameDynamics(JLabel lblP1, JLabel lblP2) {
        this.lblP1 = lblP1;
        this.lblP2 = lblP2;
    }
    
    public class PlayerMovement {
        private JLabel[] tiles;

        public PlayerMovement(JLabel[] tiles) {
            this.tiles = tiles;
        }

        public void movePlayer(int playerPos, boolean isPlayer1) {
            JLabel playerLabel = isPlayer1 ? lblP1 : lblP2;
            playerLabel.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player " + (isPlayer1 ? "1" : "2") + ".png")));
            playerLabel.setBounds(tiles[playerPos].getX(), tiles[playerPos].getY(), 28, 28);
        }
    }

    public static class DiceManager {
        private JLabel lblDiceResult;
        public DiceManager(JLabel lblDiceResult) {
            this.lblDiceResult = lblDiceResult;
        }

        public void updateDiceImage(int rollResult) {
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
        }
    }
}
