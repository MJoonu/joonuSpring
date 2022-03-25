package joonu.spring.web.controller;

import joonu.spring.web.board.*;
import joonu.spring.web.board.impl.GetBoardController;
import joonu.spring.web.user.LoginController;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
    private Map<String, Controller> mappings;

    public HandlerMapping() {
        mappings = new HashMap<>();
        mappings.put("/login.do", new LoginController());
        mappings.put("/getBoardList.do", new GetBoardListController());
        mappings.put("/getBoard.do", new GetBoardController());
        mappings.put("/insertBoard.do", new InsertBoardController());
        mappings.put("/updateBoard.do", new UpdateBoardController());
        mappings.put("/deleteBoard.do", new DeleteBoardController());
        mappings.put("/logout.do", new LogoutController());
        // 추후 이부분에 명령어 (Path) 와 Controller 객체가 추가됨.
    }

    public Controller getController(String path) {
        return mappings.get(path);
    }
}
