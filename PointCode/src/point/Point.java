/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package point;

/**
 *
 * @author AOUGASSA VIGNO
 */
public class Point {

   float x;
    float y;
    
    public Point(){
        x = 0;
        y = 0;
    }
    public float getX()
    {
        return x ;
         }
     public float getY()
     {
         return x;
    }
         public void setX(float a)
         { x=a;
         }
          public void setY(float b)
          {
              y=b;
          }
    public void afficherCoordonnée()
    {
        System.out.println("abscisse" +x);
        System.out.println("ordonnée" +y);
    }
    public static void main(String[]args)
    {
        point p =new point();
        p.x = 2;
        p.y =3;
        p.afficherCoordonnée();
    }
    
       
    }
    

