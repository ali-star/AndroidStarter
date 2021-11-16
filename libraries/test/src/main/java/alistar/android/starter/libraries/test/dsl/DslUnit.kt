package alistar.android.starter.libraries.test.dsl

import alistar.android.starter.libraries.test.BaseRobot
import java.util.concurrent.TimeUnit

/**
 * Use the method to run single unit test
 * @param robot - Set your test robot (should implement BaseRobot interface)
 * @param block - the block of code which needs to be executed in our test. Usually we need to place inside all steps for the test
 * @return - TestRun data class instance, which includes the test name and the robot instance
 */
fun <T: BaseRobot>RUN_UNIT_TEST(
    robot: T,
    block: TestRun<T>.() -> Unit
) : TestRun<T> {
    val startTime = System.nanoTime()

    println("*** UNIT TEST start ***")

    val testRun = TestRun(robot, true)
    block(testRun)

    val difference = System.nanoTime() - startTime

    println("*** time -> ${ TimeUnit.NANOSECONDS.toMillis(difference) } ms ***")
    println("-----------------------------------------------------------------------------------------------")

    return testRun
}
