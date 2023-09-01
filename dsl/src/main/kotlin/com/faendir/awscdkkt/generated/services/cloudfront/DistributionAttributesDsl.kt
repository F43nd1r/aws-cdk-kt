package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.DistributionAttributes

@Generated
public fun buildDistributionAttributes(initializer: @AwsCdkDsl
    DistributionAttributes.Builder.() -> Unit = {}): DistributionAttributes =
    DistributionAttributes.Builder().apply(initializer).build()
