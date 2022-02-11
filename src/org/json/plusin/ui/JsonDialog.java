package org.json.plusin.ui;

import com.intellij.openapi.project.Project;
import org.json.plusin.utils.GenerateUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JsonDialog extends JFrame  {

	private JTextPane editTP;
	private JButton createBtn;
	private Project project;
	private JPanel contentPane2;
	private JPanel generateClassP;

	public JsonDialog(  Project project) throws HeadlessException{
		this.project = project;
		setContentPane(contentPane2);
		setTitle("makeJson");
		getRootPane().setDefaultButton(createBtn);
		this.setAlwaysOnTop(false);
		initListener();
	}

	private void initListener(){
		createBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				String json = editTP.getText();
				String format = GenerateUtil.translate(json);
				editTP.setText(format);
			}
		});

	}

	public void setProject(Project mProject) {
		this.project = mProject;
	}

}
