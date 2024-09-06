@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.constructs.Construct

@Deprecated(message =
    "software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution is deprecated in CDK.")
@Generated
public fun Construct.cloudFrontWebDistribution(
  id: String,
  props: CloudFrontWebDistributionProps,
  initializer: @AwsCdkDsl CloudFrontWebDistribution.() -> Unit = {},
): CloudFrontWebDistribution = CloudFrontWebDistribution(this, id, props).apply(initializer)

@Deprecated(message =
    "software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution is deprecated in CDK.")
@Generated
public fun Construct.buildCloudFrontWebDistribution(id: String, initializer: @AwsCdkDsl
    CloudFrontWebDistribution.Builder.() -> Unit = {}): CloudFrontWebDistribution =
    CloudFrontWebDistribution.Builder.create(this, id).apply(initializer).build()
