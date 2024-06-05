package com.ll.chat_2024_06_03.domain.chat.chatMessage.service;


import com.ll.chat_2024_06_03.domain.chat.chatMessage.repository.ChatMessageRepository;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatMessage;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public List<ChatMessage> findByChatRoomAndIdAfter(long roomId, long afterId) {
        return chatMessageRepository.findByChatRoomIdAndIdAfter(roomId,afterId);
    }
}