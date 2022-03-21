package joonu.spring.board.dao;

import joonu.spring.board.vo.ArticleVO;

public interface ArticleDAO {
    void insert(ArticleVO article);
    void updateReadCount(int id);
}
