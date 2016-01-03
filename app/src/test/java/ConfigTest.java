import android.content.Context;
import android.test.mock.MockContext;
import com.iemc.mobile.app.sing.sing.Util;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import android.util.Log;

/**
 * Created by eduardocerqueira on 12/30/15.
 */

public class ConfigTest {

    Util util = new Util();
    Context context;

    @Before
    public void setUp() {
        System.out.print("setup");
        context = new MockContext();
        assertNotNull(context);
    }

    @Test
    public void save() {
        String data =  "saving";
        util.saveConfig(data, context);
        //TODO: finish code to save and read file on internal storage
    }

    @Test
    public void read() {
        assert(true);
    }
}