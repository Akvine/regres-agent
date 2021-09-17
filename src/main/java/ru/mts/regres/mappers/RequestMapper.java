package ru.mts.regres.mappers;

import ru.mts.regres.domain.dto.RequestDto;
import ru.mts.regres.domain.entities.Request;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RequestMapper {
    public RequestDto mapToRequestDto(Request request) {
        RequestDto requestDto = new RequestDto();

        requestDto.setName(request.getName());
        requestDto.setClaimId(request.getClaimId());
        requestDto.setProcessingStatusMTS(request.getProcessingStatusMTS());

        return requestDto;
    }
}
