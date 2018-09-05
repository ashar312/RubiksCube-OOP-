/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelPackage;

/**
 *
 * @author Lenovo
 */
public class Clocks extends ControlPackage.SolverGreenWindowController{
    
    
    private int j;
    private int y;
     
//ControlPackage.SolverGreenWindowController GreenWindow = new ControlPackage.SolverGreenWindowController();
    public Clocks()
    {
        this.j = 0;
        this.y = 0;
    }
    
    
    
    void swap(int a[][],int i,int j,int k, int l)
    {
        int temp = 0;
        temp = a[i][j];
        a[i][j] = a[k][l];
        a[k][l] = temp;
    }
    
    void primaryfaceforCCW(int colorcube[][])
    {
        int k = 2;
        int m = 6;
        for (int i = 0; i <= 8; i = i + 2) {
            if(i!=2 && i!=4 && i!=6)
            {
                swap(colorcube,this.y,k,this.y,i);
            }
            if(i==8)
            {
                swap(colorcube,this.y,m,this.y,i);
            }
        }
            
        k=5;
        for (int i = 1; i <= 7; i = i + 2) {
           if(i!=5)
           {
             swap(colorcube,this.y,k,this.y,i);   
           }
           
        }
    }
            
    
    void primaryface(int colorcube[][])
    {
        //PrimaryFace
        int k = 0;
        int m = 6;
        for (int i = 0; i <= 8; i = i + 2) {
            if(i!=4 && i!=0 && i!=8)
            {
                swap(colorcube,this.j,k,this.j,i);
            }
            if(i==8)
            {
                swap(colorcube,this.j,m,this.j,i);
            }
        }
            
        k=3;
        for (int i = 1; i <= 7; i = i + 2) {
           if(i!=3)
           {
             swap(colorcube,this.j,k,this.j,i);   
           }
           
        }
    }
    
    public int[][] greenCW(int colorcube[][])
    {
        this.j=0;
        primaryface(colorcube);
        
        //Outerface
        //accurate
        swap(colorcube,4,0,1,0);
        swap(colorcube,4,0,5,0);
        swap(colorcube,4,0,3,8);
        
        swap(colorcube,4,3,1,3);
        swap(colorcube,4,3,5,3);
        swap(colorcube,4,3,3,5);
        
        swap(colorcube,4,6,1,6);
        swap(colorcube,4,6,5,6);
        swap(colorcube,4,6,3,2);
        
        System.out.println("Green Clockwise");
        
        return colorcube;
    }
    public int[][] greenCCW(int colorcube[][])
    {
        this.y=0;
        primaryfaceforCCW(colorcube);
        
        swap(colorcube,4,0,3,8);
        swap(colorcube,4,0,5,0);
        swap(colorcube,4,0,1,0);
        
        swap(colorcube,4,3,3,5);
        swap(colorcube,4,3,5,3);
        swap(colorcube,4,3,1,3);
        
        swap(colorcube,4,6,3,2);
        swap(colorcube,4,6,5,6);
        swap(colorcube,4,6,1,6);
        
        System.out.println("Green CounterClockWise");
       
        return colorcube;
    }
    public int[][] whiteCW(int colorcube[][])
    {
        this.j=1;
        primaryface(colorcube);
        //OuterFace
        //accrate
        swap(colorcube,4,6,2,0);
        swap(colorcube,4,6,5,2);
        swap(colorcube,4,6,0,8);
        
        swap(colorcube,4,7,2,3);
        swap(colorcube,4,7,5,1);
        swap(colorcube,4,7,0,5);
        
        swap(colorcube,4,8,2,6);
        swap(colorcube,4,8,5,0);
        swap(colorcube,4,8,0,2);

        
        System.out.println("White Clockwise");
        
        return colorcube;
    }
    public int[][] whiteCCW(int colorcube[][])
    {
        this.y=1;
        primaryfaceforCCW(colorcube);
        
        swap(colorcube,4,6,0,8);
        swap(colorcube,4,6,5,2);
        swap(colorcube,4,6,2,0);
        
        swap(colorcube,4,7,0,5);
        swap(colorcube,4,7,5,1);
        swap(colorcube,4,7,2,3);
        
        swap(colorcube,4,8,0,2);
        swap(colorcube,4,8,5,0);
        swap(colorcube,4,8,2,6);
        
        System.out.println("White CounterClockwise");
        return colorcube;
    }
    
    public int[][] blueCW(int colorcube[][])
    {
        this.j=2;
        primaryface(colorcube);
        //OuterFace
        //accurate
        swap(colorcube,4,8,3,0);
        swap(colorcube,4,8,5,8);
        swap(colorcube,4,8,1,8);
        
        swap(colorcube,4,5,3,3);
        swap(colorcube,4,5,5,5);
        swap(colorcube,4,5,1,5);
        
        swap(colorcube,4,2,3,6);
        swap(colorcube,4,2,5,2);
        swap(colorcube,4,2,1,2);
       
        System.out.println("Blue Clockwise");
        
        return colorcube;
    }
    public int[][] blueCCW(int colorcube[][])
    {
        this.y=2;
        primaryfaceforCCW(colorcube);
        
        swap(colorcube,4,8,1,8);
        swap(colorcube,4,8,5,8);
        swap(colorcube,4,8,3,0);
        
        swap(colorcube,4,5,1,5);
        swap(colorcube,4,5,5,5);
        swap(colorcube,4,5,3,3);
        
        swap(colorcube,4,2,1,2);
        swap(colorcube,4,2,5,2);
        swap(colorcube,4,2,3,6);
        
        System.out.println("Blue CounterClockwise");
        return colorcube;
    }
    
    public int[][] YellowCW(int colorcube[][])
    {
        
        this.j=3;
        primaryface(colorcube);
        //OuterFace
        //accurate
        swap(colorcube,4,2,0,0);
        swap(colorcube,4,2,5,6);
        swap(colorcube,4,2,2,8);
        
        swap(colorcube,4,1,0,3);
        swap(colorcube,4,1,5,7);
        swap(colorcube,4,1,2,5);
        
        swap(colorcube,4,0,0,6);
        swap(colorcube,4,0,5,8);
        swap(colorcube,4,0,2,2);
        
        System.out.println("Yellow Clockwise");
        
        return colorcube;
    }
    
    public int[][] YellowCCW(int colorcube[][])
    {
        this.y=3;
        primaryfaceforCCW(colorcube);
        
        swap(colorcube,4,2,2,8);
        swap(colorcube,4,2,5,6);
        swap(colorcube,4,2,0,0);
        
        swap(colorcube,4,1,2,5);
        swap(colorcube,4,1,5,7);
        swap(colorcube,4,1,0,3);
        
        swap(colorcube,4,0,2,2);
        swap(colorcube,4,0,5,8);
        swap(colorcube,4,0,0,6);
        
        System.out.println("Yellow CounterClockwise");
        return colorcube;
    }
    public int[][] OrangeCW(int colorcube[][])
    {
        this.j=4;
        primaryface(colorcube);
        //OuterFace
        //accurate
        int x = 2;
        for (int i = 0; i <= 2; i++) 
        {
        swap(colorcube,3,x,2,x);
        swap(colorcube,3,x,1,x);
        swap(colorcube,3,x,0,x);
        x--;
        }   
        
        
        System.out.println("Orange Clockwise");
        
        return colorcube;
    }
    public int[][] OrangeCCW(int colorcube[][])
    {
        this.y=4;
        primaryfaceforCCW(colorcube);
        
        int x = 2;
        for (int i = 0; i <=2; i++) {
           swap(colorcube,3,x,0,x);
           swap(colorcube,3,x,1,x);
           swap(colorcube,3,x,2,x);
           x--;
            
        }
        System.out.println("Orange CounterClockwise");
        return colorcube;
    }
    public int[][] redCW(int colorcube[][])
    {
        this.j=5;
        primaryface(colorcube);
        //OuterFace
        int x = 6;
        for (int i = 0; i <= 2; i++) {
            
        swap(colorcube,1,x,2,x);
        swap(colorcube,1,x,3,x);
        swap(colorcube,1,x,0,x);
        x++;
        }
        System.out.println("Red Clockwise");
        
        return colorcube;
    }
    public int[][] redCCW(int colorcube[][])
    {
        this.y=5;
        primaryfaceforCCW(colorcube);
        
        int x = 6;
        for (int i = 0; i <=2; i++) {
            swap(colorcube,1,x,0,x);
            swap(colorcube,1,x,3,x);
           swap(colorcube,1,x,2,x);
           x++;
            
        }
        System.out.println("Red CounterClockwise");
        return colorcube;
    }   
    
    
}
