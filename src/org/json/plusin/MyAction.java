package org.json.plusin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import org.json.plusin.ui.JsonDialog;

/**
 * @Description:
 * @Author: LEWIS
 * @Date: 2022/1/15 15:30
 * @packageName:PACKAGE_NAME
 * @projectName:myFirstPlus
 */
public class MyAction extends AnAction {

	@Override
	public void actionPerformed(AnActionEvent e){
		Project project = e.getData(PlatformDataKeys.PROJECT);
		JsonDialog jsonD = new JsonDialog(project);
		jsonD.setTitle("create json");
		jsonD.setProject(project);
		jsonD.setSize(600, 400);
		jsonD.setLocationRelativeTo(null);
		jsonD.setVisible(true);
	}

}