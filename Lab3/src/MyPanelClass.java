import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width, height);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                      //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1 +1, y1 +1 , width-1, height);
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1 +6, y1 +6, width-10, height -10);
                        
                        //Draw lines
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.RED);
//                        g.drawLine(x1, y2, x2, y1);
                        
                        //Draw oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((getWidth()-55)/2, (getHeight()-55)/2 , 55, 55);
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1 , height -35);
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1,height -70);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height - 105);
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height -140);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint(x1, y1 +height);
                        p.addPoint(x1 + width/2, y1 + height/2);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                       
            }
}