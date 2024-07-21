package toll;
import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

//MAIN CLASS
public class Toll {
    int t1=200,t2=250,t3=190,t4=225;
        MyFrame m=new MyFrame();
        HashMap<String,LinkedList> T1=new HashMap<>();
        HashMap<String,LinkedList> T2=new HashMap<>();
        HashMap<String,LinkedList> T3=new HashMap<>();
        HashMap<String,LinkedList> T4=new HashMap<>();
        
       
    public static void main(String[] args)
    {
       Toll t=new Toll();
       //Toll1 SAMPLE DATUM
       LinkedList<String> TNX8923 =new LinkedList<String>();
       TNX8923.add("Car");
       TNX8923.add("Srivilliputhur");
       TNX8923.add("Chennai");
       TNX8923.add("T1");
       TNX8923.add("200");
       
       t.T1.put("TNX8923", TNX8923);
     //  String s= t.T1.get("TNX8923").get(0).toString();
      // System.out.println(s);
       
       LinkedList<String> TNX8924 =new LinkedList<String>();
       TNX8924.add("Truck");
       TNX8924.add("Rajapalayam");
       TNX8924.add("Trichy");
       TNX8924.add("T1,T2");
       TNX8924.add("450");
    
       t.T1.put("TNX8924", TNX8924);
       
       
       
       //Toll2 SAMPLE DATUM
        TNX8924.add("Truck");
       TNX8924.add("Rajapalayam");
       TNX8924.add("Trichy");
       TNX8924.add("T2");
       TNX8924.add("250");
    
       t.T2.put("TNX8924", TNX8924);
       LinkedList<String> TNX8523 =new LinkedList<String>();
       TNX8523.add("Car");
       TNX8523.add("Srivilliputhur");
       TNX8523.add("Chennai");
       TNX8523.add("T2");
       TNX8523.add("250");
       
       t.T2.put("TNX8523", TNX8523);
     //  String s= t.T1.get("TNX8923").get(0).toString();
      // System.out.println(s);
       
     
 
        
    }



//MAIN FRAME
 class MyFrame  extends JFrame implements ActionListener
{
     JButton b1,b2,b3,b4;
    public MyFrame()
    {
        
        
        
          setLayout(new BorderLayout());
        Border blackline = BorderFactory.createLineBorder(Color.black);
          JPanel jp=new JPanel(); //FOR TEXT FIELD
          JPanel jp1=new JPanel(); //FOR BUTTONS
        //  jp1.setBackground(Color.red);
          
         jp.setPreferredSize(new Dimension(200,50));
         jp1.setBorder(blackline);
         GridLayout layout=new GridLayout(3,4,24,24);
 
         jp1.setLayout(layout);
       
           
             add(jp,BorderLayout.PAGE_START);
             add(jp1,BorderLayout.CENTER);
      
        //TOLL PAYMENT LABEL
        JLabel l= new JLabel("TOLL PAYMENT");
        l.setFont(new Font("Verdana", Font.BOLD,20));
        jp.add(l);
       
       
        //BUTTON
        Icon i1=new ImageIcon("m1.png");
         b1=new JButton("vehicle History",i1);
        jp1.add(b1);
        b1.addActionListener(this);
         
        Icon i2=new ImageIcon("toll.png");
       b2=new JButton("Toll History",i2);
        jp1.add(b2);
        b2.addActionListener(this);
         
        
        Icon i3=new ImageIcon("racing.png");
        b3=new JButton("All vehicles",i3);
        jp1.add(b3);
        b3.addActionListener(this);
        
        Icon i4=new ImageIcon("money.png");
       b4=new JButton("Toll calc",i4);
        jp1.add(b4);
        b4.addActionListener(this);
      
  
        
            
  
     
        setVisible(true);
        setSize(390,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        JButton pb=(JButton)e.getSource();
      M1 m1;
      M2 m2;
        if(pb==b1)
        {
           new M1(); 
        }
        else if(pb==b2)
        {
            new M2();
        }
        
        
      
}
 }


//M1 CLASS

class M1 extends JFrame implements ActionListener
{

JLabel label1, label2, label3,l1,l2,l3,l4,l5,l6;
JTextField field1, field2,field3,t1,t2,t3,t4,t5,t6;
JButton button1, button2, button3;
JFrame jf;
 
public M1()
{
jf = new JFrame();
jf.setSize(300,600);
jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));
//JPanel jp=new JPanel();
//jp.setLayout(new FlowLayout());
//jp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


//jp.setSize(700, 800);
label1= new JLabel("Enter vehicle number");
label2=new JLabel("Enter vehicle type");
label3=new JLabel("Enter the toll number");
l1=new JLabel("Vehicle Type:");
l2=new JLabel("Vehicle Number:");
l3=new JLabel("Toll paid by vehicle:");
l4=new JLabel("Source:");
l5=new JLabel("Destination:");
l6=new JLabel("Tolls Passed:");

field1 = new JTextField(14);
field1.setColumns(45);
field2=  new JTextField(14);
field3=  new JTextField(14);
 t1=new JTextField(14);

 t2=new JTextField(14);

 t3=new JTextField(14);

 t4=new JTextField(14);

 t5=new JTextField(14);
 
  t6=new JTextField(14);

button1 = new JButton("Get");
button1.setPreferredSize(new Dimension(100,50));
button1.addActionListener(this);


//jf.setLayout(new FlowLayout()); // calling the first constructor of FlowLayout class, which
				// positions each line of components in the center of JFrame

jf.add(label1);	  		 //Adding the first Jlabel component to JFrame container
jf.add(field1);	  		 //Adding the first JTextField component to JFrame container
jf.add(label2);
jf.add(field2);
jf.add(label3);
jf.add(field3);
jf.add(button1);  
jf.add(l1);
jf.add(t1);
jf.add(l2);
jf.add(t2);
jf.add(l3);
jf.add(t3);
jf.add(l4);
jf.add(t4);
jf.add(l5);
jf.add(t5);
jf.add(l6);
jf.add(t6);



jf.setVisible(true); 
//jf.add(jp);
}
public void actionPerformed(ActionEvent e) {
     String b=field1.getText(); //NUMBER
     String c=field2.getText(); //Type
     String d=field3.getText(); //Toll
     HashMap<String, LinkedList>A=T1;
     LinkedList L;
    if(d.equals("T1")){A=T1;}
    else if(d.equals("T2")){A=T2;}
    else if(d.equals("T3")){A=T3;}
    else if(d.equals("T4")){A=T4;}
   if(c.equals("car")){
          if (!A.containsKey(b))
              JOptionPane.showMessageDialog(this, "NO DATA FOUND","INFORMATION",
                                          JOptionPane.INFORMATION_MESSAGE);
         else{
     t1.setText(c);
     t2.setText(b);
     
     t3.setText((A.get(b).get(4).toString()));
     t4.setText((A.get(b).get(1).toString()));
     t5.setText((A.get(b).get(2).toString()));
     t6.setText((A.get(b).get(3).toString()));
          }
   }
     else{
         if (!A.containsKey(b))
               JOptionPane.showMessageDialog(this, "NO DATA FOUND","INFORMATION",
                                          JOptionPane.INFORMATION_MESSAGE);
          else{
      t1.setText(c);
     t2.setText(b);
    
     t3.setText(A.get(b).get(4).toString());
     t4.setText(A.get(b).get(1).toString());
     t5.setText(A.get(b).get(2).toString());
     t6.setText((A.get(b).get(3).toString()));
          }
        }
}
    }


class M2 extends JFrame
{
   
	JFrame f;
	
	JTable j;


	M2()
	{
            String[][] data=new String[100][100];
		
		f = new JFrame();

		// Frame Title
		f.setTitle("JTable Example");
                
              
                String V1[]=new String[T1.size()];      
       int i=0;
       for(Map.Entry k:T1.entrySet()) 
        { 
            V1[i]= (String)k.getKey();       
		      i++;      
	   } 
             String V2[]=new String[T2.size()];      
        i=0;
       for(Map.Entry k:T2.entrySet()) 
        { 
            V2[i]= (String)k.getKey();       
		      i++;      
	   } 
       
     int fal = V1.length;        //determines length of firstArray  
int sal = V2.length;   //determines length of secondArray  
String[] result = new String[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(V1, 0, result, 0, fal);  
System.arraycopy(V2, 0, result, fal, sal);  
System.out.println(Arrays.toString(result));    //prints the resultant array  

//UPDATE VEHICEL NUMBER
    for( i=0;i<result.length;i++)
    {
        int j=1;
        data[i][j]=result[i];
}  
 
	
    String VT1[]=new String[T1.size()];
        for(i=0;i<V1.length;i++)
        { 
            VT1[i]=T1.get(V1[i]).get(0).toString();
	   } 
       
         String VT2[]=new String[T2.size()];
        for(i=0;i<V2.length;i++)
        { 
            VT2[i]=T2.get(V2[i]).get(0).toString();
	   } 
                 
          fal = VT1.length;        //determines length of firstArray  
 sal = VT2.length;   //determines length of secondArray  
String[] result1 = new String[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(VT1, 0, result1, 0, fal);  
System.arraycopy(VT2, 0, result1, fal, sal);  
System.out.println(Arrays.toString(result1));

		
//UPDATE VEHICEL TYPE
    for( i=0;i<result1.length;i++)
    {
        int j=2;
        data[i][j]=result1[i];
}  
    
    
    
     String TP1[]=new String[T1.size()];
        for(i=0;i<V1.length;i++)
        { 
            TP1[i]=T1.get(V1[i]).get(4).toString();
	   } 
       
         String TP2[]=new String[T2.size()];
        for(i=0;i<V2.length;i++)
        { 
            TP2[i]=T2.get(V2[i]).get(4).toString();
	   } 
                 
          fal = VT1.length;        //determines length of firstArray  
 sal = VT2.length;   //determines length of secondArray  
String[] result2 = new String[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(TP1, 0, result2, 0, fal);  
System.arraycopy(TP2, 0, result2, fal, sal);  
System.out.println(Arrays.toString(result2));

		
//UPDATE TOTAL PAID
    for( i=0;i<result2.length;i++)
    {
        int j=3;
        data[i][j]=result2[i];
}  
    
    
      String P1[]=new String[T1.size()];
        for(i=0;i<V1.length;i++)
        { 
            P1[i]=T1.get(V1[i]).get(3).toString();
	   } 
       
         String P2[]=new String[T2.size()];
        for(i=0;i<V2.length;i++)
        { 
            P2[i]=T2.get(V2[i]).get(3).toString();
	   } 
                 
          fal = P1.length;        //determines length of firstArray  
 sal = P2.length;   //determines length of secondArray  
String[] result3 = new String[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(P1, 0, result3, 0, fal);  
System.arraycopy(P2, 0, result3, fal, sal);  
System.out.println(Arrays.toString(result3));

		
//UPDATE TOTAL PAID
    for( i=0;i<result3.length;i++)
    {
        int j=4;
        data[i][j]=result3[i];
}  
    
    
 for(i=0;i<T1.size()+T2.size();i++)
 {
    int j=0;
    if(i<T1.size())
     data[i][j]="TOLL1";
    else
        data[i][j]="TOLL2";
 }
 
        

		
		String[] columnNames = { "TOLL", "VEHICLE NUMBER","VEHICLE TYPE","TOTAL PAID","TOLLS PASSED" };

		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		
		f.setSize(500, 200);
		
		f.setVisible(true);
	}

	
}

}


