package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DupEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private long eventTime;


  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("eventType", eventType)
            .append("eventTime", eventTime)
            .toString();
  }
}
