package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun distributionProperty(initializer: CfnDistributionConfiguration.DistributionProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.DistributionProperty =
    CfnDistributionConfiguration.DistributionProperty.builder().apply(initializer).build()
