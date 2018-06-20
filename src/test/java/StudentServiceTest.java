import com.nenu.software.common.entity.Student;
import com.nenu.software.service.StudentService;
import com.nenu.software.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shanjz
 * @since 2018/6/20 10:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-mybatis.xml"})
public class StudentServiceTest {

//    @Autowired
//    StudentService studentService;

    @Test
    public void testNewStudent() throws Exception {
        StudentService studentService = new StudentServiceImpl();
        Student student = new Student();
        student.setStuName("aa");
        studentService.newStudent(student);
    }
}
