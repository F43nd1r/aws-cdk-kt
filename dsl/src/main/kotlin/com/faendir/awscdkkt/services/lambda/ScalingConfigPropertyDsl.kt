@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun scalingConfigProperty(initializer: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit):
    CfnEventSourceMapping.ScalingConfigProperty =
    CfnEventSourceMapping.ScalingConfigProperty.builder().apply(initializer).build()
