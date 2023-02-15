package com.usedcar.dev.repository;

import com.usedcar.dev.domain.dto.ActionList;
import com.usedcar.dev.domain.request.PutCarOnAuctionRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuctionRepository {
    Integer putCarOnAuction (PutCarOnAuctionRequest request);
    List<ActionList> findAllAuction();
}
