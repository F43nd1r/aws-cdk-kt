package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun scalingConfigProperty(initializer: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.ScalingConfigProperty =
    CfnEventSourceMapping.ScalingConfigProperty.builder().apply(initializer).build()
