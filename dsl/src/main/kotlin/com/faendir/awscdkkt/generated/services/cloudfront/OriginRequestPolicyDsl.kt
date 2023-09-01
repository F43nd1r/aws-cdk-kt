package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.originRequestPolicy(id: String, initializer: @AwsCdkDsl
    OriginRequestPolicy.() -> Unit = {}): OriginRequestPolicy = OriginRequestPolicy(this,
    id).apply(initializer)

@Generated
public fun Construct.originRequestPolicy(
  id: String,
  props: OriginRequestPolicyProps,
  initializer: @AwsCdkDsl OriginRequestPolicy.() -> Unit = {},
): OriginRequestPolicy = OriginRequestPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOriginRequestPolicy(id: String, initializer: @AwsCdkDsl
    OriginRequestPolicy.Builder.() -> Unit = {}): OriginRequestPolicy =
    OriginRequestPolicy.Builder.create(this, id).apply(initializer).build()
