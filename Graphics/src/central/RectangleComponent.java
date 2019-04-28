/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;
 
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author OWNER
 */
public class RectangleComponent extends  JComponent{
        public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.CYAN);
        Rectangle box3 = new Rectangle(0,0,1800,500);
        g2.fill(box3);
        g2.setColor(Color.ORANGE);
        Rectangle box4 = new Rectangle(0,500,1800,500);
        g2.fill(box4);
        g2.setColor(Color.BLUE);
        Rectangle box = new Rectangle(700,500,20,20);
        g2.fill(box);
        box.translate(20,-20);
        g2.fill(box);
        box.translate(20,-20);
        g2.fill(box);
        box.translate(20, -20);
        g2.fill(box);
        box.translate(20,-20);
        g2.fill(box);
        box.translate (20,20);
        g2.fill(box);
        box.translate(20,20);
        g2.fill(box);
        box.translate(20,20);
        g2.fill(box);
        box.translate(20, 20);
        g2.fill(box);
        box.translate(-20,0);
        g2.fill(box);
        box.translate(-20, 0);
        g2.fill(box);
        box.translate(-20,0);
        g2.fill(box);
        box.translate(-20, 0);
        g2.fill(box);
        box.translate(-20,0);
        g2.fill(box);
        box.translate(-20,0);
        g2.fill(box);
        box.translate(-20,0);
        g2.fill(box);
        g2.setColor(Color.RED);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(700,500,180,180);
        g2.fill(ellipse);
        g2.setColor(Color.GREEN);
        box.translate(30, 60);
        g2.fill(box);
        box.translate(60, 0);
        g2.fill(box);
        Line2D.Double segment = new Line2D.Double(760,620,840,620);
        g2.draw(segment);
        g2.setColor(Color.RED);
        Rectangle box2 = new Rectangle(790,680,20,20);
        g2.fill(box2);
        box2.translate(0,20);
        g2.fill(box2);
        box2.translate(0, 20);
        g2.fill(box2);
        box2.translate(0,20);
        g2.fill(box2);
        box2.translate(0,20);
        g2.fill(box2);
        box2.translate (0,20);
        g2.fill(box2);
        box2.translate(0,20);
        g2.fill(box2);
        box2.translate(20, 20);
        g2.fill(box2);
        box2.translate(20, 20);
        g2.fill(box2);
        box2.translate(20, 20);
        g2.fill(box2);
        box2.translate(20, 20);
        g2.fill(box2);
        box2.translate(20, 20);
        g2.fill(box2);
        box2.translate(-100,-100);
        g2.fill(box2);
        box2.translate(-20, 20);
        g2.fill(box2);
        box2.translate(-20, 20);
        g2.fill(box2);
        box2.translate(-20, 20);
        g2.fill(box2);
        box2.translate(-20, 20);
        g2.fill(box2);
        box2.translate(-20, 20);
        g2.fill(box2);
        box2.translate(100,-100);
        box2.translate(0, -60);
        box2.translate(20,0);
        g2.fill(box2);
        box2.translate(20,0);
        g2.fill(box2);
        box2.translate(20, 0);
        g2.fill(box2);
        box2.translate(-80,0);
        g2.fill(box2);
        box2.translate(-20,0);
        g2.fill(box2);
        box2.translate(-20,0);
        g2.fill(box2);
        g2.setColor(Color.MAGENTA);
        box2.translate(140,0);
        g2.fill(box2);
        box2.translate(20,-20);
        g2.fill(box2);
            box2.translate(20,-20);
        g2.fill(box2);
            box2.translate(20,-20);
        g2.fill(box2);
            box2.translate(20,-20);
        g2.fill(box2);

    
}
}
