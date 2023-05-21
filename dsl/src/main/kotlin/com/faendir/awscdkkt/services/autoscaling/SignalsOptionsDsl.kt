package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.SignalsOptions

@Generated
public fun signalsOptions(initializer: SignalsOptions.Builder.() -> Unit = {}): SignalsOptions =
    SignalsOptions.builder().apply(initializer).build()
