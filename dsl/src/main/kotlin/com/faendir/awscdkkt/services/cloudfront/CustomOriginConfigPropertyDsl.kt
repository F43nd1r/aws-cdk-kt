@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun customOriginConfigProperty(initializer: CfnDistribution.CustomOriginConfigProperty.Builder.() -> Unit):
    CfnDistribution.CustomOriginConfigProperty =
    CfnDistribution.CustomOriginConfigProperty.builder().apply(initializer).build()
