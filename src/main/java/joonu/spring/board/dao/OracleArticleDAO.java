package joonu.spring.board.dao;

import joonu.spring.board.vo.ArticleVO;

public class OracleArticleDAO implements ArticleDAO{
    @Override
    public void insert(ArticleVO article) {
        System.out.println("MyOracleArticleDAO.insert() -------- start");
    }

    @Override
    public void updateReadCount(int id) {
        System.out.println("MyOracleArticleDAO.updateReadCount() ----- start");
    }
}
