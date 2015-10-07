package fun.n.games;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

public class Log4jv2Test {

	static final Logger logger = LogManager.getLogger(Log4jv2Test.class
			.getName());

	@Rule
	public ContiPerfRule i = new ContiPerfRule();

	@Test
	@PerfTest(invocations = 1000, threads = 20)
	public void test() {
		for (int i = 0; i < 10; i++)
			logger.error("Entering Log4j Example.");

		assertTrue(Boolean.TRUE);
	}

}
