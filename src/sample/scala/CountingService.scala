import javax.inject.Inject

import com.typesafe.config.Config

/**
 * A simple service that can increment a number. Also demonstrated is injecting a Typesafe config into
 * the service.
 */
class CountingService @Inject() (config: Config) {

  val incrementBy = config.getInt("count.increment-by")

  def increment(count: Int): Int = count + incrementBy

}
