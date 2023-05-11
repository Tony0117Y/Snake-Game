import javax.swing.JFrame;

public class GameFrame extends JFrame{
	GameFrame(){
		
		this.add(new GamePanel()); //instead of doing GamePanel panel = new Gamepanel
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);//sets the game to the middle of the screen
		
	}
	

}
