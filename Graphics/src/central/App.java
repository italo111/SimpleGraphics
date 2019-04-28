/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;
import javax.swing.JFrame;
/**
 *
 * @author OWNER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setTitle("Graphic Objects");
       
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        
        frame.setVisible(true);
        

    }
    
}
