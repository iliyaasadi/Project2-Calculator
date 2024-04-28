import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;
import java.nio.DoubleBuffer;

//Bro code YouTube chanel really helped me !

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator") ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension size = new Dimension(550 , 700) ;
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(size);
        frame.setLayout(null);
        frame.setVisible(true);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR) ;
        frame.setCursor(cursor);

        JTextField textField = new JTextField() ;
        JPanel textPanel = new JPanel() ;
        textPanel.setBounds(150 , 25 , 300 , 50) ;
        textField.setBounds(150 , 25 , 300 , 50);
        textPanel.setVisible(true);
        textField.setPreferredSize(new Dimension(300 , 50));
        textField.setEditable(false); //makes you unable to write in the field  .
        textField.setVisible(true);
        textPanel.add(textField) ;
        textPanel.setVisible(true);
        frame.add(textPanel) ;
        //textFieldPanel.setVisible(true);
        // frame.add(textFieldPanel) ;
        frame.setVisible(true);

        JPanel panel = new JPanel() ;
        panel.setLayout(new GridLayout(5 , 4 , 0 , 0));
        panel.setBounds(150 , 100 , 300 , 300);
        panel.setBackground(Color.cyan);
        panel.setVisible(true);
        frame.add(panel) ;
        frame.setVisible(true);

        JButton[] numbers = new JButton[10] ; //10 رقم داریم
        JButton add = new JButton("+") ;
        JButton minus = new JButton("-") ;
        JButton mul = new JButton("*") ;
        JButton div = new JButton("/") ;
        JButton dec = new JButton(".") ;
        JButton equal = new JButton("=") ;
        JButton negative = new JButton("-") ;
        JButton delete = new JButton("Del") ;
        JButton clear  = new JButton("Clr") ;
        JButton power  = new JButton("x^y") ;
        JButton sqrt = new JButton("Sqrt") ;
        JButton factorial = new JButton("!") ;
        JButton logarithm = new JButton("log") ;


        JPanel linePanel = new JPanel() ;
        linePanel.setBounds(90 , 500 , 340 , 100);
        linePanel.setLayout(new GridLayout(1 , 3 , 0 , 0));
        linePanel.setVisible(true);

        delete.setBounds(90 ,550 , 100 ,25);
        delete.setBackground(Color.YELLOW);
        delete.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
        delete.setFocusable(false);
        linePanel.add(delete) ;
        linePanel.setVisible(true);
        frame.add(linePanel) ;
        frame.setVisible(true);

        clear.setBounds(210 ,550 , 100 ,25);
        clear.setBackground(Color.YELLOW);
        clear.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
        clear.setFocusable(false);
        linePanel.add(clear) ;
        linePanel.setVisible(true);
        frame.add(linePanel) ;
        frame.setVisible(true);

        negative.setBounds(330 ,550 , 100 ,25);
        negative.setBackground(Color.YELLOW);
        negative.setFont(new Font(Font.SANS_SERIF , Font.BOLD , 25));
        negative.setFocusable(false);
        linePanel.add(negative) ;
        linePanel.setVisible(true);
        frame.add(linePanel) ;
        frame.setVisible(true);


        for(int i = 0 ; i<10 ; ++i){
            numbers[i] = new JButton(String.valueOf(i)) ;
            numbers[i].setBackground(Color.YELLOW);
            numbers[i].setFocusable(false);
        }

        //in next part I didn't use setBounds() method , why?
        //because previously I used GridLayout , and it will arrange my buttons .
        //So I just have to set my buttons Size !
        //I understood this by testing my program !

        //first row
        numbers[1].setSize(75 , 60 );
        panel.add(numbers[1]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[2].setSize(75 , 60 );
        panel.add(numbers[2]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[3].setSize(75 , 60 );
        panel.add(numbers[3]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        add.setSize(75 , 60 );
        add.setBackground(Color.YELLOW);
        add.setFocusable(false);
        frame.setVisible(true);
        panel.add(add) ;
        panel.setVisible(true);
        frame.setVisible(true);

        //second row
        numbers[4].setSize(75 , 60 );
        panel.add(numbers[4]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[5].setSize(75 , 60 );
        panel.add(numbers[5]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[6].setSize(75 , 60 );
        panel.add(numbers[6]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        minus.setSize(75 , 60 );
        minus.setBackground(Color.YELLOW);
        minus.setFocusable(false);
        frame.setVisible(true);
        panel.setVisible(true);
        panel.add(minus) ;

        //third row
        numbers[7].setSize(75 , 60 );
        panel.add(numbers[7]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[8].setSize(75 , 60 );
        panel.add(numbers[8]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        numbers[9].setSize(75 , 60 );
        panel.add(numbers[9]) ;
        panel.setVisible(true);
        frame.setVisible(true);

        mul.setSize(75 , 60 );
        mul.setBackground(Color.YELLOW);
        mul.setFocusable(false);
        frame.setVisible(true);
        panel.setVisible(true);
        panel.add(mul) ;

        //fourth row
        dec.setSize(75 , 60 );
        dec.setBackground(Color.YELLOW);
        dec.setFocusable(false);
        frame.setVisible(true);
        panel.add(dec) ;
        frame.add(panel) ;
        panel.setVisible(true);

        numbers[0].setSize(75 , 60 );
        panel.add(numbers[0]) ;
        panel.setVisible(true);
        frame.add(panel) ;
        frame.setVisible(true);

        equal.setSize(75 , 60 );
        equal.setBackground(Color.YELLOW);
        equal.setFocusable(false);
        panel.add(equal) ;
        panel.setVisible(true);
        frame.add(panel) ;
        frame.setVisible(true);

        div.setSize(75 , 60 );
        div.setBackground(Color.YELLOW);
        panel.add(div) ;
        div.setFocusable(false);
        panel.setVisible(true);
        frame.add(panel) ;
        frame.setVisible(true);

        //fifth row
        power.setSize(75 , 60 );
        power.setBackground(Color.YELLOW);
        power.setVisible(true);
        power.setFocusable(false);
        panel.add(power) ;
        panel.setVisible(true);
        frame.add(panel) ;
        frame.setVisible(true);

        sqrt.setSize(75 , 60 );
        sqrt.setBackground(Color.YELLOW);
        sqrt.setVisible(true);
        panel.add(sqrt) ;
        panel.setVisible(true);
        sqrt.setFocusable(false);
        frame.add(panel) ;
        frame.setVisible(true);

        factorial.setSize(75 , 60 );
        factorial.setBackground(Color.YELLOW);
        factorial.setVisible(true);
        panel.add(factorial) ;
        panel.setVisible(true);
        factorial.setFocusable(false);
        frame.add(panel) ;
        frame.setVisible(true);

        logarithm.setSize(75 , 60 );
        logarithm.setBackground(Color.YELLOW);
        logarithm.setVisible(true);
        panel.add(logarithm) ;
        panel.setVisible(true);
        logarithm.setFocusable(false);
        frame.add(panel) ;

        panel.setVisible(true);
        frame.setVisible(true);


        final double[] num1 = new double[1];
        final double[] num2 = new double[1];
        final double[] result = new double[1];

        for(int i = 0 ; i<10 ; ++i){
            int finalI = i;
            numbers[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText().concat(String.valueOf(finalI)));
                }
            });
        }

        final char[] readyOperator = new char[1];
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(textField.getText()) ;
                readyOperator[0] = '+' ;
                textField.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(textField.getText()) ;
                readyOperator[0] = '-' ;
                textField.setText("");
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(textField.getText()) ;
                readyOperator[0] = '*' ;
                textField.setText("");
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(textField.getText()) ;
                readyOperator[0] = '/' ;
                textField.setText("");
            }
        });

        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("."));
            }
        });

        negative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField.getText()) * -1;  //عدد را منفی میکند
                textField.setText("");  //عدد قبلی را پاک میکند
                textField.setText(textField.getText().concat(String.valueOf(x))) ; //عدد جدید را جایگزین میکند

            }
        });

        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] =Double.parseDouble(textField.getText()) ;
                readyOperator[0] = '^' ;
                textField.setText("");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2[0] = Double.parseDouble(textField.getText());
                switch (readyOperator[0]) {
                    case '+':
                        result[0] = num1[0] + num2[0];
                        textField.setText("");
                        break;
                    case '-':
                        result[0] = num1[0] - num2[0];
                        textField.setText("");
                        break;
                    case '*':
                        result[0] = num1[0] * num2[0];
                        textField.setText("");
                        break;
                    case '/':
                        result[0] = num1[0] / num2[0];
                        textField.setText("");
                        break;
                    case '^' :
                        result[0] = Math.pow(num1[0] , num2[0]) ;
                        textField.setText("");
                        break;
                }
                textField.setText(textField.getText().concat(String.valueOf(result[0])));
                num1[0] = result[0] ;
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = textField.getText() ;
                String string2= "" ;
                textField.setText("");
                for(int i = 0 ; i <  string.length() - 1  ; ++i) {//// تا قبل از length - 1  آمده چون باید به ازای هر بار زدن این دگمه یک عدد پاک شود
                    string2 += string.charAt(i);
                }
                textField.setText(textField.getText().concat(string2));
            }
        });

        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sqrtNum = Double.parseDouble(textField.getText()) ;
                textField.setText("");
                double sqrtResult = Math.sqrt(sqrtNum) ;
                textField.setText(textField.getText().concat(String.valueOf(sqrtResult)));
            }
        });

        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField.getText()) ;
                textField.setText("");

                if( (x - (int)x) != 0 || x<0 ){
                    textField.setText(textField.getText().concat("invalid number for factorial operation!"));
                }
                else{
                    double factorialResult = factorial(x) ;
                    textField.setText(textField.getText().concat(String.valueOf(factorialResult)));
                }
            }
        });

        logarithm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(textField.getText()) ;
                textField.setText("");
                double logResult = Math.log(x) ;
                textField.setText(textField.getText().concat(String.valueOf(logResult)));
            }
        });

    }
    public static double factorial(double x){
        if(x==1 || x==0){
            return 1 ;
        }
        else
            return x * factorial(x - 1) ;
    }
}
