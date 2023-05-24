package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPoolOptions

@Generated
public fun buildWarmPoolOptions(initializer: @AwsCdkDsl WarmPoolOptions.Builder.() -> Unit):
    WarmPoolOptions = WarmPoolOptions.Builder().apply(initializer).build()
