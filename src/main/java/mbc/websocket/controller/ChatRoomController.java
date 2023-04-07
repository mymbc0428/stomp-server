package mbc.websocket.controller;

import lombok.RequiredArgsConstructor;
import mbc.websocket.dto.ChatRoom;
import mbc.websocket.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatRoomController {

    private final ChatService chatService;

    @GetMapping("/rooms")
    public List<ChatRoom> room(){
        return chatService.findAllRoom();
    }

    @PostMapping("/room")
    public ChatRoom createRoom(@RequestParam String name){
        return chatService.creatrRoom(name);
    }

    @GetMapping("/room/{roomId}")
    public ChatRoom roomInfo(@PathVariable String roomId){
        return chatService.findById(roomId);
    }
}
