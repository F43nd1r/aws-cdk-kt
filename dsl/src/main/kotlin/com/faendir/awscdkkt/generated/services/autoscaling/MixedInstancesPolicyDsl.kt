package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy

@Generated
public fun buildMixedInstancesPolicy(initializer: @AwsCdkDsl MixedInstancesPolicy.Builder.() -> Unit
    = {}): MixedInstancesPolicy = MixedInstancesPolicy.Builder().apply(initializer).build()
