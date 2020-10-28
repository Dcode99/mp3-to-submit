package jenkins.model;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

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
