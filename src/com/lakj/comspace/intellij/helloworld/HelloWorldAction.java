package com.lakj.comspace.intellij.helloworld;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by Lak J Comspace on 12/20/2014.
 */
public class HelloWorldAction extends AnAction {

    /**
     * Implement this method to provide your action handler.
     *
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "Hello, Welcom to IntellJ IDEA plugin development.", "Welcome",
                Messages.getInformationIcon());
    }
}
