
package ModelPackage;


public class RubiksCubeModel {
    
   private int CountGreen;
   private int CountWhite;
   private int CountBlue;
   private int CountYellow;
   private int CountOrange;
   private int CountRed;
   
   private int Reset;
    
   private String GreenColor;
   private String WhiteColor;
   private String BlueColor;
   private String YellowColor;
   private String OrangeColor;
   private String RedColor;
   private String DefaultColor;
   
   
    private int FirstBox;
    private int SecondBox;
    private int ThirdBox;
    private int FourthBox;
    private int FifthBox;
    private int SixthBox;
    private int SeventhBox;
    private int EightBox;
    private int NinthBox;
    
    private int GreenSide;
    private int WhiteSide;
    private int BlueSide;
    private int YellowSide;
    private int OrangeSide;
    private int RedSide;
    
    private int TempSide;
    
    private int Side;
    
   public enum Colors{ Green(1), White(2), Blue(3), Yellow(4), Orange(5), Red(6);
   
  private final int ColorsValue;
  
   Colors (int ColorsValue){
      this.ColorsValue = ColorsValue;
    }
    public int getColorsValue(){
        return ColorsValue;
        }
    
}
  private final int[][] colorcube = new int[6][9];
   
 public RubiksCubeModel()
   {
       this.CountGreen = 0;
       this.CountWhite = 0;
       this.CountBlue = 0;
       this.CountYellow = 0;
       this.CountOrange = 0;
       this.CountRed = 0;
       
       this.TempSide = 0;
       
       this.DefaultColor = "-fx-background-color: ";
       this.GreenColor = "-fx-background-color: #008000";
       this.WhiteColor = "-fx-background-color: #ffffff";
       this.BlueColor = "-fx-background-color: #0000FF";
       this.YellowColor = "-fx-background-color: #ffff00";
       this.OrangeColor = "-fx-background-color: #FFA500";
       this.RedColor = "-fx-background-color: #ff0000";   
       
       this.GreenSide = 0;
       this.WhiteSide = 1;
       this.BlueSide = 2;
       this.YellowSide = 3;
       this.OrangeSide = 4;
       this.RedSide = 5;
       
       this.FirstBox = 0;
       this.SecondBox = 1;
       this.ThirdBox = 2;
       this.FourthBox = 3;
       this.FifthBox = 4;
       this.SixthBox = 5;
       this.SeventhBox = 6;
       this.EightBox = 7;
       this.NinthBox = 8;
       
       this.Reset = 0;
       
       this.Side = 0;
       
       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 9; j++) {
                this.colorcube[i][j] = 0;         
           }
       }    
   }
    public void setReset(int reset)
    {
     this.Reset = reset;
    }
    public int getReset()
    {
       return this.Reset;
    }
    public void setGreenCount(int CountGreen)
    {
        this.CountGreen = CountGreen;
    }
    public void setWhiteCount(int CountWhite)
    {
        this.CountWhite = CountWhite;
    }
    public void setBlueCount(int CountBlue)
    {
        this.CountBlue = CountBlue;
    }
    public void setYellowCount(int CountYellow)
    {
        this.CountYellow = CountYellow;
    }
    public void setOrangeCount(int CountOrange)
    {
        this.CountOrange = CountOrange;
    }
    public void setRedCount(int CountRed)
    {
        this.CountRed = CountRed;
    }
    
    public int getGreenCount()
    {
        return this.CountGreen;
    }
    public int getWhiteCount()
    {
        return this.CountWhite;
    }
    public int getBlueCount()
    {
        return this.CountBlue;
    }
    public int getYellowCount()
    {
        return this.CountYellow;
    }
    public int getOrangeCount()
    {
        return this.CountOrange;
    }
    public int getRedCount()
    {
        return this.CountRed;
    }
    public void setTempSide(int tempside)
    {
        this.TempSide = tempside;
    }
    public int getTempSide()
    {
        return this.TempSide;
    }
    public void setDefaultColor(String DefaultColor)
    {
        this.DefaultColor = DefaultColor;
    }
    public String getDefaultColor()
    {
        return this.DefaultColor;
    }
 
 
 public void SetAllColors(String GreenColor,String WhiteColor,String BlueColor,String YellowColor,String OrangeColor, String RedColor)
 {
     this.GreenColor = GreenColor;
     this.WhiteColor = WhiteColor;
     this.BlueColor = BlueColor;
     this.YellowColor = YellowColor;
     this.OrangeColor = OrangeColor;
     this.RedColor = RedColor;
 }
 public String getGreenColor()
 {
     return this.GreenColor;
 }
 public String getWhiteColor()
 {
     return this.WhiteColor;
 }
 public String getBlueColor()
 {
     return this.BlueColor;
 }
 public String getYellowColor()
 {
     return this.YellowColor;
 }
 public String getOrangeColor()
 {
     return this.OrangeColor;
 }
 public String getRedColor()
 {
     return this.RedColor;
 }
 
   public void SetAllSides(int GreenSide,int WhiteSide,int BlueSide,int YellowSide,int OrangeSide,int RedSide)
   {
       this.GreenSide = GreenSide;
       this.WhiteSide = WhiteSide;
       this.BlueSide = BlueSide;
       this.YellowSide = YellowSide;
       this.OrangeSide = OrangeSide;
       this.RedSide = RedSide;
   }
   public int getGreenSide()
   {
       return this.GreenSide;
   }
   public int getWhiteSide()
   {
       return this.WhiteSide;
   }
   public int getBlueSide()
   {
       return this.BlueSide;
   }
   public int getYellowSide()
   {
       return this.YellowSide;
   }
   public int getOrangeSide()
   {
       return this.OrangeSide;
   }
   public int getRedSide()
   {
       return this.RedSide;
   }
   public void SetAllBox(int FirstBox,int SecondBox,int ThirdBox,int FourthBox,int FifthBox,int SixthBox,int SeventhBox,int EightBox,int NinthBox)
   {
       this.FirstBox = FirstBox;
       this.SecondBox = SecondBox;
       this.ThirdBox = ThirdBox;
       this.FourthBox = FourthBox;
       this.FifthBox = FifthBox;
       this.SixthBox = SixthBox;
       this.SeventhBox = SeventhBox;
       this.EightBox = EightBox;
       this.NinthBox = NinthBox;
       
   }
   public int getFirstBox()
   {
       return this.FirstBox;
   }
   public int getSecondBox()
   {
       return this.SecondBox;
   }
   public int getThirdBox()
   {
       return this.ThirdBox;
   }
   public int getFourthBox()
   {
       return this.FourthBox;
   }
   public int getFifthBox()
   {
       return this.FifthBox;
   }
   public int getSixthBox()
   {
       return this.SixthBox;
   }
   public int getSevethBox()
   {
       return this.SeventhBox;
   }
   public int getEightBox()
   {
       return this.EightBox;
   }
   public int getNinthBox()
   {
       return this.NinthBox;
   }
   
   public void setSide(int Side)
   {
       this.Side = Side;
   }
   public int getSide()
   {
      return this.Side; 
   }
   public void setArray(int[][] colorcube)
   {
       for (int i = 0; i < 6; i++) {
           System.arraycopy(colorcube[i], 0, this.colorcube[i], 0, 9);
       }
   }
   public int[][] getArray()
   {
        return this.colorcube;
    }
}