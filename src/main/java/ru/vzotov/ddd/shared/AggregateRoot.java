package ru.vzotov.ddd.shared;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
@Documented
@Inherited
public @interface AggregateRoot {
}
