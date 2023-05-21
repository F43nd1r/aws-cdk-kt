package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions

@Generated
public fun logGroupTargetInputOptions(initializer: LogGroupTargetInputOptions.Builder.() -> Unit =
    {}): LogGroupTargetInputOptions =
    LogGroupTargetInputOptions.builder().apply(initializer).build()
