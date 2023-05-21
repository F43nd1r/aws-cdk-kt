package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes

@Generated
public
    fun cloudFrontWebDistributionAttributes(initializer: CloudFrontWebDistributionAttributes.Builder.() -> Unit
    = {}): CloudFrontWebDistributionAttributes =
    CloudFrontWebDistributionAttributes.builder().apply(initializer).build()
