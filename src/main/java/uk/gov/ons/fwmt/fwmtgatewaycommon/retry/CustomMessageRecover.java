package uk.gov.ons.fwmt.fwmtgatewaycommon.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.retry.interceptor.MethodInvocationRecoverer;

@Slf4j
public class CustomMessageRecover implements MethodInvocationRecoverer<Void> {

  @Override
  public Void recover(Object[] args, Throwable cause) {
    log.error("Error when receiving message, recovery in progress: ", cause);
    throw new AmqpRejectAndDontRequeueException(cause);
  }
}
