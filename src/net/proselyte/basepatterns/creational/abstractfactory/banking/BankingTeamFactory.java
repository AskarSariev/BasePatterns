package net.proselyte.basepatterns.creational.abstractfactory.banking;

import net.proselyte.basepatterns.creational.abstractfactory.Developer;
import net.proselyte.basepatterns.creational.abstractfactory.ProjectManager;
import net.proselyte.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import net.proselyte.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory  {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
