package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnWarmPool

@Generated
public
    fun instanceReusePolicyProperty(initializer: CfnWarmPool.InstanceReusePolicyProperty.Builder.() -> Unit
    = {}): CfnWarmPool.InstanceReusePolicyProperty =
    CfnWarmPool.InstanceReusePolicyProperty.builder().apply(initializer).build()
