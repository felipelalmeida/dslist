package com.devsuperior.dslist.dto;

import java.util.Objects;

public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    public ReplacementDTO() {}

    public ReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ReplacementDTO that)) return false;
        return Objects.equals(getSourceIndex(), that.getSourceIndex()) && Objects.equals(getDestinationIndex(), that.getDestinationIndex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSourceIndex(), getDestinationIndex());
    }
}
