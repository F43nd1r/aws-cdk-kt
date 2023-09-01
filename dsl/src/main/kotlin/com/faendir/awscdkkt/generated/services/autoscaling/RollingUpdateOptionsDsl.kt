package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RollingUpdateOptions

@Generated
public fun buildRollingUpdateOptions(initializer: @AwsCdkDsl RollingUpdateOptions.Builder.() -> Unit
    = {}): RollingUpdateOptions = RollingUpdateOptions.Builder().apply(initializer).build()
