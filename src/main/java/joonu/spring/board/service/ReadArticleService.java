package joonu.spring.board.service;

import joonu.spring.board.vo.ArticleNotFoundException;
import joonu.spring.board.vo.ArticleVO;

public interface ReadArticleService {
    ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException;
}
