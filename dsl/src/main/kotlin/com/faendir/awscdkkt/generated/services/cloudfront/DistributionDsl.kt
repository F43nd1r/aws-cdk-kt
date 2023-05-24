package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.DistributionProps
import software.constructs.Construct

@Generated
public fun Construct.distribution(id: String, props: DistributionProps): Distribution =
    Distribution(this, id, props)

@Generated
public fun Construct.distribution(
  id: String,
  props: DistributionProps,
  initializer: @AwsCdkDsl Distribution.() -> Unit,
): Distribution = Distribution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDistribution(id: String, initializer: @AwsCdkDsl
    Distribution.Builder.() -> Unit): Distribution = Distribution.Builder.create(this,
    id).apply(initializer).build()
