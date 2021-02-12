package kg.geektech.android3.lesson_6;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import kg.geektech.android3.lesson_6.domain.UriHelper;

import static org.junit.Assert.assertEquals;

public class UriHelperTest {
    private UriHelper helper;

    @Before
    public void setUp() {
        Context mockContext = Mockito.mock(Context.class);
        Mockito.when(mockContext.getString(R.string.url)).thenReturn("URL");
        Mockito.when(mockContext.getString(R.string.path)).thenReturn("PATH");
        Mockito.when(mockContext.getString(R.string.unknown)).thenReturn("UNKNOWN");
        helper = new UriHelper(mockContext);
    }

    @Test
    public void validateTest() {
        String file = helper.validate("file:///tmp/android.txt");
        String url = helper.validate("http://docs.google.com/");
        assertEquals("PATH", file); //PATH
        assertEquals("URL", url); //URL
    }

    @After
    public void clear() {
    }

}
