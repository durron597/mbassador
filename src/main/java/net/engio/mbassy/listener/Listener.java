package net.engio.mbassy.listener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bennidi
 *         Date: 3/29/13
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface Listener {

    /**
     * By default, references to message listeners are weak to eliminate risks of memory leaks.
     * It is possible to use strong references instead.
     *
     * @return
     */
    References references() default References.Weak;

}
