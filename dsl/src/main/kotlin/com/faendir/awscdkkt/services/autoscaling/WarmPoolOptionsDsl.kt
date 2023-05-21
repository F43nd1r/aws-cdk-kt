package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPoolOptions

@Generated
public fun warmPoolOptions(initializer: WarmPoolOptions.Builder.() -> Unit = {}): WarmPoolOptions =
    WarmPoolOptions.builder().apply(initializer).build()
