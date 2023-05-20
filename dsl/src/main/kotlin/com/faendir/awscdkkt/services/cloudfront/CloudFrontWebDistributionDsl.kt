@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
