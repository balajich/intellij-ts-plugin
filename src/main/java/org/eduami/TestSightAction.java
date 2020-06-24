package org.eduami;


import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestSightAction extends AnAction {

    @Override
    public void update(AnActionEvent e) {
        // Using the event, evaluate the context, and enable or disable the action.
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        // Using the event, implement an action. For example, create and show a dialog.
//        @Nullable String name = Messages.showInputDialog("Enter your name", "MyIdeaDemo Data", Messages.getQuestionIcon());
//        Messages.showMessageDialog("Hello World: "+name,"MyIdea Title",Messages.getInformationIcon());
        new SampleDialogWrapper().showAndGet();

    }

}