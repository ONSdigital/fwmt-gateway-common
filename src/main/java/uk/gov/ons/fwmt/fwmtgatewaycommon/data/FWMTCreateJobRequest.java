package uk.gov.ons.fwmt.fwmtgatewaycommon.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FWMTCreateJobRequest {
  private String actionType;

  private String jobIdentity;

  private String surveyType;

  private boolean preallocatedJob;

  private String mandatoryResourceAuthNo;

  private LocalDate dueDate;

  private Address address;

  private List<AdditionalProperty> additionalProperties;
}