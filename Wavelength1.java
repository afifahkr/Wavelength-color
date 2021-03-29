/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wavelengthcolor1;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Wavelength1{
  public static void main(String[]args){
    Scanner me = new Scanner(System.in);
    System.out.print(" Enter a color code: ");
    double code = me.nextDouble();

    if(code >=380 && code <=450){
      System.out.println(" The color is Violet ");
    }else if(code >=450 && code <= 495){
      System.out.println(" The color is Blue ");
    }else if(code >= 495 && code <= 570){
      System.out.println(" The color is Green");
    }else if(code >= 570 && code <= 590){
      System.out.println(" The color is Yellow");
    }else if(code >= 590 && code <= 620){
      System.out.println(" The color is Orange");
    }else if(code >= 620 && code <= 750){
      System.out.println(" The color is Red");
    }else{ System.out.println(" The entered wavelength is not a part of the visible spectrum ");
    }
  }
}