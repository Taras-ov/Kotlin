import Fibonacci.take
import kotlinx.coroutines.*

fun main() {
    runBlocking {
       val job1 = async {
           try {
               withTimeout(3000) {
                   delay(3000)
                   launch {
                       println(take(5))
                   }
               }
           } catch (e: TimeoutCancellationException) {
               println("Превышено время вычисления")
           }
       }

        val job2 = async {
            try {
                withTimeout(3000) {
                    delay(1000)
                    launch {
                        println(take(21))
                    }
                }
            } catch (e: TimeoutCancellationException) {
                println("Превышено время вычисления")
            }
        }

        val job3 = async {
            try {
                withTimeout(3000) {
                    delay(1000)
                    launch {
                        println(take(45))
                    }
                }
            } catch (e: TimeoutCancellationException) {
                println("Превышено время вычисления")
            }
        }

        launch {
            while (job1.isActive || job2.isActive || job3.isActive) {
                delay(100)
                println("..")
            }
        }
    }
}