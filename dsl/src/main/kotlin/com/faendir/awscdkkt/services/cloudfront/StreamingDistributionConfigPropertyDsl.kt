@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

public
    fun streamingDistributionConfigProperty(initializer: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit):
    CfnStreamingDistribution.StreamingDistributionConfigProperty =
    CfnStreamingDistribution.StreamingDistributionConfigProperty.builder().apply(initializer).build()
