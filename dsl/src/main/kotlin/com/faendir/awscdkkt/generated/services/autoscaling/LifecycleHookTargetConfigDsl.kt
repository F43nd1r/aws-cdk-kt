package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig

@Generated
public fun buildLifecycleHookTargetConfig(initializer: @AwsCdkDsl
    LifecycleHookTargetConfig.Builder.() -> Unit): LifecycleHookTargetConfig =
    LifecycleHookTargetConfig.Builder().apply(initializer).build()
