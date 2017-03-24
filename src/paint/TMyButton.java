package paint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import paint.MainWindow;

public class TMyButton extends JButton {
    int ToolIndex;
   
    void BtnClick(java.awt.event.MouseEvent evt) throws InstantiationException{
        MainWindow.SetTool(ToolIndex);
    }
    
    public TMyButton(int ind){
        setBounds(10 + (ind%2)*35, 10 + (ind/2)*35, 25, 25);
        ToolIndex = ind;
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                try {
                    BtnClick(evt);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TMyButton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });     
    }
}
