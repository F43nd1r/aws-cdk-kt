package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps

@Generated
public fun cfnWarmPoolProps(initializer: CfnWarmPoolProps.Builder.() -> Unit = {}): CfnWarmPoolProps
    = CfnWarmPoolProps.builder().apply(initializer).build()
