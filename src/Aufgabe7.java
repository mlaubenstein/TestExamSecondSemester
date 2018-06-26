import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Aufgabe7 extends Frame {
    TextField textfield;
    Button button;
    Label label;
        public Aufgabe7() {


            setLayout(new GridLayout(2,3));
            add(new Label("Zahl:"));

            textfield = new TextField();
            add(textfield);

            button = new Button("Komm!");
            add(button);
            button.addMouseListener ( new MouseListener () {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    String s = " Mach! ";
                    label.setText (s);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    String s = " Komm! ";
                    label.setText(s);
                }
            } );

            add(new Label("Quadrat:"));
            label = new Label();
            add(label);

        }
}
