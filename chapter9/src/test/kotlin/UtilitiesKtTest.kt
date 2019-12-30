import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify

class UtilitiesKtTest {

  @Test
  fun test_formatGreeting() {
    val formattedName = formatGreeting("Kotlin")
    Assert.assertEquals("Hello Kotlin!", formattedName)
  }

  @Test
  fun `test the format Greeting function`() {
    val formattedName = formatGreeting("Kotlin")
    Assert.assertEquals("Hello Kotlin!", formattedName)
  }

  @Test
  fun `test greeting provider`() {
    val mockProvider = Mockito.mock(GreetingProvider::class.java)
    Mockito.`when`(mockProvider.getGreeting()).thenReturn("Hello")
    val formattedName = formatGreeting(mockProvider, "Rust")
    Assert.assertEquals("Hello Rust", formattedName)
  }

  @Test
  fun `test with mockito-kotlin`() {
    val mockGreeter = mock<SimpleGreeter> {
      on { getGreeting() } doReturn "Hey there!"
      on { getMessage() } doReturn  "You're great!"
    }

    Assert.assertEquals("Hey there!",mockGreeter.getGreeting() )
    Assert.assertEquals("Hey there!",mockGreeter.getGreeting() )

    verify(mockGreeter, times(2)).getGreeting()
  }
}
