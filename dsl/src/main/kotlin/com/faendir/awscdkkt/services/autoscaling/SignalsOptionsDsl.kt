@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.SignalsOptions

public fun signalsOptions(initializer: SignalsOptions.Builder.() -> Unit): SignalsOptions =
    SignalsOptions.builder().apply(initializer).build()
