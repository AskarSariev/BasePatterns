package net.proselyte.basepatterns.creational.abstractfactory.website;

import net.proselyte.basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project ...");
    }
}
