import com.itheima.domain.*;
import com.itheima.mapper.TabMapper;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybaits {
    InputStream is=null;
    SqlSessionFactoryBuilder builder=null;
    SqlSessionFactory build=null;
    SqlSession sqlSession=null;
    TabMapper mapper=null;
    @Before
    public void open() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        build = builder.build(is);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(TabMapper.class);
    }

    @Test
    public void findbyVoo() {
        TabInfo tabInfoByCid = mapper.findTabInfoByCid(5);
        System.out.println(tabInfoByCid);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }
}
