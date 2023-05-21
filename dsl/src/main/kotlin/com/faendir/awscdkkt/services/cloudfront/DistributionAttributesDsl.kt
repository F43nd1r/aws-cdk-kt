package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.DistributionAttributes

@Generated
public fun distributionAttributes(initializer: DistributionAttributes.Builder.() -> Unit = {}):
    DistributionAttributes = DistributionAttributes.builder().apply(initializer).build()
