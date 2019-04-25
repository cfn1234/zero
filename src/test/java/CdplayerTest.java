import com.zero.CdPlayerConfig;
import com.zero.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <br>
 * 〈功能详细描述〉
 * PACKAGE_NAME
 *
 * @author 17112411 2018/11/27 20:42
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdplayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdNotNULL() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }
}
