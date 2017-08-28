import javax.swing.*;
import javax.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
/////////////////////////////////////////////////////////////

public class tic implements ActionListener
{
JFrame frm=new JFrame("TIC TAC TOE");
JButton btn1=new JButton("");
JButton btn2=new JButton("");
JButton btn3=new JButton("");
JButton btn4=new JButton("");
JButton btn5=new JButton("");
JButton btn6=new JButton("");
JButton btn7=new JButton("");
JButton btn8=new JButton("");
JButton btn9=new JButton("");
JButton btn10=new JButton("RESET GAME");
JButton btn11=new JButton("QUIT");
String s="";
int a=0;
int b=0;
boolean r=false;

tic()
{
frm.setSize(700,600);
frm.setVisible(true);
frm.setLayout(null);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
///////////////////////////////////////////////////////////////
btn1.setBounds(200,110,70,60);
btn2.setBounds(270,110,70,60);
btn3.setBounds(340,110,70,60);
btn4.setBounds(200,170,70,60);
btn5.setBounds(270,170,70,60);
btn6.setBounds(340,170,70,60);
btn7.setBounds(200,230,70,60);
btn8.setBounds(270,230,70,60);
btn9.setBounds(340,230,70,60);
btn10.setBounds(500,30,150,70);
btn11.setBounds(500,120,150,70);
/////////////
frm.add(btn1);
frm.add(btn2);
frm.add(btn3);
frm.add(btn4);
frm.add(btn5);
frm.add(btn6);
frm.add(btn7);
frm.add(btn8);
frm.add(btn9);
frm.add(btn10);
frm.add(btn11);
//////////////
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);
btn6.addActionListener(this);
btn7.addActionListener(this);
btn8.addActionListener(this);
btn9.addActionListener(this);
btn10.addActionListener(this);
btn11.addActionListener(this);
//////////////////////////////
}

public void actionPerformed(ActionEvent ae)
{
a++;
if(a==1||a==3||a==5||a==7||a==9)
{
s="X";
}
else if(a==2||a==4||a==6||a==8||a==10)
{
s="O";
}

/////////////////////////////////////////
if(ae.getSource()==btn1)
{
btn1.setText(s);
btn1.setEnabled(false);
}
else if(ae.getSource()==btn2)
{
btn2.setText(s);
btn2.setEnabled(false);
}
if(ae.getSource()==btn3)
{
btn3.setText(s);
btn3.setEnabled(false);
}
if(ae.getSource()==btn4)
{
btn4.setText(s);
btn4.setEnabled(false);
}
if(ae.getSource()==btn5)
{
btn5.setText(s);
btn5.setEnabled(false);
}
if(ae.getSource()==btn6)
{
btn6.setText(s);
btn6.setEnabled(false);
}
if(ae.getSource()==btn7)
{
btn7.setText(s);
btn7.setEnabled(false);
}
if(ae.getSource()==btn8)
{
btn8.setText(s);
btn8.setEnabled(false);
}
if(ae.getSource()==btn9)
{
btn9.setText(s);
btn9.setEnabled(false);
}
if(ae.getSource()==btn10)
{
	a=0;
	btn1.setText("");
	btn1.setEnabled(true);
	btn2.setText("");
	btn2.setEnabled(true);
	btn3.setText("");
	btn3.setEnabled(true);
	btn4.setText("");
	btn4.setEnabled(true);
	btn5.setText("");
	btn5.setEnabled(true);
	btn6.setText("");
	btn6.setEnabled(true);
	btn7.setText("");
	btn7.setEnabled(true);
	btn8.setText("");
	btn8.setEnabled(true);
	btn9.setText("");
	btn9.setEnabled(true);
}
if(ae.getSource()==btn11)
{
	System.exit(0);
}
/////////////////horizontal win ///////////////////////////////
if(btn1.getText()==btn2.getText()&& btn2.getText()==btn3.getText()&& btn1.getText()!="")
{
	r=true;
}
else if(btn4.getText()==btn5.getText()&& btn5.getText()==btn6.getText()&& btn4.getText()!="")
{
	r=true;
}
else if(btn7.getText()==btn8.getText()&& btn8.getText()==btn9.getText()&& btn7.getText()!="")
{
	r=true;
}
/////////////////vertical win ///////////////////////////////////
else if(btn1.getText()==btn4.getText()&& btn4.getText()==btn7.getText()&& btn1.getText()!="")
{
	r=true;
}
else if(btn2.getText()==btn5.getText()&& btn5.getText()==btn8.getText()&& btn2.getText()!="")
{
	r=true;
}
else if(btn3.getText()==btn6.getText()&& btn6.getText()==btn9.getText()&& btn3.getText()!="")
{
	r=true;
}
//////////////// cross win///////////////////////////////////////////////
else if(btn1.getText()==btn5.getText()&& btn5.getText()==btn9.getText()&& btn1.getText()!="")
{
	r=true;
}
else if(btn3.getText()==btn5.getText()&& btn5.getText()==btn7.getText()&& btn3.getText()!="")
{
	r=true;
}
else 
{
	r=false;
}
///////////////////////////////////////////////////////////////////////////
if(r==true)
{
	JOptionPane.showMessageDialog(null,s+""+"win");
}
else if(a==9&& r==false)
{
	JOptionPane.showMessageDialog(null,"Its a Tie");
}
}

////////////////////////

public static void main(String args[])
{
tic ob=new tic();
}
}