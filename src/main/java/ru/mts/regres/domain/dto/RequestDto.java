package ru.mts.regres.domain.dto;

public class RequestDto {
    private String name;

    private String claimId;

    private String processingStatusMTS;

    public RequestDto() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getProcessingStatusMTS() {
        return processingStatusMTS;
    }

    public void setProcessingStatusMTS(String processingStatusMTS) {
        this.processingStatusMTS = processingStatusMTS;
    }
}
