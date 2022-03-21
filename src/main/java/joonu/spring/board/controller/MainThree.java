package joonu.spring.board.controller;

import joonu.spring.board.service.WriteArticleService;
import joonu.spring.board.vo.ArticleVO;
import joonu.spring.board.vo.MemberVO;
import joonu.spring.member.service.MemberService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainThree {
    public static void main(String[] args) {

        String[] configLocations = new String[] { "applicationContextThree.xml" };
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
        WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
        articleService.write(new ArticleVO());
        MemberService memberService = context.getBean("memberService", MemberService.class);
        memberService.regist(new MemberVO());
        context.close();
    }
}
