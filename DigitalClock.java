import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;
    
    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 30));
        add(timeLabel);
        
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        
        setVisible(true);
    }
    
    private void updateTime() {
        timeLabel.setText(timeFormat.format(new Date()));
    }
    
    public static void main(String[] args) {
        new DigitalClock();
    }
}
