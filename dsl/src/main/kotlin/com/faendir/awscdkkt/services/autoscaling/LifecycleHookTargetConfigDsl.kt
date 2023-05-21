package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig

@Generated
public fun lifecycleHookTargetConfig(initializer: LifecycleHookTargetConfig.Builder.() -> Unit =
    {}): LifecycleHookTargetConfig = LifecycleHookTargetConfig.builder().apply(initializer).build()
