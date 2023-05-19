@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.constructs.Construct

public fun Construct.cloudFrontWebDistribution(
  id: String,
  props: CloudFrontWebDistributionProps,
  initializer: CloudFrontWebDistribution.() -> Unit = {},
): CloudFrontWebDistribution = CloudFrontWebDistribution(this, id, props).apply(initializer)
