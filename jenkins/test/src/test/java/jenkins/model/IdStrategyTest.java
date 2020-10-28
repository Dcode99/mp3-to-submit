package jenkins.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class IdStrategyTest {

	@Test
    public void caseSensitiveTest() {
        IdStrategy idStrategy = new IdStrategy.CaseSensitive();
        assertThat(idStrategy.idFromFilename("~1f"), is("1f"));
        assertThat(idStrategy.idFromFilename("~con"), is("Con"));
	}
	
	@Test
	public void caseInsensitive() {
		IdStrategy idStrategy = new IdStrategy.CaseInsensitive();
		
		assertThat(idStrategy.idFromFilename("foo"), is("foo"));
	}
}
