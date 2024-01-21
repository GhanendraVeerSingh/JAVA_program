import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
class Home {
JFrame f;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bper,bequal,b0;
JLabel l1;
JPanel p1;
JTextField tf;
	Home()
     {
	  f=new JFrame();
	  f.setTitle("Calculator");
	  f.setSize(380,300);
	  f.setBackground(Color.CYAN);
	 f.setResizable(false);
	  Container c= f.getContentPane();
	  c.setLayout(null);
	  p1=new JPanel();
	  p1.setBounds(0,0, 380, 300);
	  p1.setBackground(Color.cyan);
	  p1.setLayout(null);
	  tf=new JTextField();
	  tf.setBounds(10,10,350,40);
	  p1.add(tf);
	  badd=new JButton("+");
	  badd.setBounds(10,60,50,40);
	  p1.add(badd);
	  badd.addActionListener(new Add());
	  bsub=new JButton("-");
	  bsub.setBounds(70,60,50,40);
	  bsub.addActionListener(new Sub());
	  p1.add(bsub);
	  bmul=new JButton("*");
	  bmul.setBounds(130,60,50,40);
	  bmul.addActionListener(new Mul());
	  p1.add(bmul);
	  bdiv=new JButton("/");
	  bdiv.setBounds(190,60,50,40);
	  bdiv.addActionListener(new Div());
	  p1.add(bdiv);
	  bper=new JButton("per");
	  bper.setBounds(250,160,110,40);
	  p1.add(bper);
	  bequal=new JButton("=");
	  bequal.setBounds(250,60,110,40);
	  p1.add(bequal);
	  b0=new JButton("0");
	  b0.setBounds(10,110,50,40);
	  p1.add(b0);
	  
	  b1=new JButton("1");
	  b1.setBounds(70,110,50,40);
	  p1.add(b1);
	  b2=new JButton("2");
	  b2.setBounds(130,110,50,40);
	  p1.add(b2);
	  b3=new JButton("3");
	  b3.setBounds(190,110,50,40);
	  p1.add(b3);
	  b4=new JButton("4");
	  b4.setBounds(250,110,50,40);
	  p1.add(b4);
	  b5=new JButton("5");
	  b5.setBounds(310,110,50,40);
	  p1.add(b5);
	  b6=new JButton("6");
	  b6.setBounds(10,160,50,40);
	  p1.add(b6);
	  b7=new JButton("7");
	  b7.setBounds(70,160,50,40);
	  p1.add(b7);
	  b8=new JButton("8");
	  b8.setBounds(130,160,50,40);
	  p1.add(b8);
	  b9=new JButton("9");
	  b9.setBounds(190,160,50,40);
	  p1.add(b9);
	  
	  
	  f.add(p1);
	  f.setVisible(true);
     }

//@actionPerformed
class Add implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("+");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}

  
}
class Sub implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("-");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}

}

class Mul implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("*");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}

class Div implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("/");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}

class Zero implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("0");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class One implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("1");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Two implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("2");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Three implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("3");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Four implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("4");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Five implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("5");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Six implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("6");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Seven implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("7");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Eight implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("8");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////
class Nine implements ActionListener{
@Override
   public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    try {  
    tf.setText("9");
		
	}
	 
   catch(Exception e1)
   {
	System.out.println(e);
   }

}
}
/////////



}


class Calci{
	//static Home h;
	public static void main(String args[])
	{
     new Home();
	}
}
