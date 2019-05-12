import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/4/23
 * Time:10:06
 * Introduction:
 */
@RunWith(Arquillian.class)
public class NumZeroTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(NumZero.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
