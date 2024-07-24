import javax.swing.*;
import java.awt.event.*;

public class MenuToolbarExample extends JFrame {
    public MenuToolbarExample() {
        setTitle("Menu and Toolbar Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Create a toolbar
        JToolBar toolBar = new JToolBar();
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add buttons to toolbar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Add toolbar to the frame
        add(toolBar, "North");

        // Add action listeners
        newItem.addActionListener(e -> System.out.println("New menu item clicked"));
        openItem.addActionListener(e -> System.out.println("Open menu item clicked"));
        exitItem.addActionListener(e -> System.exit(0));

        newButton.addActionListener(e -> System.out.println("New button clicked"));
        openButton.addActionListener(e -> System.out.println("Open button clicked"));
        saveButton.addActionListener(e -> System.out.println("Save button clicked"));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuToolbarExample::new);
    }
}
