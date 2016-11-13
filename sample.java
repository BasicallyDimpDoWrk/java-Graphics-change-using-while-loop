import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class sample extends JApplet 
{
	
	private static Color Building=new Color(0, 122, 153);
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.getContentPane().add(new sample());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}

	public void paint(Graphics g)
	{
		try 
		{
	
		int j = 0;

			while (j < 800-(120+7)+(383-170)-85)
			{
				g.setColor(Color.darkGray);
				g.fillRect(0, 0, 5000, 5000);//Background//
				
				g.setColor(Color.gray);
				g.fillOval((800-(120+7))-j/4, 60, 60, 60);//MOON//
				
				g.setColor(Building);
				g.fillRect((600)-j/2,320,200,250);//Building//
				
				//Draw Here//
				
				//@BasicallyDimpDoWrk//
				
				j++;
				
				while(j >= 800-(120+7)+(383-170)-85)
				{
				
				j=800-(120+7)+(383-170)-85;
				
				g.setColor(Color.darkGray);
				g.fillRect(0, 0, 5000, 5000);//Background//
				
				//Change Drawing here//
				
				break;
				}
				Thread.sleep(5);
			}
		
		} 
	
		catch (InterruptedException e) 
		{
		}
	}
}
