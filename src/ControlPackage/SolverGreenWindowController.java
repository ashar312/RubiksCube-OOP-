
package ControlPackage;

import ModelPackage.RubiksCubeModel.Colors;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;




public class SolverGreenWindowController  implements Initializable {

    ModelPackage.RubiksCubeModel RubiksCube = new ModelPackage.RubiksCubeModel();
    ModelPackage.FirstLayer FirstLayer = new ModelPackage.FirstLayer();
    ModelPackage.SecondLayer SecondLayer = new ModelPackage.SecondLayer();
    ModelPackage.ThirdLayer ThirdLayer = new ModelPackage.ThirdLayer();
  
    
    @FXML
    private TextArea OutputTextArea;
    
    public void appendText(String str) {
    
       Platform.runLater(() -> OutputTextArea.appendText(str));
    }
    
    @FXML
    private Label EnterColors_Label;
    
    @FXML
    private Label Instruction_Label;
    
    @FXML
    private Label FirstInstruction_Label;
    
    @FXML
    private Label SecondInstruction_Label;
    
    @FXML
    private Label ThirdInstruction_Label;
    
    @FXML
    private Label FourthInstruction_Label;
    
    @FXML
    private Label FifthInstruction_Label;
    
    
    @FXML
    private Button Btn0;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Button Btn3;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn6;
    
    @FXML
    private Button Btn7;

    @FXML
    private Button Btn8;

    @FXML
    private CheckBox Green_CheckBox;
    
    @FXML
    private CheckBox White_CheckBox;

    @FXML
    private CheckBox Blue_CheckBox;
    
    @FXML
    private CheckBox Yellow_CheckBox;
    
    @FXML
    private CheckBox Orange_CheckBox;
    
    @FXML
    private CheckBox Red_CheckBox;

    @FXML
    private Button NextBtn;

    @FXML
    private Button PreviousBtn;

    @FXML
    private Button CancelBtn;
    
    @FXML
    private Button DoneBtn;
    
    @FXML
    private Button NextInstructionBtn;
    
    @FXML
    private Button FinishBtn;
    
    @FXML
    private Button ResetBtn;
    
    
    
    // Function that unchecks other Check Boxes if one is checked
    @FXML
    void GreenCheckBoxAction(ActionEvent event) {
        
        if (Green_CheckBox.isSelected())
            {
                White_CheckBox.setSelected(false);
                Blue_CheckBox.setSelected(false);
                Yellow_CheckBox.setSelected(false);
                Orange_CheckBox.setSelected(false);
                Red_CheckBox.setSelected(false);
            }    
    }
    
    @FXML
    void WhiteCheckBoxAction(ActionEvent event) {
        
      if (White_CheckBox.isSelected())
            {
                Green_CheckBox.setSelected(false);
                Blue_CheckBox.setSelected(false);
                Yellow_CheckBox.setSelected(false);
                Orange_CheckBox.setSelected(false);
                Red_CheckBox.setSelected(false);
            }
        
    }
    
    @FXML
    void BlueCheckBoxAction(ActionEvent event) {
        
        if (Blue_CheckBox.isSelected())
            {
                Green_CheckBox.setSelected(false);
                White_CheckBox.setSelected(false);
                Yellow_CheckBox.setSelected(false);
                Orange_CheckBox.setSelected(false);
                Red_CheckBox.setSelected(false);
            }
        
    }

    @FXML
    void YellowCheckBoxAction(ActionEvent event) {
        
        if (Yellow_CheckBox.isSelected())
            {
                Green_CheckBox.setSelected(false);
                White_CheckBox.setSelected(false);
                Blue_CheckBox.setSelected(false);
                Orange_CheckBox.setSelected(false);
                Red_CheckBox.setSelected(false);
            }
        
    }
    
    @FXML
    void OrangeCheckBoxAction(ActionEvent event) {
        
        if (Orange_CheckBox.isSelected())
            {
                Green_CheckBox.setSelected(false);
                White_CheckBox.setSelected(false);
                Blue_CheckBox.setSelected(false);
                Yellow_CheckBox.setSelected(false);
                Red_CheckBox.setSelected(false);
            }
    }
    
    @FXML
    void RedCheckBoxAction(ActionEvent event) {
        
       if (Red_CheckBox.isSelected())
            {
                Green_CheckBox.setSelected(false);
                White_CheckBox.setSelected(false);
                Blue_CheckBox.setSelected(false);
                Yellow_CheckBox.setSelected(false);
                Orange_CheckBox.setSelected(false);
            }
        
    }
    
    
    // On click saves value in array
    // On click changes color of buttons
    // On click count number of input color
    @FXML
    void Btn0_Action(ActionEvent event) {
        
        
      
        RubiksCube.getArray()[RubiksCube.getGreenSide()][RubiksCube.getFifthBox()] = Colors.Green.getColorsValue();
        if (Green_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.Green.getColorsValue();
        }
        
        if (White_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn0.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFirstBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn1_Action(ActionEvent event) {
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn1.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSecondBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn2_Action(ActionEvent event) {
        
       
        
        if (Green_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn2.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getThirdBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn3_Action(ActionEvent event) {
        
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn3.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getFourthBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn4_Action(ActionEvent event) {

    }
    
    @FXML
    void Btn5_Action(ActionEvent event) {
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn5.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSixthBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn6_Action(ActionEvent event) {
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn6.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getSevethBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn7_Action(ActionEvent event) {
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.White.getColorsValue();
        }
        if (Blue_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn7.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getEightBox()] = Colors.Red.getColorsValue();
        }

    }
    
    @FXML
    void Btn8_Action(ActionEvent event) {
        
        
        
        if (Green_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getGreenColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.Green.getColorsValue();
        }
        if (White_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getWhiteColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.White.getColorsValue();

        }
        if (Blue_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getBlueColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.Blue.getColorsValue();
        }
        if (Yellow_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getYellowColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.Yellow.getColorsValue();
        }
        if (Orange_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getOrangeColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.Orange.getColorsValue();
        }
        if (Red_CheckBox.isSelected())
        {
            Btn8.setStyle(RubiksCube.getRedColor());
            RubiksCube.getArray()[RubiksCube.getSide()][RubiksCube.getNinthBox()] = Colors.Red.getColorsValue();
        }

    }
    
    

    int flag = 1;
    int flag1 = 0;
    @FXML
    void NextBtn_Action(ActionEvent event) {
           
           
        if(flag <= 6 && flag1 == 0 )
        {
            Btn0.setStyle(RubiksCube.getDefaultColor());
            Btn1.setStyle(RubiksCube.getDefaultColor());
            Btn2.setStyle(RubiksCube.getDefaultColor());
            Btn3.setStyle(RubiksCube.getDefaultColor());
            Btn5.setStyle(RubiksCube.getDefaultColor());
            Btn6.setStyle(RubiksCube.getDefaultColor());
            Btn7.setStyle(RubiksCube.getDefaultColor());
            Btn8.setStyle(RubiksCube.getDefaultColor());
            flag++;
            if(flag==6)
            {
                flag1 = 1;
            }
        }
        PreviousBtn.setDisable(false);
        
        if (RubiksCube.getSide() == 0)
        {
            EnterColors_Label.setText("Enter Colors for White Side");
            Instruction_Label.setText("Instructions for White Side:");
            FirstInstruction_Label.setText("1. White side should be on the front.");
            SecondInstruction_Label.setText("2. Blue side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the Blue side.");
            FifthInstruction_Label.setText("5. Press Next.");
        }
        
        if (RubiksCube.getSide() == 1)
        {
            EnterColors_Label.setText("Enter Colors for Blue Side");
            Instruction_Label.setText("Instructions for Blue Side:");
            FirstInstruction_Label.setText("1. Blue side should be on the front.");
            SecondInstruction_Label.setText("2. Yellow side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the Yellow side.");
            FifthInstruction_Label.setText("5. Press Next."); 
        }
        
        if (RubiksCube.getSide() == 2)
        {
            EnterColors_Label.setText("Enter Colors for Yellow Side");
            Instruction_Label.setText("Instructions for Yellow Side:");
            FirstInstruction_Label.setText("1. Yellow side should be on the front.");
            SecondInstruction_Label.setText("2. Green side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube downward and then upside down to get the Orange side.");
            FifthInstruction_Label.setText("5. Press Next.");   
        }
        
        if (RubiksCube.getSide() == 3)
        {
            EnterColors_Label.setText("Enter Colors for Orange Side");
            Instruction_Label.setText("Instructions for Orange Side:");
            FirstInstruction_Label.setText("1. Orange side should be on the front.");
            SecondInstruction_Label.setText("2. Blue side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Below the Orange side, should be your Red side.");
            FifthInstruction_Label.setText("5. Press Next.");
        }
        
        if (RubiksCube.getSide() == 4)
        {
            EnterColors_Label.setText("Enter Colors for Red Side");
            Instruction_Label.setText("Instructions for Red Side:");
            FirstInstruction_Label.setText("1. Red side should be on the front.");
            SecondInstruction_Label.setText("2. Blue side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Press Done.");
            FifthInstruction_Label.setText("");
            NextBtn.setDisable(true);
        }
        
        
        int var;
        var = RubiksCube.getSide();
        switch(var)
        {
            case 0:
                var++;
                break;
            case 1:
                var++;
                break;
                case 2:
                    var++;
                break;
                case 3:
                var++;
                break;
                case 4:
                   var++;
                break;
                case 5:
                   var++;
                break;
                case 6:
                   var++;
                break;
        }
        RubiksCube.setSide(var);
        RubiksCube.setTempSide(RubiksCube.getSide());
        if(flag1==1)
        {
            switch (RubiksCube.getTempSide()) {
                case 0:
                    BackToAllButton();
                    break;
                case 1:
                    BackToAllButton();
                    break;
                case 2:
                    BackToAllButton();
                    break;
                case 3:
                    BackToAllButton();
                    break;
                case 4:
                    BackToAllButton();
                    break;
                case 5:
                    BackToAllButton();
                    break;
                default:
                    break;
            }
        }
        
        
        
        switch(var)
        {
            case 1:
                RubiksCube.getArray()[RubiksCube.getWhiteSide()][RubiksCube.getFifthBox()] = Colors.White.getColorsValue();
                Btn4.setStyle(RubiksCube.getWhiteColor());
                break;
            case 2:
                RubiksCube.getArray()[RubiksCube.getBlueSide()][RubiksCube.getFifthBox()] = Colors.Blue.getColorsValue();
                Btn4.setStyle(RubiksCube.getBlueColor());
                break;
            case 3:
                RubiksCube.getArray()[RubiksCube.getYellowSide()][RubiksCube.getFifthBox()] = Colors.Yellow.getColorsValue();
                Btn4.setStyle(RubiksCube.getYellowColor());
                break;
            case 4:
                RubiksCube.getArray()[RubiksCube.getOrangeSide()][RubiksCube.getFifthBox()] = Colors.Orange.getColorsValue();
                Btn4.setStyle(RubiksCube.getOrangeColor());
                break;
            case 5:
                RubiksCube.getArray()[RubiksCube.getRedSide()][RubiksCube.getFifthBox()] = Colors.Red.getColorsValue();
                Btn4.setStyle(RubiksCube.getRedColor());
                break;
        }
    }
    
    void BackToAllButton()
    {
            BackToButton0();
            BackToButton1();
            BackToButton2();
            BackToButton3();
            BackToButton5();
            BackToButton6();
            BackToButton7();
            BackToButton8();
    }
    
    void BackToButton0()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.Green.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.White.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.Blue.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.Yellow.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.Orange.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFirstBox()] == Colors.Red.getColorsValue())
          {
              Btn0.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton1()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.Green.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.White.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.Blue.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.Yellow.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.Orange.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSecondBox()] == Colors.Red.getColorsValue())
          {
              Btn1.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton2()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.Green.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.White.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.Blue.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.Yellow.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.Orange.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getThirdBox()] == Colors.Red.getColorsValue())
          {
              Btn2.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton3()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.Green.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.White.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.Blue.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.Yellow.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.Orange.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getFourthBox()] == Colors.Red.getColorsValue())
          {
              Btn3.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton5()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.Green.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.White.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.Blue.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.Yellow.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.Orange.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSixthBox()] == Colors.Red.getColorsValue())
          {
              Btn5.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton6()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.Green.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.White.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.Blue.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.Yellow.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.Orange.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getSevethBox()] == Colors.Red.getColorsValue())
          {
              Btn6.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton7()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.Green.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.White.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.Blue.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.Yellow.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.Orange.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getEightBox()] == Colors.Red.getColorsValue())
          {
              Btn7.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    void BackToButton8()
    {
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.Green.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getGreenColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.White.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getWhiteColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.Blue.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getBlueColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.Yellow.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getYellowColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.Orange.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getOrangeColor());
          }
          else
          if(RubiksCube.getArray()[RubiksCube.getTempSide()][RubiksCube.getNinthBox()] == Colors.Red.getColorsValue())
          {
              Btn8.setStyle(RubiksCube.getRedColor());
          }
          
    }
    
    @FXML
    void PreviousBtn_Action(ActionEvent event) {
        
        if (RubiksCube.getSide() == 0)
        {
            
        }
        if (RubiksCube.getSide() == 5)
        {
            EnterColors_Label.setText("Enter Colors for Orange Side");
            Instruction_Label.setText("Instructions for Orange Side:");
            FirstInstruction_Label.setText("1. Orange side should be on the front.");
            SecondInstruction_Label.setText("2. Green side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Below the Orange side, should be your Red side.");
            FifthInstruction_Label.setText("5. Press Next.");
            NextBtn.setDisable(false);
        }
        
        if (RubiksCube.getSide() == 4)
        {
            EnterColors_Label.setText("Enter Colors for Yellow Side");
            Instruction_Label.setText("Instructions for Yellow Side:");
            FirstInstruction_Label.setText("1. Yellow side should be on the front.");
            SecondInstruction_Label.setText("2. Green side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube downward to get the Orange side.");
            FifthInstruction_Label.setText("5. Press Next.");
        }
        
        if (RubiksCube.getSide() == 3)
        {
            EnterColors_Label.setText("Enter Colors for Blue Side");
            Instruction_Label.setText("Instructions for Blue Side:");
            FirstInstruction_Label.setText("1. Blue side should be on the front.");
            SecondInstruction_Label.setText("2. Yellow side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the Yellow side.");
            FifthInstruction_Label.setText("5. Press Next.");
            
        }
        
        if (RubiksCube.getSide() == 2)
        {
            EnterColors_Label.setText("Enter Colors for White Side");
            Instruction_Label.setText("Instructions for White Side:");
            FirstInstruction_Label.setText("1. White side should be on the front.");
            SecondInstruction_Label.setText("2. Blue side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the Blue side.");
            FifthInstruction_Label.setText("5. Press Next.");
            
        }
        
        if (RubiksCube.getSide() == 1)
        {
            EnterColors_Label.setText("Enter Colors for Green Side");
            Instruction_Label.setText("Instructions for Green Side:");
            FirstInstruction_Label.setText("1. Green side should be on the front.");
            SecondInstruction_Label.setText("2. White side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the White side.");
            FifthInstruction_Label.setText("5. Press Next.");  
            PreviousBtn.setDisable(true);
            
            
            
        }
        
        int var;
        var = RubiksCube.getSide();
        switch(var)
        {
            case 0:
                var--;
                break;
            case 1:
                var--;
                break;
            case 2:
                    var--;
                break;
            case 3:
                var--;
                break;
            case 4:
                   var--;
                break;
            case 5:
                   var--;
                break;
            }
        
        RubiksCube.setSide(var);
        
        RubiksCube.setTempSide(RubiksCube.getSide());
        
        switch (RubiksCube.getTempSide()) {
            case 0:
                BackToAllButton();
                break;
            case 1:
                BackToAllButton();
                break;
            case 2:
                BackToAllButton();
                break;
            case 3:
                BackToAllButton();
                break;
            case 4:
                BackToAllButton();
                break;
            case 5:
                BackToAllButton();
                break;
            default:
                break;
        }
        
        switch(var)
        {
            case 5:
                RubiksCube.getArray()[RubiksCube.getRedSide()][RubiksCube.getFifthBox()] = Colors.Red.getColorsValue();
                Btn4.setStyle(RubiksCube.getRedColor());
                break;
            case 4:
                RubiksCube.getArray()[RubiksCube.getOrangeSide()][RubiksCube.getFifthBox()] = Colors.Orange.getColorsValue();
                Btn4.setStyle(RubiksCube.getOrangeColor());
                break;
            case 3:
                RubiksCube.getArray()[RubiksCube.getYellowSide()][RubiksCube.getFifthBox()] = Colors.Yellow.getColorsValue();
                Btn4.setStyle(RubiksCube.getYellowColor());
                break;
            case 2:
                RubiksCube.getArray()[RubiksCube.getBlueSide()][RubiksCube.getFifthBox()] = Colors.Blue.getColorsValue();
                Btn4.setStyle(RubiksCube.getBlueColor());
                break;
                
            case 1:
                RubiksCube.getArray()[RubiksCube.getWhiteSide()][RubiksCube.getFifthBox()] = Colors.White.getColorsValue();
                Btn4.setStyle(RubiksCube.getWhiteColor());
                break;
            case 0:
                RubiksCube.getArray()[RubiksCube.getGreenSide()][RubiksCube.getFifthBox()] = Colors.Green.getColorsValue();
                Btn4.setStyle(RubiksCube.getGreenColor());
                break;
            }
        }
    
    void CountColors()
    {
                RubiksCube.setGreenCount(RubiksCube.getReset());
                RubiksCube.setWhiteCount(RubiksCube.getReset());
                RubiksCube.setBlueCount(RubiksCube.getReset());
                RubiksCube.setYellowCount(RubiksCube.getReset());
                RubiksCube.setOrangeCount(RubiksCube.getReset());
                RubiksCube.setRedCount(RubiksCube.getReset());
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                int flag2 = 0;
                switch(RubiksCube.getArray()[i][j])
                {
                    case 1:
                        flag2 = RubiksCube.getGreenCount();
                        flag2++;
                        RubiksCube.setGreenCount(flag2);
                        break;
                    case 2:
                        flag2 = RubiksCube.getWhiteCount();
                        flag2++;
                        RubiksCube.setWhiteCount(flag2);
                        break;
                    case 3:
                        flag2 = RubiksCube.getBlueCount();
                        flag2++;
                        RubiksCube.setBlueCount(flag2);
                        break;
                    case 4:
                        flag2 = RubiksCube.getYellowCount();
                        flag2++;
                        RubiksCube.setYellowCount(flag2);
                        break;
                    case 5:
                        flag2 = RubiksCube.getOrangeCount();
                        flag2++;
                        RubiksCube.setOrangeCount(flag2);
                        break;
                    case 6:
                        flag2 = RubiksCube.getRedCount();
                        flag2++;
                        RubiksCube.setRedCount(flag2);
                        break;
                    default:
                        break;
                }
                        
            }
            
        }
    }
    
    
    @FXML
    void DoneBtn_Action(ActionEvent event) {
        
        CountColors();
        if(RubiksCube.getGreenCount() != 9)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of Greens is "+RubiksCube.getGreenCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    );
        }
        else
            if(RubiksCube.getWhiteCount() != 9)
            {
               Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of White is "+RubiksCube.getWhiteCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    ); 
            }
        else
        if(RubiksCube.getBlueCount() != 9)
            {
               Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of Blue is "+RubiksCube.getBlueCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    ); 
            }
        else
        if(RubiksCube.getYellowCount() != 9)
            {
               Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of Yellow is "+RubiksCube.getYellowCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    ); 
            }
        else
        if(RubiksCube.getOrangeCount() != 9)
            {
               Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of Orange is "+RubiksCube.getOrangeCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    ); 
            }
        else
        if(RubiksCube.getRedCount() != 9)
            {
               Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Rubik Cube Solver");
            alert.setHeaderText("Invalid Input!");
            alert.setContentText("The Number of Red is "+RubiksCube.getRedCount()+",it must be equal to 9");
            alert.showAndWait().ifPresent(ColorErrorBtn -> {
    
            if (ColorErrorBtn == ButtonType.OK) {
                
            }
            
        }
    ); 
            }
        else
        {
            System.out.println("                First Layer       ");
            System.out.println("******************************************");
            FirstLayer.whiteCross(RubiksCube.getArray());
            
            NextInstructionBtn.setDisable(false);
        }
        
    }
        int flag3=0;
     @FXML
    void NextInstructionBtn_Action(ActionEvent event) {
        
        switch (flag3) {
            case 0:
                FirstLayer.whiteCorner(RubiksCube.getArray());
                
                flag3++;
                break;
            case 1:
                OutputTextArea.setText("");
                System.out.println("             Second Layer           ");
                System.out.println("******************************************");
                System.out.println("First Step : ");
                SecondLayer.OrangeGreenEdge(RubiksCube.getArray());
                SecondLayer.GreenRedEdge(RubiksCube.getArray());
                
                flag3++;
                break;
            case 2:
                System.out.println("Second Step :");
                SecondLayer.RedBlueEdge(RubiksCube.getArray());
                SecondLayer.BlueOrangeEdge(RubiksCube.getArray());
                
                flag3++;
                break;
            case 3:
                OutputTextArea.setText("");
                System.out.println("              Third Layer              ");
                System.out.println("******************************************");
                System.out.println("First Step");
                ThirdLayer.checkYellow(RubiksCube.getArray());
                flag3=0;
                FinishBtn.setDisable(false);
                break;
            default:
                break;
        }
        
        
    }

    @FXML
    void FinishBtn_Action(ActionEvent event) {
        OutputTextArea.setText("");

    }
    
    @FXML
    void CancelBtn_Action(ActionEvent event) {
    
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Decipher the Cube");
    alert.setHeaderText("Exit Decipher the Cube?");
    alert.setContentText("Are you sure you want to exit?");
    alert.showAndWait().ifPresent(ExitBtn -> {
    
        if (ExitBtn == ButtonType.OK) {
            Platform.exit();
        }
    else
        if (ExitBtn == ButtonType.CANCEL) {   
        }
    }
    );

    }
   
    
    
    
    
    @FXML
    void ResetBtn_Action(ActionEvent event) {
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Decipher the Cube");
        alert.setHeaderText("Reset the Cube?");
        alert.setContentText("Are you sure you want to reset the cube solver?");
        alert.showAndWait().ifPresent(ResetBtnConfirm -> {

            
            if (ResetBtnConfirm == ButtonType.OK) {
   
             EnterColors_Label.setText("Enter Colors for Green Side");
            Instruction_Label.setText("Instructions for Green Side:");
            FirstInstruction_Label.setText("1. Green side should be on the front.");
            SecondInstruction_Label.setText("2. White side should be on your right.");  
            ThirdInstruction_Label.setText("3. Input the colors.");
            FourthInstruction_Label.setText("4. Rotate the cube to your left to get the White side.");
            FifthInstruction_Label.setText("5. Press Next.");  
            PreviousBtn.setDisable(true);
                
            Btn4.setStyle(RubiksCube.getGreenColor());
            RubiksCube.setSide(RubiksCube.getReset());
                
                
                
            OutputTextArea.setText("");
            flag = 1;
            flag1 = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 9; j++) {
                        RubiksCube.getArray()[i][j] = 0;
                    }
                    
                }
                RubiksCube.setGreenCount(RubiksCube.getReset());
                RubiksCube.setWhiteCount(RubiksCube.getReset());
                RubiksCube.setBlueCount(RubiksCube.getReset());
                RubiksCube.setYellowCount(RubiksCube.getReset());
                RubiksCube.setOrangeCount(RubiksCube.getReset());
                RubiksCube.setRedCount(RubiksCube.getReset());
                
                
            
            PreviousBtn.setDisable(true);
            
            Green_CheckBox.setSelected(false);
            White_CheckBox.setSelected(false);
            Blue_CheckBox.setSelected(false);
            Yellow_CheckBox.setSelected(false);
            Orange_CheckBox.setSelected(false);
            Red_CheckBox.setSelected(false);
        
            Btn0.setStyle(RubiksCube.getDefaultColor());
            Btn1.setStyle(RubiksCube.getDefaultColor());
            Btn2.setStyle(RubiksCube.getDefaultColor());
            Btn3.setStyle(RubiksCube.getDefaultColor());
            Btn5.setStyle(RubiksCube.getDefaultColor());
            Btn6.setStyle(RubiksCube.getDefaultColor());
            Btn7.setStyle(RubiksCube.getDefaultColor());
            Btn8.setStyle(RubiksCube.getDefaultColor());
            }
        else
            if (ResetBtnConfirm == ButtonType.CANCEL) {   
            }
    }
    );
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        OutputStream out = new OutputStream() {
        @Override
        public void write(int b) throws IOException {
            appendText(String.valueOf((char) b));
        }
    };
    System.setOut(new PrintStream(out, true));
    OutputTextArea.setEditable(false);
    NextInstructionBtn.setDisable(true);
    FinishBtn.setDisable(true);
    PreviousBtn.setDisable(true);   
    }
    
    @Override
    public String toString()
    {
        
        String info = "";
        info = info+"Move ";
        return info;
    }
    
    
}