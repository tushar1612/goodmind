//purpose:to create a single frame which displays 4 lables of a book shop by this project we can add delete and search in
a list and we can also traverse  our data in both directions.
package exam;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
class myframe extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField t2, t3, t4, t7,t1;
    JButton b1, b2,b3,b4,b5,b6,b7;
    String x;
    int count=1,nor=0;
    myframe()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("books shop in Java");
 
        l1 = new JLabel("books SHOP:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
 
        l2 = new JLabel("books:");
        l3 = new JLabel("author:");
        l4 = new JLabel("price:");
        l5 = new JLabel("pages:");
      
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4= new JTextField();
     
 
        b1 = new JButton("|<");
        b2 = new JButton("<");
        b3 = new JButton(">");
        b4 = new JButton(">|");
        b5 = new JButton("add");
        b6 = new JButton("search");
        b7 = new JButton("delete");
        
        
        
 
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tushar1 fr=new tushar1();
				try{
					fr.read();}
				catch(IOException e1){}
					t1.setText(fr.books);
					t2.setText(fr.author);
					t3.setText(fr.price);
					
					t4.setText(fr.pages);
				
			}
        	
        });
        b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tushar6 a=new tushar6();
				try{
					if (count-1>=2)count++;
					a.read(count);}
				catch(IOException e1){}
					t1.setText(a.books);
					t2.setText(a.author);
					t3.setText(a.price);
					t4.setText(a.pages);
				
			}
        	
        }); 
        b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tushar7 a=new tushar7();
				try{
					if (count+1<=nor)count++;
					a.read(count);}
				catch(IOException e1){}
					t1.setText(a.books);
					t2.setText(a.author);
					t3.setText(a.price);
					t4.setText(a.pages);
				
			}
        	
        });
        b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				tushar2 a=new tushar2();
				try{
					a.read();}
				catch(IOException e1){}
					t1.setText(a.books);
					t2.setText(a.author);
					t3.setText(a.price);
					
					t4.setText(a.pages);
				
			}
        	
        });
        b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				tushar4 a=new tushar4();
				try{
					nor++;
					a.addrec(t1.getText(), t2.getText(), t3.getText(), t4.getText());}
				catch(IOException e1){}
					t1.setText(a.books);
					t2.setText(a.author);
					t3.setText(a.price);
					
					t4.setText(a.pages);
			}
        	
        });
        b6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tushar8 fr=new tushar8();
				
				try{
					fr.read(t2.getText());
					System.out.println("==="+t2.getText());}
				catch(IOException e1){}
				System.out.println(fr.books);
					t1.setText(fr.author);
					t2.setText(fr.books);
					t3.setText(fr.page);
					
					t4.setText(fr.price);
				
			}
        
			
        	
        });

        b7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tushar5 a=new tushar5();
				try{
					a.deleterec(t1.getText());}
				catch(IOException e1){}
					t1.setText(a.author);
					t2.setText(a.books);
					t3.setText(a.page);
					
					t4.setText(a.price);
				
			}
        	
        });

         
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        
        t1.setBounds(300, 70, 200, 30);
        t2.setBounds(300, 110, 200, 30);
        t3.setBounds(300, 150, 200, 30);
        t4.setBounds(300, 190, 200, 30);
        b1.setBounds(50, 350, 100, 30);
        b2.setBounds(170, 350, 100, 30);
        b3.setBounds(290, 350, 100, 30);
        b4.setBounds(410, 350, 100, 30);
        b5.setBounds(50, 390, 140, 30);
        b6.setBounds(210, 390, 140, 30);
        b7.setBounds(370, 390, 140, 30);
        
 
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        
    }



	@Override
	public void actionPerformed(ActionEvent e) 
	{		
	}
}
 class tushar1 {
	 String books,author; 
	String pages,price;
	 
	void read() throws IOException{
		FileReader fr=new FileReader("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		if((line=br.readLine())!=null){
			books=line.substring(0, 6);
			author=line.substring(8,14);
			price=line.substring(16, 20);
			pages=line.substring(22,line.length()-1);
			
			
			System.out.println(books);
			System.out.println(author);
			System.out.println(price);
			System.out.println(pages);
			
			
		//	System.out.println(line);
			
		}
		br.close();
	}
 }
 class tushar2 {
	 String books,author; 
	String pages,price;
	 
	void read() throws IOException{
		FileReader fr=new FileReader("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null){
			books=line.substring(0, 6);
			author=line.substring(8,14);
			pages=line.substring(16, 20);
			price=line.substring(22,line.length()-1);
			
			
			System.out.println(books);
			System.out.println(author);
			System.out.println(price);
			System.out.println(pages);
			
			
			System.out.println(line);
			
		}
		br.close();
	}
 }
	
 class tushar3 {
	 String books,author; 
	String page,price;
	 
	void read() throws IOException{
		File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
		File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
		BufferedReader br=new BufferedReader(new FileReader(fr));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

		String line;
		String current;
		while((current=br.readLine())!=null){
			String trimmedLine=current.trim();
			if(trimmedLine.equals(author))continue;
			writer.write(current+System.getProperty("|"));
		}
		writer.close();
		
		br.close();
		boolean succeful=tempfile.renameTo(fr);
	}
	void deleterec(String str) throws IOException{
		File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
		File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
		BufferedReader br=new BufferedReader(new FileReader(fr));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

		String line;
		String current;
		System.out.println("\n=>"+str);
		while((current=br.readLine())!=null){
			if (!current.substring(8, 14).equalsIgnoreCase(str)){
				writer.write(current);
				writer.newLine();
				//writer.write("\n");
			}
		}
		writer.close();
		
		br.close();
		fr.delete();
		tempfile.renameTo(fr);
		//System.out.println(succeful);
	}
 }

	class tushar4{
		String books,author; 
		String pages,price;
		 
		void read() throws IOException{
			FileReader fr=new FileReader("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
			File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
			String line;
			if((line=br.readLine())!=null){
				books=line.substring(0, 6);
				author=line.substring(8,14);
				pages=line.substring(16, 20);
				price=line.substring(22,line.length()-1);
				if(null!=line && !line.equalsIgnoreCase(author) && !line.equalsIgnoreCase(books) &&!line.equalsIgnoreCase(pages) && !line.equalsIgnoreCase(price))
				
				System.out.print(books);
				System.out.print(author);
				System.out.print(price);
				System.out.print(pages);
				
				
				System.out.println(line);
				
			}
			
			PrintWriter out = new PrintWriter("C:\\Users\\TUSHAR\\Desktop\\tush.txt"); // Step 2

	        // Write the name of four oceans to the file
	        out.println(books);   // Step 3
	        out.println(author);
	        out.println(price);
	        out.println(pages);

	        // Close the file.
	        out.close();  // Step 4
			br.close();
		}	
		void addrec(String aa, String bb, String cc, String dd) throws IOException{
			File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
			File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

			String line;
			String current;
			while((current=br.readLine())!=null){
					writer.write(current);
					writer.newLine();
				}
			String aaa=aa,bbb=bb,ccc=cc,ddd=dd;
			for(int i=aa.length();i<6;i++)
				aaa=aaa+" ";
			for(int i=bb.length();i<6;i++)
				bbb=bbb+" ";
			for(int i=cc.length();i<6;i++)
				ccc=ccc+" ";
			for(int i=dd.length();i<6;i++)
				ddd=ddd+" ";
			writer.write(aaa+"|"+bbb+"|"+ccc+"|"+ddd);
			
			writer.close();
			
			br.close();
			fr.delete();
			tempfile.renameTo(fr);
			//System.out.println(succeful);
		}
	}
	 class tushar5 {
		 String books,author; 
		String page,price;
		 
		void read() throws IOException{
			File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
			File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

			String line;
			String current;
			while((current=br.readLine())!=null){
				String trimmedLine=current.trim();
				if(trimmedLine.equals(author))continue;
				writer.write(current+System.getProperty("|"));
			}
			writer.close();
			
			br.close();
			boolean succeful=tempfile.renameTo(fr);
		}
		void deleterec(String str) throws IOException{
			File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
			File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

			String line;
			String current;
			System.out.println("\n=>"+str);
			while((current=br.readLine())!=null){
				if (!current.substring(8, 14).equalsIgnoreCase(str)){
					writer.write(current);
					writer.newLine();
					//writer.write("\n");
				}
			}
			writer.close();
			
			br.close();
			fr.delete();
			tempfile.renameTo(fr);
			//System.out.println(succeful);
		}
	 }

	class tushar6{
		 String books,author; 
			String pages,price;
			 
			void read(int count) throws IOException{
				File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
				File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
				BufferedReader br=new BufferedReader(new FileReader(fr));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

				String line="";
				String current;
				int i=1;
				while(i<=count){
					line=br.readLine();
					String trimmedLine=line.trim();
					//if(trimmedLine.equals(author))continue;
					//writer.write(current+System.getProperty("|"));
					i++;
				}
				books=line.substring(0, 6);
				author=line.substring(8,14);
				pages=line.substring(16, 20);
				price=line.substring(22,line.length()-1);
				//writer.close();
				
				br.close();
			}
		
	}
	class tushar7{
		String books,author; 
		String pages,price;
		 
		void read(int count) throws IOException{
			File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));

			String line="";
			String current;
			int i=0;
			while(i<=count){
				line=br.readLine();
				String trimmedLine=line.trim();
				i++;
			}
			books=line.substring(0, 6);
			author=line.substring(8,14);
			pages=line.substring(16, 20);
			price=line.substring(22,line.length()-1);
			//writer.close();
			
			br.close();
		
	}
	}
	class tushar8{
		 String books,author; 
			String page,price;
			 
			void read(String ss) throws IOException{
				FileReader fr=new FileReader("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
				BufferedReader br=new BufferedReader(fr);
				
				
				
				String line;
				
				while((line=br.readLine())!=null){
					
					books=line.substring(8, 14);
					author=line.substring(0,6);
					
					page=line.substring(16, 20);
					price=line.substring(22,line.length()-1);
					
					System.out.println(">>"+ss+">>"+author);
					if(ss.equals(author)){
						
						System.out.println(">"+books);
						System.out.println(">"+author);
						System.out.println(">"+price);
						System.out.println(">"+page);
						return;
					}
					
				}
				
			    
				
				br.close();
			}
	}

 class abc{

	public static void main(String[] args)throws IOException {
	tushar1 f=new tushar1();
		f.read();
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new myframe();
			}
		});
		
	}

 }
 
	
