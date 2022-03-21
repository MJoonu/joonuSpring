package joonu.spring.board.service;

import joonu.spring.board.dao.ArticleDAO;
import joonu.spring.board.vo.ArticleVO;

public class WriteArticleServiceImpl implements WriteArticleService{

    private ArticleDAO articleDAO;

    public WriteArticleServiceImpl() {}

    public WriteArticleServiceImpl(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    @Override
    public void write(ArticleVO article) {
        System.out.println("WriteArticleServiceImpl.write() ------- start");
        articleDAO.insert(article);
    }
}
