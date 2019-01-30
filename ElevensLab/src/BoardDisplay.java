import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class BoardDisplay extends JFrame {
	
	/**
	 * Don't know what this if for.
	 */
	private static final long serialVersionUID = 1L;

	ElevensBoard board = new ElevensBoard();
	
	private JPanel contentPane;
	private JTextField txtCardsLeft;
	private JTextField txtSelectCards;
	private JTextField txtCurrentSelection;
	
	JButton[] buttons = new JButton[9];
	private JTextField txtMadeByLuis;

	/**
	 * Create the frame and play the game :).
	 */
	public BoardDisplay() {
		
		setTitle("                                                                                                                           Elevens");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 51));
		panel.setBounds(10, 23, 832, 263);
		contentPane.add(panel);
		
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton(board.cardAt(0).toString());
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				board.selectedCards.add(0);
				btnNewButton.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		btnNewButton.setBounds(32, 36, 64, 84);
		panel.add(btnNewButton);
		
		JButton button = new JButton(board.cardAt(1).toString());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(1);
				button.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(106, 36, 64, 84);
		panel.add(button);
		
		JButton button_1 = new JButton(board.cardAt(2).toString());
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(2);
				button_1.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBounds(185, 36, 64, 84);
		panel.add(button_1);
		
		JButton button_2 = new JButton(board.cardAt(3).toString());
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(3);
				button_2.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_2.setBounds(261, 36, 64, 84);
		panel.add(button_2);
		
		JButton button_3 = new JButton(board.cardAt(4).toString());
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(4);
				button_3.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_3.setBounds(335, 36, 64, 84);
		panel.add(button_3);
		
		JButton button_4 = new JButton(board.cardAt(5).toString());
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(5);
				button_4.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_4.setBounds(408, 36, 64, 84);
		panel.add(button_4);
		
		JButton button_5 = new JButton(board.cardAt(6).toString());
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(6);
				button_5.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_5.setBounds(482, 36, 64, 84);
		panel.add(button_5);
		
		JButton button_6 = new JButton(board.cardAt(7).toString());
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(7);
				button_6.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_6.setBounds(556, 36, 64, 84);
		panel.add(button_6);
		
		JButton button_7 = new JButton(board.cardAt(8).toString());
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				board.selectedCards.add(8);
				button_7.setBackground(Color.YELLOW);
				txtCurrentSelection.setText("Current Selection: " + board.displaySelectedCards());
				game();
				
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_7.setBounds(630, 36, 64, 84);
		panel.add(button_7);
		
		txtCardsLeft = new JTextField();
		txtCardsLeft.setForeground(Color.BLACK);
		txtCardsLeft.setBackground(Color.WHITE);
		txtCardsLeft.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtCardsLeft.setText("Cards Left:" + board.deckSize());
		txtCardsLeft.setBounds(714, 36, 108, 84);
		panel.add(txtCardsLeft);
		txtCardsLeft.setColumns(10);
		txtCardsLeft.setEditable(false);
		
		txtSelectCards = new JTextField();
		txtSelectCards.setForeground(Color.BLACK);
		txtSelectCards.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtSelectCards.setText("Select Cards");
		txtSelectCards.setBounds(32, 131, 116, 30);
		txtSelectCards.setBackground(Color.WHITE);
		panel.add(txtSelectCards);
		txtSelectCards.setColumns(10);
		txtSelectCards.setEditable(false);
		
		txtCurrentSelection = new JTextField();
		txtCurrentSelection.setBackground(Color.WHITE);
		txtCurrentSelection.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtCurrentSelection.setText("Current Selection: ");
		txtCurrentSelection.setBounds(247, 131, 361, 31);
		panel.add(txtCurrentSelection);
		txtCurrentSelection.setColumns(10);
		txtCurrentSelection.setEditable(false);
		
		buttons[0] = btnNewButton;
		buttons[1] = button;
		buttons[2] = button_1;
		buttons[3] = button_2;
		buttons[4] = button_3;			// This makes it easier to edit the buttons with cards.
		buttons[5] = button_4;
		buttons[6] = button_5;
		buttons[7] = button_6;
		buttons[8] = button_7;
		
		JButton btnNewButton_1 = new JButton("New Game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int x = 0; x < board.selectedCards.size(); x++) {
					
					buttons[board.selectedCards.get(x)].setBackground(UIManager.getColor("Button.background"));
					
					}
				
				board.selectedCards.clear();
				txtCurrentSelection.setText("Current Selection: ");
				board.newGame();
				
				txtCardsLeft.setText("Cards Left:" + board.deckSize());
				
				for(int x = 0; x < 9; x++) {
					
					buttons[x].setText(board.cardAt(x).toString());
					
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton_1.setBounds(356, 173, 138, 68);
		panel.add(btnNewButton_1);
		
		txtMadeByLuis = new JTextField();
		txtMadeByLuis.setFont(new Font("Times New Roman", Font.PLAIN, 66));
		txtMadeByLuis.setText("Made by Luis Hernandez :)");
		txtMadeByLuis.setBounds(58, 318, 729, 170);
		contentPane.add(txtMadeByLuis);
		txtMadeByLuis.setColumns(10);
		
	}
	
	
	/**
	 *  game logic + functionality with board 
	 */
	
	public void game() {
		

		if(board.isLegal(board.selectedCards)) {
			
			if(board.containsPairSum11(board.selectedCards)) {
				
				board.replaceSelectedCards(board.selectedCards);
				
				for(int x = 0; x < board.selectedCards.size(); x++) {
					
					if(board.cardAt(board.selectedCards.get(x)) == null){
						
						buttons[board.selectedCards.get(x)].setVisible(false);									
						
						} else {
							buttons[board.selectedCards.get(x)].setText(board.cardAt(board.selectedCards.get(x)).toString());
							buttons[board.selectedCards.get(x)].setBackground(UIManager.getColor("Button.background"));
							}
					
					
					
					}
	
				board.selectedCards.clear();
				txtCurrentSelection.setText("Sum is 11!");
				txtCardsLeft.setText("Cards Left:" + board.deckSize());
				
			}
		
			if(board.containsJQK(board.selectedCards)) {
			
				board.replaceSelectedCards(board.selectedCards);
				
				for(int x = 0; x < board.selectedCards.size(); x++) {
					
					if(board.cardAt(board.selectedCards.get(x)) == null){
						
						buttons[board.selectedCards.get(x)].setVisible(false);
						
						} else {
							buttons[board.selectedCards.get(x)].setText(board.cardAt(board.selectedCards.get(x)).toString());
							buttons[board.selectedCards.get(x)].setBackground(UIManager.getColor("Button.background"));
							}
					
					}
				
				board.selectedCards.clear();
				txtCurrentSelection.setText("Contained JQK!");
				txtCardsLeft.setText("Cards Left:" + board.deckSize());
			
				} 
		
		}
		
			if(!board.isLegal(board.selectedCards)) {
			
				for(int x = 0; x < board.selectedCards.size(); x++) {
					
					buttons[board.selectedCards.get(x)].setBackground(UIManager.getColor("Button.background"));
					
					}
				
			board.selectedCards.clear();
			
			txtCurrentSelection.setText("No possible pairs or JQK.");
			
			}
			
			if(board.isEmpty()) {
				
				txtCurrentSelection.setText("You win!");
				
			}
			
			if(board.deckSize() > 0) {if(!board.anotherPlayIsPossible()) {
				
				txtCurrentSelection.setText("Game over! You had " + board.deckSize() + " cards left.");
				
			}}
			
		}
		
}
