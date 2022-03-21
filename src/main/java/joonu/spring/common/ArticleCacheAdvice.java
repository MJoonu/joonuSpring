package joonu.spring.common;

import joonu.spring.board.vo.ArticleVO;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

public class ArticleCacheAdvice {
    private Map<Integer, ArticleVO> cache = new HashMap<Integer, ArticleVO>();

    public ArticleVO cache(ProceedingJoinPoint joinPoint) throws Throwable{
        Integer id = (Integer) joinPoint.getArgs()[0];
        ArticleVO article = cache.get(id);

        if (article != null) {
            System.out.println("taken Article ["+id+"]in [ACA] cache");
        }
        ArticleVO ret = (ArticleVO) joinPoint.proceed();
        if (ret != null) {
            cache.put(id, ret);
            System.out.println("add a Article["+id+"] cache to [ACA]");
        }
        return ret;
    }
}
