package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RenderSignalsOptions

@Generated
public fun renderSignalsOptions(initializer: RenderSignalsOptions.Builder.() -> Unit = {}):
    RenderSignalsOptions = RenderSignalsOptions.builder().apply(initializer).build()
