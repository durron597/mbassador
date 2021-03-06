package net.engio.mbassy.bus.publication;

import net.engio.mbassy.bus.MBassador;
import net.engio.mbassy.bus.MessagePublication;

import java.util.concurrent.TimeUnit;

/**
 * This post command provides access to standard synchronous and asynchronous dispatch
 *
 * @author bennidi
 *         Date: 11/12/12
 */
public class SyncAsyncPostCommand<T> implements ISyncAsyncPublicationCommand {

    private T message;
    private MBassador<T> mBassador;

    public SyncAsyncPostCommand(MBassador<T> mBassador, T message) {
        this.mBassador = mBassador;
        this.message = message;
    }

    @Override
    public void now() {
        mBassador.publish(message);
    }

    @Override
    public MessagePublication asynchronously() {
        return mBassador.publishAsync(message);
    }

    @Override
    public MessagePublication asynchronously(long timeout, TimeUnit unit) {
        return mBassador.publishAsync(message, timeout, unit);
    }
}
