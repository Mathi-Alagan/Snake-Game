import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setTitle("Snake Game");
        this.setVisible(true);

        /*
         * Sets the location of the window relative to the specified component.
         * If the component is not currently showing, or c (the Component) is null, the
         * window is centered on the screen.
         */
        this.setLocationRelativeTo(null);
    }
}
