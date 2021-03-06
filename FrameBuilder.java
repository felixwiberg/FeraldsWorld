import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;

public class FrameBuilder{
    // public void build(JFrame frame, JTextField inputPanel, JPanel textPanel, JTextPane t1, JTextPane t2, JTextPane t3){
        // textPanel.setBackground(Color.BLACK);
        // inputPanel.setBackground(Color.BLACK);
        // inputPanel.setForeground(Color.WHITE);

        // inputPanel.setFont(new Font("Courier New", Font.PLAIN, 14));

        // t1.setBackground(Color.BLACK);
        // t2.setBackground(Color.BLACK);
        // t3.setBackground(Color.BLACK);
        // textPanel.setLayout(new BorderLayout());
        // textPanel.add(t1, BorderLayout.WEST);
        // textPanel.add(t2, BorderLayout.EAST);
        // textPanel.add(t3, BorderLayout.SOUTH);

        // SimpleAttributeSet att_t1 = new SimpleAttributeSet();
        // StyleConstants.setAlignment(att_t1, StyleConstants.ALIGN_LEFT);
        // StyleConstants.setForeground(att_t1, Color.WHITE);
        // StyleConstants.setBackground(att_t1, Color.BLACK);
        // StyleConstants.setFontSize(att_t1, 14);
        // StyleConstants.setBold(att_t1, false);
        // StyleConstants.setFontFamily(att_t1, "Courier New");
        // t1.setEditable(false);
        // t1.setCharacterAttributes(att_t1, true);

        // GridBagConstraints c = new GridBagConstraints();
        // c.fill = GridBagConstraints.BOTH;
        // c.weightx = 1.0;
        // c.weighty = 0.95;
        // c.gridy = 0;
        // frame.add(textPanel, c);
        // c.weightx = 1.0;
        // c.weighty = 0.05;
        // c.gridy = 1;
        // frame.add(inputPanel, c);

    // }

    public void build(JPanel panel, JTextField inputPanel, JPanel textPanel, JTextPane t1, JTextPane t2, JTextPane t3){
        textPanel.setBackground(Color.BLACK);
        inputPanel.setBackground(Color.BLACK);
        inputPanel.setForeground(Color.WHITE);

        inputPanel.setFont(new Font("Courier New", Font.PLAIN, 14));

        t1.setBackground(Color.BLACK);
        t2.setBackground(Color.BLACK);
        t3.setBackground(Color.BLACK);
        textPanel.setLayout(new BorderLayout());
        textPanel.add(t1, BorderLayout.WEST);
        textPanel.add(t2, BorderLayout.EAST);
        textPanel.add(t3, BorderLayout.SOUTH);

        SimpleAttributeSet att_t1 = new SimpleAttributeSet();
        StyleConstants.setAlignment(att_t1, StyleConstants.ALIGN_LEFT);
        StyleConstants.setForeground(att_t1, Color.WHITE);
        StyleConstants.setBackground(att_t1, Color.BLACK);
        StyleConstants.setFontSize(att_t1, 14);
        StyleConstants.setBold(att_t1, false);
        StyleConstants.setFontFamily(att_t1, "Courier New");
        t1.setEditable(false);
        t1.setCharacterAttributes(att_t1, true);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.95;
        c.gridy = 0;
        panel.add(textPanel, c);
        c.weightx = 1.0;
        c.weighty = 0.05;
        c.gridy = 1;
        panel.add(inputPanel, c);

    }
}
