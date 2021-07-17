package net.proselyte.basepatterns.behavioral.visitor;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

public interface ProjectElement {
    public void beWritten(Developer developer);
}
