package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFrontWebDistribution(
  id: String,
  props: CloudFrontWebDistributionProps,
  initializer: @AwsCdkDsl CloudFrontWebDistribution.() -> Unit = {},
): CloudFrontWebDistribution = CloudFrontWebDistribution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCloudFrontWebDistribution(id: String, initializer: @AwsCdkDsl
    CloudFrontWebDistribution.Builder.() -> Unit = {}): CloudFrontWebDistribution =
    CloudFrontWebDistribution.Builder.create(this, id).apply(initializer).build()
