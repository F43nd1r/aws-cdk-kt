package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun scalingConfigProperty(initializer: CfnNodegroup.ScalingConfigProperty.Builder.() -> Unit
    = {}): CfnNodegroup.ScalingConfigProperty =
    CfnNodegroup.ScalingConfigProperty.builder().apply(initializer).build()
