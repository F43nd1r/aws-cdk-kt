@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun customErrorResponseProperty(initializer: CfnDistribution.CustomErrorResponseProperty.Builder.() -> Unit):
    CfnDistribution.CustomErrorResponseProperty =
    CfnDistribution.CustomErrorResponseProperty.builder().apply(initializer).build()
