package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPoolProps

@Generated
public fun warmPoolProps(initializer: WarmPoolProps.Builder.() -> Unit = {}): WarmPoolProps =
    WarmPoolProps.builder().apply(initializer).build()
