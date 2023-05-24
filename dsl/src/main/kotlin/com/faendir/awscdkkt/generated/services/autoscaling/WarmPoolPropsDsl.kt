package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.WarmPoolProps

@Generated
public fun buildWarmPoolProps(initializer: @AwsCdkDsl WarmPoolProps.Builder.() -> Unit):
    WarmPoolProps = WarmPoolProps.Builder().apply(initializer).build()
