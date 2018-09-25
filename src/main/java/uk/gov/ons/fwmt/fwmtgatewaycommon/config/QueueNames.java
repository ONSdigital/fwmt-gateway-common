package uk.gov.ons.fwmt.fwmtgatewaycommon.config;

public class QueueNames {

  // Queues
  public static final String RM_JOB_SVC_EXCHANGE = "rm-jobsvc-exchange";

  public static final String RM_TO_ADAPTER_QUEUE = "rm-adapter";

  public static final String ADAPTER_TO_JOBSVC_QUEUE = "adapter-jobSvc";

  public static final String JOBSVC_TO_ADAPTER_QUEUE = "jobsvc-adapter";

  public static final String ADAPTER_TO_RM_QUEUE = "adapter-rm";

  // Routing Keys
  public static final String RM_REQUEST_ROUTING_KEY = "rm.job.request";

  public static final String RM_RESPONSE_ROUTING_KEY = "rm.job.response";

  public static final String JOB_SVC_REQUEST_ROUTING_KEY = "jobsvc.job.request";

  public static final String JOB_SVC_RESPONSE_ROUTING_KEY = "jobsvc.job.response";

  // Dead Letter Queues
  public static final String ADAPTER_JOB_SVC_DLQ = "adapter-jobSvc.DLQ";

  public static final String JOB_SVC_ADAPTER_DLQ = "jobSvc-adapter.DLQ";

  public static final String RM_ADAPTER_DLQ = "rm-adapter.DLQ";

  public static final String ADAPTER_RM_DLQ = "adapter-rm.DLQ";

}
