package it.upwardtechnology.gestionale.plugin.service;
import java.math.BigDecimal;
public interface PagamentiApi extends CrudService {
    default EntityRecord refund(long paymentId, BigDecimal amount, String reason){ throw new UnsupportedOperationException("refund capability not provided"); }
    default EntityRecord createPaymentRequest(EntityMutation request){ throw new UnsupportedOperationException("payment request capability not provided"); }
    default EntityRecord authorizeDeposit(EntityMutation request){ throw new UnsupportedOperationException("deposit capability not provided"); }
    default EntityRecord captureDeposit(long depositId,BigDecimal amount){ throw new UnsupportedOperationException("capture capability not provided"); }
    default boolean cancelDeposit(long depositId){ throw new UnsupportedOperationException("cancel deposit capability not provided"); }
}
