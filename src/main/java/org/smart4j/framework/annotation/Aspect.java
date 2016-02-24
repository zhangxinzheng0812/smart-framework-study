package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by yzy on 2016/2/24.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
