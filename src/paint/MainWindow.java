package paint;

import java.awt.*;
import TFigures.*;
import TTools.*;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainWindow extends javax.swing.JFrame {
    public static Vector<TFigure> Figures = new Vector<TFigure>();
    static Vector<Class> Tools = new Vector<Class>();
    static TTool Tool;
    
    static public void SetTool(int ind) throws InstantiationException{
        try {
            Tool = (TTool)(Tools.get(ind).newInstance());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    public MainWindow() throws InstantiationException, IOException {
        initComponents();
        Tools.add(TLineTool.class);
        Tools.add(TBrokenLineTool.class);
        Tools.add(TRectTool.class);
        Tools.add(TEllipsTool.class);
        Tools.add(TKurvTool.class);
        SetTool(0);
        for (int i = 0; i < Tools.size(); i++){
            add(new TMyButton(i));
        }
    }
    
   void DrawFigures(Graphics g){
       Figures.forEach((f) -> {f.Draw(g);});
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        Canvas = Canvas = new javax.swing.JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.WHITE);
                Rectangle rect = this.getBounds();
                g.fillRect(0, 0, rect.width, rect.height);
                DrawFigures(g);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CanvasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CanvasMouseMoved(evt);
            }
        });
        Canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CanvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CanvasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseMoved
        Tool.MouseMove(evt);
        repaint();
    }//GEN-LAST:event_CanvasMouseMoved

    private void CanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMousePressed
        Tool.MouseDown(evt, Color.BLUE);
        repaint();
    }//GEN-LAST:event_CanvasMousePressed

    private void CanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseReleased
        Tool.MouseUp(evt);
        repaint();
    }//GEN-LAST:event_CanvasMouseReleased

    private void CanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseDragged
         Tool.MouseDragger(evt);
         repaint();
    }//GEN-LAST:event_CanvasMouseDragged

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Canvas;
    private javax.swing.JColorChooser jColorChooser1;
    // End of variables declaration//GEN-END:variables
}
