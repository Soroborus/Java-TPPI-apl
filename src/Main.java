import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main extends JFrame {

    static JFrame frame = new JFrame("Расчет передачи с зубчатым ремнём");
    static JPanel panel = new JPanel();
    public static JLabel zLabel=new JLabel();
    public static JLabel dLabel=new JLabel();
    public static JLabel aLabel =new JLabel();
    public static JLabel angleLabel =new JLabel();
    public static JLabel vLabel =new JLabel();
    public static JLabel bLabel =new JLabel();
    public static JLabel daLabel=new JLabel();
    public static JLabel BLabel=new JLabel();
    public static JLabel psLabel=new JLabel();

    public static void main(String[] args) throws IOException {
        init();

    }

    public static void init() throws IOException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        frame.setSize(500, 630);
        Container contentPane = frame.getContentPane();

        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        contentPane.setBackground(Color.white);
        JTextField P1text = new JTextField(8);
        JLabel labelP1 = new JLabel("Требуемая мощность электродвигателя  P1");
        JTextField n1text = new JTextField(8);
        JLabel labeln1 = new JLabel("Частота вращения n1");
        JTextField utext = new JTextField(8);
        JLabel labelu = new JLabel("Передаточное число ременной передачи u");
        labelu.setForeground(Color.BLACK);
        labelP1.setForeground(Color.BLACK);
        labeln1.setForeground(Color.black);

        BufferedImage myPicture = ImageIO.read(new File("16.png"));
        frame.setIconImage(new ImageIcon("16.png").getImage());
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panel.add(picLabel);
        JButton button = new JButton();
        button.setBackground(Color.getHSBColor(0, 100, 10));
        button.setSize(new Dimension(100, 100));
        button.setText("Рассчитать");
        JButton backbutton=new JButton("К меню ввода праметров");
        backbutton.setSize(100,100);
        backbutton.setBackground(Color.GRAY);
        panel.add(button);


        JLabel jLabel = new JLabel("test");
        Image image = Toolkit.getDefaultToolkit().createImage("tenor1.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jLabel);
        jLabel.setIcon(imageIcon);

        JLabel jLabel1=new JLabel("");
        Image image1=Toolkit.getDefaultToolkit().createImage("tenor2.gif");
        ImageIcon imageIcon1=new ImageIcon(image1);


        frame.add(jLabel);

        contentPane.add(button);
        contentPane.add(labelP1);
        contentPane.add(P1text);
        contentPane.add(labeln1);
        contentPane.add(n1text);
        contentPane.add(labelu);
        contentPane.add(utext);
        //contentPane.add(picLabel);
        contentPane.add(jLabel);
        contentPane.add(zLabel);
        contentPane.add(dLabel);
        contentPane.add(aLabel);
        contentPane.add(angleLabel);
        contentPane.add(vLabel);
        contentPane.add(bLabel);
        contentPane.add(daLabel);
        contentPane.add(BLabel);
        contentPane.add(psLabel);
        zLabel.setVisible(false);
        daLabel.setVisible(false);
        aLabel.setVisible(false);
        angleLabel.setVisible(false);
        vLabel.setVisible(false);
        bLabel.setVisible(false);
        daLabel.setVisible(false);
        BLabel.setVisible(false);
        psLabel.setVisible(false);
        contentPane.add(backbutton);
        backbutton.setVisible(false);
        backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(true);
                jLabel.setVisible(true);
                labelu.setVisible(true);
                labeln1.setVisible(true);
                labelP1.setVisible(true);
                utext.setVisible(true);
                n1text.setVisible(true);
                P1text.setVisible(true);
                backbutton.setVisible(false);
                zLabel.setVisible(false);
                dLabel.setVisible(false);
                aLabel.setVisible(false);
                angleLabel.setVisible(false);
                vLabel.setVisible(false);
                bLabel.setVisible(false);
                daLabel.setVisible(false);
                BLabel.setVisible(false);
                psLabel.setVisible(false);
                jLabel.setIcon(imageIcon);
                layout.putConstraint(SpringLayout.WEST, jLabel, 0, SpringLayout.WEST, contentPane);
                layout.putConstraint(SpringLayout.NORTH, jLabel, 100, SpringLayout.NORTH, contentPane);
                frame.setSize(500, 630);
            }
        });
        //компановка
        layout.putConstraint(SpringLayout.WEST, labelP1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, labelP1, 25, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, P1text, 25, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, P1text, 20, SpringLayout.EAST, labelP1);

        layout.putConstraint(SpringLayout.WEST, labeln1, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, labeln1, 50, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, n1text, 50, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, n1text, 20, SpringLayout.EAST, labelP1);

        layout.putConstraint(SpringLayout.WEST, labelu, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, labelu, 75, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, utext, 75, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, utext, 20, SpringLayout.EAST, labelP1);

        layout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, button, 110, SpringLayout.NORTH, contentPane);

        //layout.putConstraint(SpringLayout.WEST , picLabel, 0, SpringLayout.WEST , contentPane);
        //layout.putConstraint(SpringLayout.NORTH, picLabel, 0, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST, jLabel, 0, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, jLabel, 100, SpringLayout.NORTH, contentPane);

        layout.putConstraint(SpringLayout.WEST,backbutton,255,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,backbutton,620,SpringLayout.NORTH,contentPane);
        //КОМПАНОВКА ОКНА РАСЧЕТА
        layout.putConstraint(SpringLayout.WEST,zLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,zLabel,25,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,dLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,dLabel,50,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,aLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,aLabel,75,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,angleLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,angleLabel,100,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,vLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,vLabel,125,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,bLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,bLabel,150,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,daLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,daLabel,175,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,BLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,BLabel,200,SpringLayout.NORTH,contentPane);

        layout.putConstraint(SpringLayout.WEST,psLabel,10,SpringLayout.WEST,contentPane);
        layout.putConstraint(SpringLayout.NORTH,psLabel,225,SpringLayout.NORTH,contentPane);


        frame.setResizable(false);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(false);

                labelu.setVisible(false);
                labeln1.setVisible(false);
                labelP1.setVisible(false);
                String u=utext.getText();
                String n1=n1text.getText();
                String P1=P1text.getText();
                utext.setVisible(false);
                n1text.setVisible(false);
                P1text.setVisible(false);
                backbutton.setVisible(true);
                zLabel.setVisible(true);
                dLabel.setVisible(true);
                aLabel.setVisible(true);
                angleLabel.setVisible(true);
                vLabel.setVisible(true);
                bLabel.setVisible(true);
                daLabel.setVisible(true);
                BLabel.setVisible(true);
                psLabel.setVisible(true);

                if ((isDigit(u))&&(isDigit(P1))&&(isDigit(n1))){
                    if(Double.parseDouble(n1)!=0) {
                        count(Double.parseDouble(P1), Double.parseDouble(n1), Double.parseDouble(u));
                        frame.setSize(750, 690);
                        layout.putConstraint(SpringLayout.WEST, jLabel, 0, SpringLayout.WEST, contentPane);
                        layout.putConstraint(SpringLayout.NORTH, jLabel, 250, SpringLayout.NORTH, contentPane);
                        jLabel.setIcon(imageIcon1);
                    }
                    else {
                        button.setVisible(true);
                        labelu.setVisible(true);
                        labeln1.setVisible(true);
                        labelP1.setVisible(true);
                        utext.setVisible(true);
                        n1text.setVisible(true);
                        P1text.setVisible(true);
                        backbutton.setVisible(false);
                        zLabel.setVisible(false);
                        dLabel.setVisible(false);
                        aLabel.setVisible(false);
                        angleLabel.setVisible(false);
                        vLabel.setVisible(false);
                        bLabel.setVisible(false);
                        daLabel.setVisible(false);
                        BLabel.setVisible(false);
                        psLabel.setVisible(false);
                        n1text.setText("Не 0");
                        frame.setSize(500, 630);
                        jLabel.setIcon(imageIcon);
                        layout.putConstraint(SpringLayout.WEST, jLabel, 0, SpringLayout.WEST, contentPane);
                        layout.putConstraint(SpringLayout.NORTH, jLabel, 100, SpringLayout.NORTH, contentPane);

                    }
                }
                else {
                    button.setVisible(true);
                    jLabel.setVisible(true);
                    labelu.setVisible(true);
                    labeln1.setVisible(true);
                    labelP1.setVisible(true);
                    utext.setVisible(true);
                    n1text.setVisible(true);
                    P1text.setVisible(true);
                    backbutton.setVisible(false);
                    zLabel.setVisible(false);
                    dLabel.setVisible(false);
                    aLabel.setVisible(false);
                    angleLabel.setVisible(false);
                    vLabel.setVisible(false);
                    bLabel.setVisible(false);
                    daLabel.setVisible(false);
                    BLabel.setVisible(false);
                    psLabel.setVisible(false);
                    frame.setSize(500, 630);
                }
            }
        });

    }

    public static void count(double P1, double n1, double u) {
        //модуль ремня
        double m = 3.5 * Math.cbrt(1000 * P1 / n1);
        m=nearest(m,normalm);
        //данные по модулю ремня
        double[] table12=table12(m);
        double p=table12[0];
        double s=table12[1];
        double h=table12[2];
        double H=table12[3];
        double t=table12[4];
        double y=table12[5];
        double Zpmin=table12[6];
        double Zpmax=table12[7];
        double bmin=table12[8];
        double bmax=table12[9];
        double zmin=table12[10];
        double zmax=table12[11];
        double umax=table12[12];
        double F0s=table12[13];
        double q=table12[14];
        double A=table12[15]/10000;
        double Cp=1.5;
        //считаем число зубьев
        double z1=table2(m,n1);
        double z2=z1*u;

        //делительные параметры шкивов
        double d1=m*z1;
        double d2=m*z2;

        //длина ремня
        //межосевое расстояние
        double a=0.5*(d1+d2)+2*m;

        //длина ремня
        double Lp=2*a/p+(z1+z2)/2+((z2-z1)/6.28)*((z2-z1)/6.28)*p/a;
        Lp=nearest(Lp,Lpstandart);
        //окончательное межосевое расстояние

        a=p/4*(Lp-(z2-z1)/2+Math.sqrt(Math.pow((Lp-(z2-z1)/2),2)-8*Math.pow((z2-z1)/6.28,2)));



        //угол обхвата малого шкива
        double angle=180-57*(d2-d1)/a;

        //число зубьев, в зацеплении с меньшим шкивом
        double z0=z1*angle/360;


        //скорость ремня
        double v=3.14*d1*n1/60000;

        //окружная сила
        //вращающий момент на ведущем валу
        double T1=30*P1/3.14/n1*1000;

        //окружная сила
        double Ft=2*T1/d1*1000;

        //ширина ремня
        //допускаемая удельная сила
        double Fs=F0s/Cp;

        //предварительное значение ширины ремня
        double bpred=Ft/Fs;

        //ширина ремня
        double b=nearest(bpred,bstandart);
        double Cb=getCb(b);

        //сила, действующая на валы

        double Fy=getFy(m);
        double Fn=1.1*Ft;

        //размеры шкивов
        //диаметры в ершин шкивов
        double da1=d1-2*t+0.2*A*Ft*z1/b;
        double da2=d2-2*t+0.2*A*Ft*z2/b;

        //ширина шкива
        double B=b+m;

        //окружной шаг шкива
        double ps1=3.14*(da1-4)/z1;
        double ps2=3.14*(da2-4)/z2;
        zLabel.setText("Число зубьев малого шкива z1= "+z1+" и большого шкива z2="+z2);
        dLabel.setText("Делительные диаметры шкивов(мм) d1="+d1+" d2="+d2);
        aLabel.setText("Межосевое расстояние(мм) a= "+a);
        angleLabel.setText("Угол обхвата ремнем малого шкива "+angle);
        vLabel.setText("Скорость ремня (м/c), v="+v);
        bLabel.setText("Ширина ремня(мм) b="+b);
        daLabel.setText("Диаметры вершин шкивов(мм) da1="+da1+" da2="+da2);
        BLabel.setText("Ширина шкива(мм) B="+B);
        psLabel.setText("Окружной шаг ps1="+ps1+" ps2="+ps2);
    }
    public static double[]table12(double key) {
        double[] arr = new double[]{-1};
        if (key == 1) {
            arr = new double[]{3.1, 1.0, 0.8, 1.6, 0.4, 50, 40, 160, 3, 16,13,100,7.7,2.5,2,7};
        }
        if (key == 1.5) {
            arr = new double[]{4.71, 1.5, 1.2, 2.2, 0.4, 50, 40, 160, 3, 16,10,100,10,3.5,2.5,8};
        }
        if (key == 2) {
            arr = new double[]{6.28, 1.8, 1.5, 3.0, 0.6, 50, 40, 160, 5, 20,10,115,11.5,5,3,9};
        }
        if (key == 3) {
            arr = new double[]{9.42, 3.2, 2.0, 4.0, 0.6, 40, 40, 160, 12.5, 50.0,10,115,12,9,4,14};
        }
        if (key == 4) {
            arr = new double[]{12.57, 4.4, 2.5, 5.0, 0.8, 40, 48, 250, 20.0, 100.0,15,120,8,25,6,6};
        }
        if (key == 5) {
            arr = new double[]{15.71, 5.0, 3.5, 6.5, 0.8, 40, 48, 250, 25.0, 100.0,15,120,8,30,7,8};
        }
        if (key == 7) {
            arr = new double[]{21.99, 8.0, 6.0, 11.0, 0.8, 40, 56, 140, 40.0, 125.0,18,120,5.7,32,8,11};
        }
        return arr;
    }
    public static double[] normalm=new double[]{1,1.5,2,3,4,5,7};
    public static double table2(double m,double n){
        double[] normaln=new double[]{1000,1500,3000};
        double nnear=nearest(n,normaln);
        if (m==1){
            if(nnear==1000){
                return 13;
            }
            if (nnear==2000){
                return 14;
            }
            if (nnear==3000){
                return 15;
            }
        }
        if (m==1.5){
            if(nnear==1000){
                return 10;
            }
            if (nnear==2000){
                return 11;
            }
            if (nnear==3000){
                return 12;
            }
        }
        if (m==2){
            if(nnear==1000){
                return 10;
            }
            if (nnear==2000){
                return 11;
            }
            if (nnear==3000){
                return 12;
            }
        }
        if (m==3){
            if(nnear==1000){
                return 12;
            }
            if (nnear==2000){
                return 14;
            }
            if (nnear==3000){
                return 16;
            }
        }
        if ((m==4 )||(m==5)){
            if(nnear==1000){
                return 16;
            }
            if (nnear==2000){
                return 18;
            }
            if (nnear==3000){
                return 20;
            }
        }

        if (m==7){
            if(nnear==1000){
                return 22;
            }
            if (nnear==2000){
                return 24;
            }
            if (nnear==3000){
                return 26;
            }
        }
        return 0;
    }
    public static double[] Lpstandart=new double[]{45, 48, 50, 53,5, 56, 60, 63, 67, 71, 75, 80, 85, 90, 100, 105, 112, 115, 125,
            130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 235};
    public static double[] bstandart=new double[]{5, 8, 10, 12,5, 16, 20, 25, 32, 40, 50, 63,
            80, 100, 125, 160, 200};
    public static double nearest(double n, double[]args) {
            //тут мы храним значение ближайшего числа
            double nearest = 0;
            //очевидно же, что максимальное значение типа int - это одновременно максимальная удаленность двух чисел
            //Умножаем на два и приводим к типу long, так как в Java нет беззнаковых типов
            double value = 99999;
            //дальше просто проходим по массиву и сравниваем разницу
            //сравнение по модулю, т.е. чем меньше разница - тем ближе числа
            for(double arg : args)
                if (value > Math.abs(n - arg)){
                    value = Math.abs(n-arg);
                    nearest = arg;}

            return nearest;
    }

    public static double getCb(double b){
        if(b<8){
            return 0.7;
        }
        if (b<16){
            return 0.85;
        }
        if(b<25){
            return 0.95;
        }
        if(b==25){
            return 1;
        }
        if (b<40){
            return 1.10;
        }
        if (b<65){
            return 1.15;
        }
        if (b<100){
            return 1.10;
        }
        return 1.15;
    }

    public static double getFy(double m){
        if (m==2){
            return 1;
        }
        if (m==3){
            return 1.5;
        }
        if (m==4){
            return 4;
        }
        if (m==5){
            return 5;
        }
        if (m==7){
            return 7;
        }
        return 0;
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}