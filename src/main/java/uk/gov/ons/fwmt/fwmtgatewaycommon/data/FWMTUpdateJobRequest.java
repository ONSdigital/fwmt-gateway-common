package uk.gov.ons.fwmt.fwmtgatewaycommon.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FWMTUpdateJobRequest {
  private String actionType;
}
