import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.yield
import java.math.BigInteger

object Fibonacci {
    suspend fun take(number: Int): BigInteger {
        return withContext(Dispatchers.Default) {

            if (number == 1) return@withContext 0.toBigInteger()

            var i = 3
            var f1 = 0
            var f2 = 1

            while (i <= number) {
                yield()
                val sum = f1 + f2
                f1 = f2
                f2 = sum

                i++
            }
            return@withContext f2.toBigInteger()
        }
    }
}