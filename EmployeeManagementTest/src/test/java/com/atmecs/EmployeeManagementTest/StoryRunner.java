package com.atmecs.EmployeeManagementTest;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.Test;

public class StoryRunner extends JUnitStory {

	@Test
    public void run() throws Throwable 
	{
		 super.run();
		 configuration();
		 stepsFactory();
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Configuration configuration() 
	{
		return new MostUsefulConfiguration()
		// where to find the stories
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				// CONSOLE and TXT reporting
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(
										StoryReporterBuilder.Format.CONSOLE,
										StoryReporterBuilder.Format.TXT,
										StoryReporterBuilder.Format.HTML,
										StoryReporterBuilder.Format.XML));
	}

	@Override
	public InjectableStepsFactory stepsFactory()
	{
		return new InstanceStepsFactory(configuration(), new AddEmployeeTest(), new UpdateEmployeeTest(), new DeleteEmployeeTest(), new TransactionTest());
	}

}
