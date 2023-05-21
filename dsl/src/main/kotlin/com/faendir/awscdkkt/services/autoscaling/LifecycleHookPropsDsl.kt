package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps

@Generated
public fun lifecycleHookProps(initializer: LifecycleHookProps.Builder.() -> Unit = {}):
    LifecycleHookProps = LifecycleHookProps.builder().apply(initializer).build()
