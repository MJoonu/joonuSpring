package joonu.spring.board.controller;

import joonu.spring.board.service.ReadArticleService;
import joonu.spring.board.vo.ArticleNotFoundException;
import joonu.spring.board.vo.ArticleVO;
import joonu.spring.member.service.MemberService;
import joonu.spring.member.vo.UpdateInfo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFour {
    public static void main(String[] args) {
        String[] configLocations = new String[]{"applicationContextFour.xml"};
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
        ReadArticleService readArticleService = context.getBean("readArticleService", ReadArticleService.class);

        try {
            ArticleVO article1 = readArticleService.getArticleAndIncreaseReadCount(1);
            ArticleVO article2 = readArticleService.getArticleAndIncreaseReadCount(1);
            System.out.println("article1 == article2 = " + (article1 == article2));
            readArticleService.getArticleAndIncreaseReadCount(0);
        } catch (ArticleNotFoundException e) {}
        MemberService memberService = context.getBean("memberService", MemberService.class);
        memberService.update("문준우", new UpdateInfo());
        context.close();
    }
}
