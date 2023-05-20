@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPoolProps

public fun warmPoolProps(initializer: WarmPoolProps.Builder.() -> Unit): WarmPoolProps =
    WarmPoolProps.builder().apply(initializer).build()
