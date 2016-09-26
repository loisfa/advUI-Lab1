import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



// SEND EMAIL TO eagan@telecom-paristech.fr avec le lien à son git repository 
// "eaganj" if private repos


public class Window extends JFrame {

	/// MENU
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("File");
	JMenu menuView = new JMenu("View");
	JMenuItem menuItemImport = new JMenuItem("Import");
	JMenuItem menuItemDelete = new JMenuItem("Delete");
	JMenuItem menuItemQuit = new JMenuItem("Quit");
	JMenuItem menuItemPhotoViewer = new JMenuItem("Photo viewer");
	JMenuItem menuItemBrowser = new JMenuItem("Browser");
	JMenuItem menuItemSplitMode = new JMenuItem("Split Mode");


	/// MAIN WINDOW
	JToolBar toolBar = new JToolBar("Category", JToolBar.VERTICAL);
	JToggleButton toogleButton1 = new JToggleButton("Family");
	JToggleButton toogleButton2 = new JToggleButton("Vacation");
	JToggleButton toogleButton3 = new JToggleButton("School");
	JLabel window = new JLabel("window", SwingConstants.CENTER);
	JLabel statusBar = new JLabel("window", SwingConstants.CENTER);


	/// CONSTRUCTOR	
	public Window() {
		
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		init();

		this.setJMenuBar(menuBar);	
		this.setLayout(new BorderLayout());
		this.getContentPane().add(window, BorderLayout.CENTER);
		this.getContentPane().add(statusBar, BorderLayout.SOUTH);
		this.getContentPane().add(toolBar, BorderLayout.WEST);
		this.setSize(800,500);
		this.setMinimumSize(new Dimension(400,600));
	}
	
	
	private void init() {

		//ImageIcon icon = new ImageIcon("src/img.jpg"); 
		//window.setIcon(icon);
		window.setText("WINDOW");
		window.setBackground(new Color(222,222,222));
		window.setOpaque(true);
	
		statusBar.setForeground(Color.RED);
		statusBar.setBackground(Color.WHITE);
		statusBar.setOpaque(true);
		statusBar.setText("statusbar");
		statusBar.setPreferredSize(new Dimension(200,50));
		
		toolBar.add(toogleButton1);
		toolBar.add(toogleButton2);
		toolBar.add(toogleButton3);
		
		menuFile.add(menuItemImport);
		menuFile.add(menuItemDelete);
		menuFile.add(menuItemQuit);

		menuView.add(menuItemPhotoViewer);
		menuView.add(menuItemBrowser);
		menuView.add(menuItemSplitMode);		

		menuBar.add(menuFile);
		menuBar.add(menuView);
		
	}
	
	
	private void addMenuListeners() {
		

		menuItemImport.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Browser");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
				JFileChooser fileChooser = new JFileChooser();
				int returnVal = fileChooser.showOpenDialog(frame);
			}
		}
				);

		menuItemDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("delete message");
				JOptionPane.showMessageDialog(frame,
						"Delete not implemented");
			}
		}
				);

		menuItemQuit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();    	
			}
		}
				);

		menuItemPhotoViewer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("photo message");
				JOptionPane.showMessageDialog(frame,
						"Photo viewer not implemented");
			}
		}
				);

		menuItemBrowser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("browser message");
				JOptionPane.showMessageDialog(frame,
						"Browser not implemented");
			}
		}
				);


		menuItemSplitMode.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("split mode message");
				JOptionPane.showMessageDialog(frame,
						"Split mode not implemented");
			}
		}
				);

		
	}

}
