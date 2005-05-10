/*
 * Created on 29-Aug-2004
 * 
 * (c) 2003-2004 ThoughtWorks Ltd
 *
 * See license.txt for license details
 */
package com.thoughtworks.jbehave.story;

import com.thoughtworks.jbehave.core.behaviour.BehaviourClassContainer;
import com.thoughtworks.jbehave.story.codegen.parser.SimpleStoryParserBehaviour;
import com.thoughtworks.jbehave.story.codegen.parser.StoryTreeWalkerBehaviour;
import com.thoughtworks.jbehave.story.codegen.parser.TextStoryParserBehaviour;
import com.thoughtworks.jbehave.story.domain.GivenScenarioBehaviour;
import com.thoughtworks.jbehave.story.domain.NarrativeBehaviour;
import com.thoughtworks.jbehave.story.domain.OutcomeBehaviour;
import com.thoughtworks.jbehave.story.domain.ScenarioUsingMiniMockBehaviour;
import com.thoughtworks.jbehave.story.domain.StoryBehaviour;
import com.thoughtworks.jbehave.story.invoker.VisitingScenarioInvokerBehaviour;
import com.thoughtworks.jbehave.story.listener.PlainTextScenarioListenerBehaviour;
import com.thoughtworks.jbehave.story.renderer.PlainTextRendererBehaviour;
import com.thoughtworks.jbehave.story.verifier.StoryVerifierBehaviour;
import com.thoughtworks.jbehave.story.verifier.VisitingScenarioVerifierBehaviour;
import com.thoughtworks.jbehave.story.visitor.VisitableArrayListBehaviour;

/**
 * @author <a href="mailto:dan.north@thoughtworks.com">Dan North</a>
 */
public class AllBehaviourClasses extends Object implements BehaviourClassContainer {
    public Class[] getBehaviourClasses() {
        return new Class[] {
                SimpleStoryParserBehaviour.class,
                StoryTreeWalkerBehaviour.class, // TODO remove me
                TextStoryParserBehaviour.class,
				GivenScenarioBehaviour.class,
                NarrativeBehaviour.class,
                OutcomeBehaviour.class,
                ScenarioUsingMiniMockBehaviour.class,
                StoryBehaviour.class,
                VisitingScenarioInvokerBehaviour.class,
                PlainTextScenarioListenerBehaviour.class,
				PlainTextRendererBehaviour.class, // TODO remove me
                StoryVerifierBehaviour.class,
                VisitableArrayListBehaviour.class,
                VisitingScenarioVerifierBehaviour.class
        };
    }
}