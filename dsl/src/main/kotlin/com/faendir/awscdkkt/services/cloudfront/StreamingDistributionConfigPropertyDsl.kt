package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

@Generated
public
    fun streamingDistributionConfigProperty(initializer: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder.() -> Unit
    = {}): CfnStreamingDistribution.StreamingDistributionConfigProperty =
    CfnStreamingDistribution.StreamingDistributionConfigProperty.builder().apply(initializer).build()
