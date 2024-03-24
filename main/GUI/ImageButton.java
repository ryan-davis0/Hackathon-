package main.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageButton extends JButton {
    private BufferedImage backgroundImage;
    public ICardChangeListener cardListener;

    public ImageButton() {
        super();
        backgroundImage = null;
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        cardListener = card -> setImg(card != null? card.imgPath: null);
    }

    @Override protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    private void setImg(String path) {
        try {
            backgroundImage = path != null? ImageIO.read(new File(path)) : null;
            repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}