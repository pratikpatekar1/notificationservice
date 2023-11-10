package com.localservicesreview.notificationservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequestDto {
    @JsonIgnore
    private String service_id;
    private String data;
    @JsonIgnore
    private String image_url;
    private String channel;
    private String type;
    private String subject;
}
