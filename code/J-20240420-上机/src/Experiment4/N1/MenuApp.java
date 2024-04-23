package Experiment4.N1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuApp extends JFrame {
    private JTextArea textArea;
    private JCheckBoxMenuItem readOnlyCheckBox;

    public MenuApp() {
        setTitle("菜单示例");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 创建文本区
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // 创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // 创建"设置"菜单
        JMenu settingsMenu = new JMenu("设置");
        menuBar.add(settingsMenu);

        // 创建"字体"菜单
        JMenu fontMenu = new JMenu("字体");
        settingsMenu.add(fontMenu);
        JRadioButtonMenuItem songItem = new JRadioButtonMenuItem("宋体");
        JRadioButtonMenuItem kaiItem = new JRadioButtonMenuItem("楷体");
        JRadioButtonMenuItem heiItem = new JRadioButtonMenuItem("黑体");
        fontMenu.add(songItem);
        fontMenu.add(kaiItem);
        fontMenu.add(heiItem);

        // 创建"风格"菜单
        JMenu styleMenu = new JMenu("风格");
        settingsMenu.add(styleMenu);
        JCheckBoxMenuItem normalItem = new JCheckBoxMenuItem("普通");
        JCheckBoxMenuItem boldItem = new JCheckBoxMenuItem("粗体");
        JCheckBoxMenuItem italicItem = new JCheckBoxMenuItem("斜体");
        styleMenu.add(normalItem);
        styleMenu.add(boldItem);
        styleMenu.add(italicItem);

        // 创建"只读"复选菜单项
        readOnlyCheckBox = new JCheckBoxMenuItem("只读");
        settingsMenu.add(readOnlyCheckBox);

        // 创建"操作"菜单
        JMenu operationMenu = new JMenu("操作");
        menuBar.add(operationMenu);
        JMenuItem exitItem = new JMenuItem("退出");
        operationMenu.add(exitItem);

        // 设置文本区的只读属性
        readOnlyCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setEditable(!readOnlyCheckBox.isSelected());
            }
        });

        // 为退出菜单项添加事件处理
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // 设置默认值
        songItem.setSelected(true);
        normalItem.setSelected(true);
        readOnlyCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuApp().setVisible(true);
            }
        });
    }
}
