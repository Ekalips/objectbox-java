package io.objectbox;

import java.util.concurrent.Callable;

/**
 * Callback to be used for {@link BoxStore#runInTxAsync(Runnable, TxCallback)} and
 * {@link BoxStore#callInTxAsync(Callable, TxCallback)}.
 */
public interface TxCallback<T> {
    /**
     * Called when an asynchronous transaction finished.
     *
     * @param result Result of the callable {@link BoxStore#callInTxAsync(Callable, TxCallback)}
     * @param error  non-null if an exception was thrown
     */
    void txFinished(T result, Throwable error);
}
