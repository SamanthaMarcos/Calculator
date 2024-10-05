import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Position, Velocity, and Acceleration of a particle");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.WHITE);

        JButton enter = new JButton("Enter");
        JButton clear = new JButton("Clear");
        JTextField f = new JTextField(1);
        JLabel printPos = new JLabel("Position equation: ");
        JLabel printVel = new JLabel("Velocity equation: ");
        JLabel printAcc = new JLabel("Acceleration equation: ");
        JLabel inst = new JLabel("Type position polynomial equation here:");
        JLabel inst2 = new JLabel("Example polynomial: 3x^2 - 8x^4 + 1x - 5 || Example linear: 5x^1 + 4 || Add a space after the last character ||");
        JLabel inst22 = new JLabel("Add a space between the numbers and operators || First value must be positive || Stick to single digits for the position equation ");

        JButton reset = new JButton("Reset");
        JTextField x = new JTextField(1);
        JLabel inst3 = new JLabel("Type the x-value you want to calculate for: ");
        JButton enter2 = new JButton("Enter");
        JButton clear2 = new JButton("Clear");

        JLabel valPos = new JLabel("Position at x-value: ");
        JLabel valVel = new JLabel("Velocity at x-value: ");
        JLabel valAcc = new JLabel("Acceleration at x-value: ");

        JLabel inst4 = new JLabel("Enter the upper bound of the integrals to find the LRAM and RRAM approximations. ");
        JLabel inst5 = new JLabel("Fill both upper bounds before entering the amount of subintervals you want here.");
        JLabel intVt = new JLabel("∫");
        JLabel intAt = new JLabel("∫");
        JLabel intVt2 = new JLabel("p(t) =        v(t) dt");
        JLabel intAt2 = new JLabel("v(t) =        a(t) dt");
        JLabel lbVt = new JLabel("0");
        JLabel lbAt = new JLabel("0");
        JLabel LRAMV = new JLabel("LRAM: ");
        JLabel RRAMV = new JLabel("RRAM: ");
        JLabel LRAMA = new JLabel("LRAM: ");
        JLabel RRAMA = new JLabel("RRAM: ");
        JTextField ubVt = new JTextField(1);
        JTextField ubAt = new JTextField(1);
        JTextField si = new JTextField(1);
        JButton enter3 = new JButton ("Enter");
        JButton clear3 = new JButton ("Clear");

        JButton lightMode = new JButton("Light");
        JButton darkMode = new JButton("Dark");

        darkMode.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e){
                                           frame.getContentPane().setBackground(Color.DARK_GRAY);
                                           printPos.setForeground(Color.WHITE);
                                           printVel.setForeground(Color.WHITE);
                                           printAcc.setForeground(Color.WHITE);
                                           inst.setForeground(Color.WHITE);
                                           inst2.setForeground(Color.WHITE);
                                           inst22.setForeground(Color.WHITE);
                                           inst3.setForeground(Color.WHITE);
                                           valPos.setForeground(Color.WHITE);
                                           valVel.setForeground(Color.WHITE);
                                           valAcc.setForeground(Color.WHITE);
                                           inst4.setForeground(Color.WHITE);
                                           inst5.setForeground(Color.WHITE);
                                           intVt.setForeground(Color.WHITE);
                                           intAt.setForeground(Color.WHITE);
                                           intVt2.setForeground(Color.WHITE);
                                           intAt2.setForeground(Color.WHITE);
                                           lbVt.setForeground(Color.WHITE);
                                           lbAt.setForeground(Color.WHITE);
                                           LRAMV.setForeground(Color.WHITE);
                                           RRAMV.setForeground(Color.WHITE);
                                           LRAMA.setForeground(Color.WHITE);
                                           RRAMA.setForeground(Color.WHITE);
                                       }
                                   }
        );

        lightMode.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e){
                                            frame.getContentPane().setBackground(Color.WHITE);
                                            printPos.setForeground(Color.DARK_GRAY);
                                            printVel.setForeground(Color.DARK_GRAY);
                                            printAcc.setForeground(Color.DARK_GRAY);
                                            inst.setForeground(Color.DARK_GRAY);
                                            inst2.setForeground(Color.DARK_GRAY);
                                            inst22.setForeground(Color.DARK_GRAY);
                                            inst3.setForeground(Color.DARK_GRAY);
                                            valPos.setForeground(Color.DARK_GRAY);
                                            valVel.setForeground(Color.DARK_GRAY);
                                            valAcc.setForeground(Color.DARK_GRAY);
                                            inst4.setForeground(Color.DARK_GRAY);
                                            inst5.setForeground(Color.DARK_GRAY);
                                            intVt.setForeground(Color.DARK_GRAY);
                                            intAt.setForeground(Color.DARK_GRAY);
                                            intVt2.setForeground(Color.DARK_GRAY);
                                            intAt2.setForeground(Color.DARK_GRAY);
                                            lbVt.setForeground(Color.DARK_GRAY);
                                            lbAt.setForeground(Color.DARK_GRAY);
                                            LRAMV.setForeground(Color.DARK_GRAY);
                                            RRAMV.setForeground(Color.DARK_GRAY);
                                            LRAMA.setForeground(Color.DARK_GRAY);
                                            RRAMA.setForeground(Color.DARK_GRAY);
                                        }
                                    }
        );






        enter.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e){
                                        s1 = f.getText();
                                        printPos.setText("Position equation: " + s1);
                                        s2 = deriv(s1);
                                        printVel.setText("Velocity equation: " + s2);
                                        s3 = deriv(s2);
                                        printAcc.setText("Acceleration equation: " + s3);

                                        enter2.setVisible(true);
                                        enter2.setEnabled(true);
                                        clear2.setVisible(true);
                                        clear2.setEnabled(true);
                                        x.setVisible(true);
                                        x.setEnabled(true);

                                        valPos.setVisible(true);
                                        valPos.setEnabled(true);
                                        valVel.setVisible(true);
                                        valVel.setEnabled(true);
                                        valAcc.setVisible(true);
                                        valAcc.setEnabled(true);
                                        inst3.setVisible(true);
                                        inst3.setEnabled(true);

                                        inst4.setVisible(true);
                                        inst4.setEnabled(true);
                                        inst5.setVisible(true);
                                        inst5.setEnabled(true);
                                        enter3.setVisible(true);
                                        enter3.setEnabled(true);
                                        clear3.setVisible(true);
                                        clear3.setEnabled(true);
                                        intVt.setVisible(true);
                                        intVt.setEnabled(true);
                                        intAt.setVisible(true);
                                        intAt.setEnabled(true);
                                        intVt2.setVisible(true);
                                        intVt2.setEnabled(true);
                                        intAt2.setVisible(true);
                                        intAt2.setEnabled(true);
                                        lbVt.setVisible(true);
                                        lbVt.setEnabled(true);
                                        lbAt.setVisible(true);
                                        lbAt.setEnabled(true);
                                        LRAMV.setEnabled(true);
                                        LRAMV.setVisible(true);
                                        RRAMV.setEnabled(true);
                                        RRAMV.setVisible(true);
                                        LRAMA.setEnabled(true);
                                        LRAMA.setVisible(true);
                                        RRAMA.setVisible(true);
                                        RRAMA.setEnabled(true);
                                        ubVt.setVisible(true);
                                        ubVt.setEnabled(true);
                                        ubAt.setVisible(true);
                                        ubAt.setEnabled(true);
                                        si.setVisible(true);
                                        si.setEnabled(true);

                                    }
                                }
        );

        enter2.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e){
                                         input = x.getText();
                                         w1 = solve(s1, Double.valueOf(input));
                                         valPos.setText("Position at x-value: " + w1);
                                         w2 = solve(s2, Double.valueOf(input));
                                         valVel.setText("Velocity at x-value: " + w2);
                                         w3 = solve(s3, Double.valueOf(input));
                                         valAcc.setText("Acceleration at x-value: " + w3);

                                     }
                                 }
        );

        enter3.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e){
                                         uV = ubVt.getText();
                                         uA = ubAt.getText();
                                         siAmt = si.getText();
                                         String a = solveLRAM(siAmt, uV, s2);
                                         String b = solveRRAM(siAmt, uV, s2);
                                         String c = solveLRAM(siAmt, uA, s3);
                                         String d = solveRRAM(siAmt, uA, s3);

                                         LRAMV.setText("LRAM: " + a);
                                         RRAMV.setText("RRAM: " + b);
                                         LRAMA.setText("LRAM: " + c);
                                         RRAMA.setText("RRAM: " + d);



                                     }
                                 }
        );



        clear.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e){
                                        s1 = "";
                                        s2 = "";
                                        s3 = "";
                                        printPos.setText("Position equation: ");
                                        printVel.setText("Velocity equation: ");
                                        printAcc.setText("Acceleration equation: ");
                                        f.setText("");
                                        x.setText("");
                                        uV = "";
                                        uA = "";
                                        siAmt = "";
                                        ubVt.setText("");
                                        ubAt.setText("");
                                        si.setText("");
                                        LRAMV.setText("LRAM: ");
                                        RRAMV.setText("RRAM: ");
                                        LRAMA.setText("LRAM: ");
                                        RRAMA.setText("RRAM: ");

                                        enter2.setVisible(false);
                                        enter2.setEnabled(false);
                                        clear2.setVisible(false);
                                        clear2.setEnabled(false);
                                        x.setVisible(false);
                                        x.setEnabled(false);
                                        valPos.setVisible(false);
                                        valPos.setEnabled(false);
                                        valVel.setVisible(false);
                                        valVel.setEnabled(false);
                                        valAcc.setVisible(false);
                                        valAcc.setEnabled(false);
                                        inst3.setVisible(false);
                                        inst3.setEnabled(false);

                                        inst4.setVisible(false);
                                        inst4.setEnabled(false);
                                        inst5.setVisible(false);
                                        inst5.setVisible(false);
                                        enter3.setVisible(false);
                                        enter3.setEnabled(false);
                                        clear3.setVisible(false);
                                        clear3.setEnabled(false);
                                        intVt.setVisible(false);
                                        intVt.setEnabled(false);
                                        intAt.setVisible(false);
                                        intAt.setEnabled(false);
                                        intVt2.setVisible(false);
                                        intVt2.setEnabled(false);
                                        intAt2.setVisible(false);
                                        intAt2.setEnabled(false);
                                        lbVt.setVisible(false);
                                        lbVt.setEnabled(false);
                                        lbAt.setVisible(false);
                                        lbAt.setEnabled(false);
                                        LRAMV.setEnabled(false);
                                        LRAMV.setVisible(false);
                                        RRAMV.setEnabled(false);
                                        RRAMV.setVisible(false);
                                        LRAMA.setEnabled(false);
                                        LRAMA.setVisible(false);
                                        RRAMA.setVisible(false);
                                        RRAMA.setEnabled(false);
                                        ubVt.setVisible(false);
                                        ubVt.setEnabled(false);
                                        ubAt.setVisible(false);
                                        ubAt.setEnabled(false);
                                        si.setVisible(false);
                                        si.setEnabled(false);
                                    }
                                }
        );

        clear2.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e){
                                         w1 = "";
                                         w2 = "";
                                         w3 = "";
                                         valPos.setText("Position at x-value: ");
                                         valVel.setText("Velocity at x-value: ");
                                         valAcc.setText("Acceleration at x-value: ");
                                         x.setText("");
                                     }
                                 }
        );

        clear3.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e){
                                         uV = "";
                                         uA = "";
                                         siAmt = "";
                                         ubVt.setText("");
                                         ubAt.setText("");
                                         si.setText("");
                                         LRAMV.setText("LRAM: ");
                                         RRAMV.setText("RRAM: ");
                                         LRAMA.setText("LRAM: ");
                                         RRAMA.setText("RRAM: ");
                                     }
                                 }
        );





        inst.setBounds(50,-10, 400, 50);
        inst.setVisible(true);
        inst2.setBounds(50,10, 800, 50);
        inst2.setVisible(true);
        inst22.setBounds(50, 30, 1000, 50);
        inst3.setBounds(50, 220, 600, 50);
        inst3.setVisible(false);
        inst3.setEnabled(false);
        inst4.setBounds(50, 420, 700, 50);
        inst4.setVisible(false);
        inst4.setEnabled(false);
        inst5.setBounds(50, 580, 700, 50);
        inst5.setVisible(false);
        inst5.setEnabled(false);

        intVt.setBounds(80, 460, 600, 70);
        intVt.setFont(new Font("Serif", Font.PLAIN, 40));
        intVt.setVisible(false);
        intVt.setEnabled(false);
        intAt.setBounds(80, 520, 600, 70);
        intAt.setFont(new Font("Serif", Font.PLAIN, 40));
        intAt.setVisible(false);
        intAt.setEnabled(false);
        intVt2.setBounds(50,460,600,70);
        intVt2.setVisible(false);
        intVt2.setEnabled(false);
        intAt2.setBounds(50,520,600,70);
        intAt2.setVisible(false);
        intAt2.setEnabled(false);

        lbVt.setBounds(95,480,600,70);
        lbVt.setFont(new Font("Serif", Font.PLAIN, 15));
        lbVt.setVisible(false);
        lbVt.setEnabled(false);
        lbAt.setBounds(95,540,600,70);
        lbAt.setFont(new Font("Serif", Font.PLAIN, 15));
        lbAt.setVisible(false);

        LRAMV.setBounds(250, 460,600, 70);
        LRAMV.setVisible(false);
        LRAMV.setEnabled(false);
        RRAMV.setBounds(500, 460,600, 70);
        RRAMV.setVisible(false);
        RRAMV.setEnabled(false);

        LRAMA.setBounds(250, 520,600, 70);
        LRAMA.setVisible(false);
        LRAMA.setEnabled(false);
        RRAMA.setBounds(500, 520,600, 70);
        RRAMA.setVisible(false);
        RRAMA.setEnabled(false);


        printPos.setBounds(50, 110, 400, 50);
        printPos.setVisible(true);
        printVel.setBounds(50, 135, 400, 50);
        printVel.setVisible(true);
        printAcc.setBounds(50, 160, 400, 50);
        printAcc.setVisible(true);

        valPos.setBounds(50, 310, 400, 50);
        valPos.setVisible(false);
        valPos.setEnabled(false);
        valVel.setBounds(50, 335, 400, 50);
        valVel.setVisible(false);
        valVel.setEnabled(false);
        valAcc.setBounds(50, 360, 400, 50);
        valAcc.setVisible(false);
        valAcc.setEnabled(false);

        enter.setBounds(250,70,150,50);
        enter2.setBounds(250,260,150,50);
        enter2.setVisible(false);
        enter2.setEnabled(false);
        clear.setBounds(400, 70, 150, 50);
        clear2.setBounds(400, 260, 150, 50);
        clear2.setVisible(false);
        clear2.setEnabled(false);
        enter3.setBounds(250,620,150,50);
        enter3.setVisible(false);
        enter3.setEnabled(false);
        clear3.setBounds(400, 620, 150, 50);
        clear3.setVisible(false);
        clear3.setEnabled(false);
        lightMode.setBounds(575,70,100,25);
        lightMode.setVisible(true);
        lightMode.setEnabled(true);
        darkMode.setBounds(575,95,100,25);
        darkMode.setVisible(true);
        darkMode.setEnabled(true);


        f.setBounds(50, 70, 200, 50);
        f.setVisible(true);
        x.setBounds(50, 260, 200, 50);
        x.setVisible(false);
        x.setEnabled(false);
        ubVt.setBounds(100, 465, 30, 20);
        ubVt.setVisible(false);
        ubVt.setEnabled(false);
        ubAt.setBounds(100, 525, 30, 20);
        ubAt.setVisible(false);
        ubAt.setEnabled(false);
        si.setBounds(50,620,200,50);
        si.setVisible(false);
        si.setVisible(false);

        frame.add(enter);
        frame.add(enter2);
        frame.add(enter3);
        frame.add(clear);
        frame.add(clear2);
        frame.add(clear3);
        frame.add(reset);
        frame.add(lightMode);
        frame.add(darkMode);
        frame.add(f);
        frame.add(x);
        frame.add(si);
        frame.add(printPos);
        frame.add(printVel);
        frame.add(printAcc);
        frame.add(valPos);
        frame.add(valVel);
        frame.add(valAcc);
        frame.add(inst);
        frame.add(inst2);
        frame.add(inst22);
        frame.add(inst3);
        frame.add(inst4);
        frame.add(inst5);
        frame.add(intVt);
        frame.add(intAt);
        frame.add(intVt2);
        frame.add(intAt2);
        frame.add(lbVt);
        frame.add(lbAt);
        frame.add(ubVt);
        frame.add(ubAt);
        frame.add(LRAMV);
        frame.add(RRAMV);
        frame.add(LRAMA);
        frame.add(RRAMA);
        frame.setVisible(true);



    }
    static String s1 = "";
    static String s2 = "";
    static String s3 = "";

    static String w1 = "";
    static String w2 = "";
    static String w3 = "";
    static String input = "";
    static String uV = "";
    static String uA = "";
    static String siAmt ="";

    public static String deriv(String d){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> indexOfNums = new ArrayList<Integer>();
        String output = "";

        if(d.equals("x")){
            return "1";
        }
        if(d.indexOf("x") == -1){
            return "0";
        }
        for (int i = 0; i < d.length(); i++){
            if (!(d.substring(i, i+1).equals("x") || d.substring(i, i+1).equals("^") || d.substring(i, i+1).equals(" ") || d.substring(i, i+1).equals("+") ||d.substring(i, i+1).equals("-")  )){
                nums.add(Integer.valueOf(d.substring(i,i+1)));
                indexOfNums.add(i);
            }
            else if (d.substring(i-1,i+1).equals(" x")){
                nums.add(1);
                indexOfNums.add(i);
            }
        }

        for (int p = 1; p<nums.size(); p++){
            if (indexOfNums.get(p) - indexOfNums.get(p-1) == 1){
                String a = String.valueOf(nums.get(p-1)) + String.valueOf(nums.get(p));
                nums.set(p, Integer.valueOf(a));
                nums.remove(p-1);
                indexOfNums.remove(p-1);
            }
        }


        if (indexOfNums.size()==1){
            output += nums.get(0);
            return output;
        }

        if (indexOfNums.size()>1){
            for(int e = 1; e < indexOfNums.size(); e++){
                if (indexOfNums.get(e) - indexOfNums.get(e-1) == 3){
                    nums.set(e-1, nums.get(e)*nums.get(e-1) );
                    nums.set(e, nums.get(e) - 1);
                    output += nums.get(e-1) + "x^" + nums.get(e) + " ";
                }

                else if(d.substring(indexOfNums.get(e)+1, indexOfNums.get(e)+2).equals("x")) {
                    output += nums.get(e) + " ";
                    if (indexOfNums.get(e)+1 == d.length()-1){
                        break;
                    }
                    else if (d.substring(indexOfNums.get(e)+2, indexOfNums.get(e)+3).equals("^")){
                        output = output.substring(0, output.length()-2);
                    }
                }



            }
        }

        output = formEq(d, output);

        return output;
    }

    public static String formEq(String k, String v){
        String temp = v;
        ArrayList<String> isoOp = new ArrayList<String>();
        int index = 0;

        for (int i = 0; i< k.length(); i++){
            if (k.substring(i, i+1).equals("+") || k.substring(i, i+1).equals("-") ){
                isoOp.add(k.substring(i, i+1));
            }
        }

        for (int b = 0; b<v.length()-1; b++){
            if (v.substring(b, b+1).equals(" ")){
                temp = v.substring(0, b) + " " + isoOp.get(index) + " " + v.substring(b+1);
                v = temp;
                b+=2;
            }

        }

        return temp;
    }

    public static String solve(String eq, double p){
        double amt = 0;
        int zn= 0;
        int spInd = 0;
        String rt = "";
        ArrayList<String> indiv = new ArrayList<String>();
        ArrayList<Double> indivNums = new ArrayList<Double>();
        ArrayList<String> ops = new ArrayList<String>();

        if (eq.indexOf(" ") == -1){
            indiv.add(eq);
        }

        for (int y = 0; y<eq.length();y++){
            if (eq.substring(y,y+1).equals(" ")){
                indiv.add(eq.substring(spInd, y));
                spInd = y;
            }
        }

        for (int w = 0; w<indiv.size(); w++){
            if (indiv.get(w).indexOf(" ") == 0){
                indiv.set(w, indiv.get(w).substring(1));
            }
        }

        for (int k = 0; k<indiv.size(); k++){
            if (indiv.get(k).indexOf("x") != -1){
                if (indiv.get(k).indexOf("x^") != -1){
                    int d = indiv.get(k).indexOf("x^");
                    int r = Integer.valueOf(indiv.get(k).substring(0,d));
                    int o = Integer.valueOf(indiv.get(k).substring(d+2));
                    double w = Math.pow(p,o);
                    double q = r*w;
                    indivNums.add(q);
                }
                else{
                    int z = indiv.get(k).indexOf("x");
                    int c = Integer.valueOf(indiv.get(k).substring(0,z));
                    double i = (double) c*p;
                    indivNums.add(i);
                }
            }

        }

        if (indiv.get(indiv.size()- 1).indexOf("x")==-1){
            int u = Integer.valueOf(indiv.get(indiv.size()-1));
            indivNums.add((double) u);
        }

        amt += indivNums.get(0);

        //isolate the operators
        for(int l = 0; l<indiv.size(); l++){
            if(indiv.get(l).equals("+") || indiv.get(l).equals("-") ){
                ops.add(indiv.get(l));
            }
        }

        //add all the values together
        for(int e = 1; e<indivNums.size(); e++){
            if(zn < ops.size()){
                if(ops.get(zn).equals("+")){
                    amt += indivNums.get(e);
                }
                else if (ops.get(zn).equals("-")){
                    amt -= indivNums.get(e);
                }
                zn++;
            }
        }

        rt = String.valueOf(amt);

        return rt;
    }

    public static String solveLRAM (String intervals, String upperBound, String equation){
        double amt = Double.valueOf(intervals);
        double upBo = Double.valueOf(upperBound);
        double div = upBo/amt;
        double temp = div;
        double tempSol = 0;
        String solution = "";
        ArrayList<Double> yList = new ArrayList<Double>();
        ArrayList<Double> xList = new ArrayList<Double>();


        while (temp<(upBo-div)){
            xList.add(temp);
            temp+=div;
        }


        for(int k = 0; k<xList.size(); k++ ){
            String g = solve(equation, xList.get(k));
            double p = Double.valueOf(g);
            yList.add(p);
        }

        for (int n =0; n<yList.size(); n++){
            tempSol += div * yList.get(n);
            solution = String.valueOf(tempSol);
        }

        return solution;
    }

    public static String solveRRAM (String intervals, String upperBound, String equation){
        double amt = Double.valueOf(intervals);
        double upBo = Double.valueOf(upperBound);
        double div = upBo/amt;
        double temp = div;
        double tempSol = 0;
        String solution = "";
        ArrayList<Double> yList = new ArrayList<Double>();
        ArrayList<Double> xList = new ArrayList<Double>();

        xList.add(0.0);


        while (upBo>temp){
            xList.add(upBo);
            upBo-=div;
        }


        for(int k = 0; k<xList.size(); k++ ){
            String g = solve(equation, xList.get(k));
            double p = Double.valueOf(g);
            yList.add(p);
        }

        for (int n =0; n<yList.size(); n++){
            tempSol += div * yList.get(n);
            solution = String.valueOf(tempSol);
        }

        return solution;
    }

}


