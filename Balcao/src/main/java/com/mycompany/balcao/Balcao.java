x`import javax.swing.*;
package com.mycompany.balcao;

/**
 *
 * @author lucca
 */
public class Balcao {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            // Crie uma instância do OutroJFrame
            OutroJFrame outroFrame = new OutroJFrame();
            outroFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            outroFrame.setSize(400, 300);
            outroFrame.setVisible(true);
    }
}
