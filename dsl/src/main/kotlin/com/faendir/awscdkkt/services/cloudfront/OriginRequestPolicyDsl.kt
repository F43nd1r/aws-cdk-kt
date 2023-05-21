package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.originRequestPolicy(id: String, initializer: OriginRequestPolicy.() -> Unit =
    {}): OriginRequestPolicy = OriginRequestPolicy(this, id).apply(initializer)

@Generated
public fun Construct.originRequestPolicy(
  id: String,
  props: OriginRequestPolicyProps,
  initializer: OriginRequestPolicy.() -> Unit = {},
): OriginRequestPolicy = OriginRequestPolicy(this, id, props).apply(initializer)
