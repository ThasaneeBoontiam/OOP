package Lab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab7_1 extends JFrame {
    JLabel numberLabel,number1Label,resultLabel;
    JTextField numberField,number1Field;
    JTextArea resultArea;
    JScrollPane scroll; 

    public Lab7_1(){
        // title bar in window
        super("Program display value n");
        // obtain content pane and set its layout to FlowLayout
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Enter integer and press Enter");
        container.add( numberLabel );
        // create numberField and attach it to content pane
        numberField = new JTextField( 10 );
        container.add( numberField );

        number1Label = new JLabel("Enter integer umber of blank");
        container.add(number1Label);
        number1Field = new JTextField(10);
        container.add(number1Field);

        // register this applet as numberField’s ActionListener
        numberField.addActionListener(
            // create inner class
            new ActionListener() {
                public void actionPerformed( ActionEvent event )
                {
                    int number, sumValue;
                    String blank5 = " ";
                    if(!number1Field.getText().isEmpty()){
                        sumValue =Integer.parseInt(number1Field.getText()); 
                        for(int i=0; i < sumValue; i++) blank5 +=" ";
                    }
                    number = Integer.parseInt( numberField.getText() );
                    // clear value in TextArea
                    resultArea.setText("");
                    // add data in textarea
                    for (int n = 1 ; n <= number ; n++) {
                        resultArea.append( blank5 + Integer.toString(n));
                        if (n % 5 == 0) resultArea.append("\n");
                    }
                    // clear value in numberField
                    numberField.setText("");
                } // end method actionPerformed
            }
        );
        // create display
        resultArea = new JTextArea( 10,20 );
        resultArea.setEditable( false );
        scroll = new JScrollPane(resultArea);
        container.add( scroll );

    }

    public static void main(String[] args) {
        Lab7_1 window = new Lab7_1();
        window.setSize( 360,240);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        }

    
}
