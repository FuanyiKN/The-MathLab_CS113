// imports

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.io.File;

public class PolygonType {
    // members
    private int numSides; // number of sides in the polygon
    
    // default constructor
    public PolygonType() {
        numSides = 0; // default number of sides
    }
    public PolygonType(int num) {
        numSides = num; // preset number of sides
    }
    //setters
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }
    // method for getting numbers to image

    public void getNumToImage() {

        if (numSides == 3) {
            System.out.println("This is a triangle");
            JFrame frame = new JFrame("This is a triangle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());
            // the paths
            // src\PolygonPics\Screenshot 2024-12-03 194149.png
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-03 194149.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);

        } else if (numSides == 4) {
            System.out.println("This is a square");
            // src\PolygonPics\Screenshot 2024-12-03 194206.png
            JFrame frame = new JFrame("This is a square");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-03 194206.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        } else if (numSides == 5) {
            System.out.println("");
            // src\PolygonPics\Screenshot 2024-12-03 194215.png
            JFrame frame = new JFrame("This is a pentagon");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-03 194215.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        } else if (numSides == 6) {
            System.out.println("This is a hexagon");
            // src\PolygonPics\Screenshot 2024-12-03 194225.png
            JFrame frame = new JFrame("This is a hexagon");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-03 194225.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        } else if (numSides == 8) {
            System.out.println("This is a octagon");
            // src\PolygonPics\Screenshot 2024-12-03 194232.png
            JFrame frame = new JFrame("This is a octagon");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-03 194232.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        } else {
            System.out.println("Oh no we've never seen this before...");
            // src\PolygonPics\Screenshot 2024-12-09 150513.png
            JFrame frame = new JFrame("Oh no we've never seen this before...");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1020, 1080);
            frame.setLayout(new BorderLayout());
            // Load an image file
            String imagePath = "src\\PolygonPics\\Screenshot 2024-12-09 150513.png"; // Change this to your image file
                                                                                     // path
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Image file not found: " + imagePath);

            }

            // Create an ImageIcon from the image file
            ImageIcon imageIcon = new ImageIcon(imagePath);

            // Add the image to a JLabel
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the label to the frame
            frame.add(imageLabel, BorderLayout.CENTER);

            // Make the frame visible
            frame.setVisible(true);
        }

    }

}
