package fun.n.games;

import static org.junit.Assert.assertTrue;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.LogbackTest");

	@Rule
	public ContiPerfRule i = new ContiPerfRule();

	@Test
	@PerfTest(invocations = 1000, threads = 20)
	public void test() {

		for (int i = 0; i < 10; i++)
			logger.debug("Hello world {}.", i);

		assertTrue(Boolean.TRUE);
	}

}
