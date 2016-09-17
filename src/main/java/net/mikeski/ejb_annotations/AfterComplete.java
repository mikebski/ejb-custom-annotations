/*
 * Copyright (c) 2016. Mike Baranski - all rights reserved.
 */

package net.mikeski.ejb_annotations;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
@Qualifier
public @interface AfterComplete {
}
