/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

/**
 *
 * @author luisp
 */
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerMovement1 {
    private JLabel lblP1;
    private JLabel lblP2;
    private JLabel[] tiles;

    public PlayerMovement1(JLabel lblP1, JLabel lblP2, JLabel[] tiles) {
        this.lblP1 = lblP1;
        this.lblP2 = lblP2;
        this.tiles = tiles;
    }

    public void movePlayer(int playerPos, boolean isPlayer1) {
        if (isPlayer1) {
            lblP1.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player 1.png")));
        } else {
            lblP2.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player 2.png")));
        }

        JLabel playerLabel = isPlayer1 ? lblP1 : lblP2;
        playerLabel.setBounds(tiles[playerPos].getX(), tiles[playerPos].getY(), 28, 28);
        playerLabel.setIcon(new ImageIcon(getClass().getResource("/braindrainlearninggame/Images/Player " + (isPlayer1 ? "1" : "2") + ".png")));
    }
}
