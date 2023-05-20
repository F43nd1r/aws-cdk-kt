@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun scalingConfigProperty(initializer: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit):
    CfnEventSourceMapping.ScalingConfigProperty =
    CfnEventSourceMapping.ScalingConfigProperty.builder().apply(initializer).build()
