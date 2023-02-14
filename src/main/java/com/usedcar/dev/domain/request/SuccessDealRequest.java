package com.usedcar.dev.domain.request;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class SuccessDealRequest {
    private Integer id;
    private Integer buyerId;
}
