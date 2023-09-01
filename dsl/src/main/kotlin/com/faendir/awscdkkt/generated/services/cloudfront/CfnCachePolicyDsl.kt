package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCachePolicy(
  id: String,
  props: CfnCachePolicyProps,
  initializer: @AwsCdkDsl CfnCachePolicy.() -> Unit = {},
): CfnCachePolicy = CfnCachePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCachePolicy(id: String, initializer: @AwsCdkDsl
    CfnCachePolicy.Builder.() -> Unit = {}): CfnCachePolicy = CfnCachePolicy.Builder.create(this,
    id).apply(initializer).build()
