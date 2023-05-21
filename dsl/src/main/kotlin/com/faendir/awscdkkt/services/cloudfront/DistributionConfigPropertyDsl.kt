package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun distributionConfigProperty(initializer: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit
    = {}): CfnDistribution.DistributionConfigProperty =
    CfnDistribution.DistributionConfigProperty.builder().apply(initializer).build()
