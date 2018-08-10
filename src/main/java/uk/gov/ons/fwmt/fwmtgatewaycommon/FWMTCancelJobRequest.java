package uk.gov.ons.fwmt.fwmtgatewaycommon;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FWMTCancelJobRequest {
  private String jobIdentity;
  private String reason;
}
