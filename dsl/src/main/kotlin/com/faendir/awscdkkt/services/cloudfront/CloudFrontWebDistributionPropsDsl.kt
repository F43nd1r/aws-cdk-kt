package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps

@Generated
public
    fun cloudFrontWebDistributionProps(initializer: CloudFrontWebDistributionProps.Builder.() -> Unit
    = {}): CloudFrontWebDistributionProps =
    CloudFrontWebDistributionProps.builder().apply(initializer).build()
