package net.proselyte.basepatterns.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}
