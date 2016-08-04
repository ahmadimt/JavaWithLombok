import com.imti.JavaLombokApplication;
import com.imti.persistence.entity.TestEntity;
import com.imti.persistence.repo.TestEntityRepo;
import com.imti.service.base.TestService;
import com.imti.service.impl.TestServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static junit.framework.TestCase.assertNull;

/**
 * Created by imteyaza on 17/7/16.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringApplicationConfiguration(classes = JavaLombokApplication.class)
public class EntityServiceTest {

    @Mock
    private TestEntityRepo testEntityRepo;

    @Mock
    private TestService testService;

    @Before
    public void setup() {
        testService = new TestServiceImpl(testEntityRepo);
    }

    @Test
    public void getAll() {
        TestEntity testEntity = testService.getTestByName("imti");
        assertNull(testEntity);
    }

}
