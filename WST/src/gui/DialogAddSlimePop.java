package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class  DialogAddSlimePop extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6542587319791401131L;
	JButton buttonYes;
	JButton buttonNo;
	JTextField textFieldVolume;
	JTextField textFieldPowerlevel;
	JLabel labelVolume;
	JLabel labelPowerlevel;
	String Volume;
	String powerLevel;
	private DataAddSlime localDataAddSlime;
	
	
	
	public DialogAddSlimePop()
	{
		this.setTitle("Add Slime");
		Container content = this.getContentPane();
		GridLayout layout = new GridLayout(3,2);
		content.setLayout(layout);
		buttonYes=new JButton("Yes");
		buttonNo=new JButton("No");
		labelVolume=new JLabel("Volume");
		labelPowerlevel=new JLabel("Power Level");
		textFieldVolume=new JTextField();
		textFieldPowerlevel=new JTextField();

		this.add(labelVolume);
		this.add(textFieldVolume);
		
		this.add(labelPowerlevel);
		this.add(textFieldPowerlevel);
		
		this.add(buttonYes);
		this.add(buttonNo);

		buttonYes.addActionListener(this);
		buttonNo.addActionListener(this);

		setSize(200,200);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if  (e.getActionCommand()=="Yes")
		{

			Volume=this.textFieldVolume.getText();
			powerLevel=this.textFieldPowerlevel.getText();
			localDataAddSlime.volume=Volume;
			localDataAddSlime.powerLevel=powerLevel;
			this.setVisible(false);
			dispose();
		}
		else if (e.getActionCommand()=="No")
		{
			this.setVisible(false);
			this.setModal(false);
			dispose();
		}
		
		
	}
	
	public void setDataAddSlime(DataAddSlime dataAddSlime, Point point)
	{
		localDataAddSlime=dataAddSlime;
		localDataAddSlime.row =Integer.toString((int)point.getY());
		localDataAddSlime.col =Integer.toString((int)point.getX());
		return;
	}
	

	
	
}
