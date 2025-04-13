package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import products.*;
import factories.*;

public class FurnitureApp extends JFrame {
    private JPanel displayPanel;
    private FurnitureFactory factory;

    public FurnitureApp() {
        setTitle("Mobilya Üretimi");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] styles = {"Modern", "Victorian", "ArtDeco"};
        JComboBox<String> styleBox = new JComboBox<>(styles);
        JButton generateButton = new JButton("Mobilya Oluştur");

        JPanel topPanel = new JPanel();
        topPanel.add(styleBox);
        topPanel.add(generateButton);
        add(topPanel, BorderLayout.NORTH);

        displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(1, 3));
        add(displayPanel, BorderLayout.CENTER);

        generateButton.addActionListener((ActionEvent e) -> {
            String selected = (String) styleBox.getSelectedItem();
            switch (selected) {
                case "Modern" -> factory = new ModernFurnitureFactory();
                case "Victorian" -> factory = new VictorianFurnitureFactory();
                case "ArtDeco" -> factory = new ArtDecoFurnitureFactory();
            }
            showFurniture();
        });
    }

    private void showFurniture() {
        displayPanel.removeAll();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable table = factory.createCoffeeTable();

        displayPanel.add(createImagePanel(chair.getImagePath(), chair));
        displayPanel.add(createImagePanel(sofa.getImagePath(), sofa));
        displayPanel.add(createImagePanel(table.getImagePath(), table));

        revalidate();
        repaint();
    }

    private JPanel createImagePanel(String path, Object furniture) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        panel.add(label, BorderLayout.CENTER);

        JButton cloneButton = new JButton("Kopyala");
        cloneButton.addActionListener(e -> {
            Object cloned = null;
            if (furniture instanceof Chair) cloned = ((Chair) furniture).clone();
            else if (furniture instanceof Sofa) cloned = ((Sofa) furniture).clone();
            else if (furniture instanceof CoffeeTable) cloned = ((CoffeeTable) furniture).clone();

            JOptionPane.showMessageDialog(this, "Klonlama Başarılı: " + cloned.getClass().getSimpleName());
        });

        panel.add(cloneButton, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FurnitureApp().setVisible(true));
    }
}
