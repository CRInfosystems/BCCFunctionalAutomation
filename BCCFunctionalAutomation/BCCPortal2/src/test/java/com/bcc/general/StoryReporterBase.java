package com.bcc.general;

import java.util.List;
import java.util.Map;

import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.GivenStories;
import org.jbehave.core.model.Lifecycle;
import org.jbehave.core.model.Meta;
import org.jbehave.core.model.Narrative;
import org.jbehave.core.model.OutcomesTable;
import org.jbehave.core.model.Scenario;
import org.jbehave.core.model.Story;
import org.jbehave.core.model.StoryDuration;

public class StoryReporterBase implements
        org.jbehave.core.reporters.StoryReporter {

    @Override
    public void successful(String step) {
    }

    @Override
    public void failed(String step, Throwable cause) {
    }

    @Override
    public void storyNotAllowed(Story story, String filter) {
    }

    @Override
    public void beforeStory(Story story, boolean givenStory) {
        
        String storyName = story.getName().replace("_", " ");
        StoryBase.setCurrentScenarioName(storyName);

    }

    @Override
    public void afterStory(boolean givenStory) {
    }

    @Override
    public void scenarioNotAllowed(Scenario scenario, String filter) {
    }

    @Override
    public void beforeScenario(String scenarioTitle) {
        
    }

    @Override
    public void scenarioMeta(Meta meta) {
    }

    @Override
    public void afterScenario() {
    }

    @Override
    public void givenStories(GivenStories givenStories) {
    }

    @Override
    public void givenStories(List<String> storyPaths) {
    }

    @Override
    public void beforeExamples(List<String> steps, ExamplesTable table) {
    }

    @Override
    public void example(Map<String, String> tableRow) {
    }

    @Override
    public void afterExamples() {
    }

    @Override
    public void ignorable(String step) {
    }

    @Override
    public void pending(String step) {
    }

    @Override
    public void notPerformed(String step) {
    }

    @Override
    public void failedOutcomes(String step, OutcomesTable table) {
    }

    @Override
    public void dryRun() {
    }

    @Override
    public void beforeStep(String arg0) {

        String stepName = arg0;
        if (stepName.contains("<") ){
            stepName = stepName.replace("<", "(");
        }
        
        if (stepName.contains(">")){
            stepName = stepName.replace(">", ")");
        }
        
        if (stepName.contains("/")){
            stepName = stepName.replace("/", "-");
        }
        
        StoryBase.setCurrentStepName(stepName);
    }

    @Override
    public void lifecyle(Lifecycle arg0) {
    }

    @Override
    public void narrative(Narrative arg0) {
    }

    @Override
    public void pendingMethods(List<String> arg0) {
    }

    @Override
    public void restarted(String arg0, Throwable arg1) {
    }

    @Override
    public void storyCancelled(Story arg0, StoryDuration arg1) {
    }

}