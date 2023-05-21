package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Behavior

@Generated
public fun behavior(initializer: Behavior.Builder.() -> Unit = {}): Behavior =
    Behavior.builder().apply(initializer).build()
