/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


import java.applet.Applet;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jeny
 */
public class JavaApplication1 extends JFrame{

    /**
     * @param args the command line arguments
     */
   
  /* Image miImagen;
   @Override
    public  void init(){
    
    miImagen = getImage(getDocumentBase(), "JenyRuiz.jpeg");
            }
 
   @Override
    public void paint(Graphics g){
        g.drawImage(miImagen, 0, 0, 100 , 100 , this);
            }
    */
    
    JLabel label;
    ImageIcon imageIcono;
    
    public  JavaApplication1() {
    imageIcono = new ImageIcon("JenyRuiz.png");
     System.out.println(imageIcono);
    label = new JLabel(imageIcono);
    this.add(label);
    setVisible(true);
    setSize(500,500);
     
    }
    public static void  main(String args[]){
        
    new JavaApplication1();
    }
    
}
