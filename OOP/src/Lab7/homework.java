package Lab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class homework implements ActionListener{
    JLabel numberLabel;
    JTextField numberField;
    JButton btnm1,btnm2,btnBack,btnAdd,btnSub,btnMultiply,btnDivide,btnPoint,btnAs,btn1, btn2, btn3,btn4, btn5, btn6,btn7, btn8, btn9,btn0, btnC;
    JFrame window;

    String str =" ", op = " ";
    double num1=0, num2=0, temp=0, result=0;
    public homework() {
        
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );


        numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );
        numberField = new JTextField( 15 );
        numberField.setHorizontalAlignment(SwingConstants.RIGHT);

        container.add( numberField );

        btnm1 = new JButton(" M+ ");
        btnm1.addActionListener(this);
        container.add( btnm1 );
        btnm2 = new JButton(" M- ");
        btnm2.addActionListener(this);
        container.add( btnm2 );
        btnC = new JButton(" C ");
        btnC.addActionListener( this);
        container.add( btnC );
        btnBack = new JButton(" Back ");
        btnBack.addActionListener( this);
        container.add( btnBack );

        btn7 = new JButton(" 7 ");
        btn7.addActionListener( this);
        container.add( btn7 );
        btn8 = new JButton(" 8 ");
        btn8.addActionListener( this);
        container.add( btn8 );
        btn9 = new JButton(" 9 ");
        btn9.addActionListener( this);
        container.add( btn9 );
        btnAdd = new JButton(" + ");
        btnAdd.addActionListener( this);
        container.add( btnAdd );

        btn4 = new JButton(" 4 ");
        btn4.addActionListener( this);
        container.add( btn4 );
        btn5 = new JButton(" 5 ");
        btn5.addActionListener( this);
        container.add( btn5 );
        btn6 = new JButton(" 6 ");
        btn6.addActionListener( this);
        container.add( btn6 );
        btnSub = new JButton(" - ");
        btnSub.addActionListener( this);
        container.add( btnSub );

        btn1 = new JButton(" 1 ");
        btn1.addActionListener( this);
        container.add( btn1 );
        btn2 = new JButton(" 2 ");
        btn2.addActionListener( this);
        container.add( btn2 );
        btn3 = new JButton(" 3 ");
        btn3.addActionListener( this);
        container.add( btn3 );
        btnMultiply = new JButton(" * ");
        btnMultiply.addActionListener( this);
        container.add( btnMultiply );

        btn0 = new JButton(" 0 ");
        btn0.addActionListener( this);
        container.add( btn0 );
        btnPoint = new JButton(" . ");
        btnPoint.addActionListener( this);
        container.add( btnPoint );
        btnAs = new JButton(" = ");
        btnAs.addActionListener( this);
        container.add( btnAs );
        btnDivide = new JButton(" / ");
        btnDivide.addActionListener( this);
        container.add( btnDivide );
        
        window.setSize(265,240);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed( ActionEvent event )
    {
        
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText( str );
        }
        else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText( str );
        }
        else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText( str );
        }
        else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText( str );
        }
        else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText( str );
        }
        else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText( str );
        }
        else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText( str );
        }
        else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText( str );
        }
        else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText( str );
        }
        else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText( str );
        }else if (event.getSource() == btnPoint){
            str += ".";
            numberField.setText( str );
        }else if (event.getSource() == btnAdd){
            num1 = Double.parseDouble(numberField.getText());
            str = "+";
            op = "+";
            numberField.setText(str);
            str = "";
        }else if (event.getSource() == btnSub){
            num1 = Double.parseDouble(numberField.getText());
            str = "-";
            op = "-";
            numberField.setText(str);
            str = "";
        }else if (event.getSource() == btnMultiply){
            num1 = Double.parseDouble(numberField.getText());
            str = "*";
            op = "*";
            numberField.setText(str);
            str = "";
        }else if (event.getSource() == btnDivide){
            num1 = Double.parseDouble(numberField.getText());
            str = "/";
            op = "/";
            numberField.setText(str);
            str = "";
        }else if (event.getSource() == btnC) {
            str = "";
            op = "";
            numberField.setText( str );
        }else if (event.getSource() == btnAs){
            num2 = Double.parseDouble(str);
            switch(op){
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            str = Double.toString(result);
            num1 = result;
            numberField.setText(str);
        }else if (event.getSource() == btnBack){
            str = str.substring(0,str.length()-1);
            numberField.setText(str);
        }

    }
    public static void main(String[] args) {
        homework gui = new homework();
    }
}
