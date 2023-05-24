package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResponseHeadersPolicy(id: String, props: CfnResponseHeadersPolicyProps):
    CfnResponseHeadersPolicy = CfnResponseHeadersPolicy(this, id, props)

@Generated
public fun Construct.cfnResponseHeadersPolicy(
  id: String,
  props: CfnResponseHeadersPolicyProps,
  initializer: @AwsCdkDsl CfnResponseHeadersPolicy.() -> Unit,
): CfnResponseHeadersPolicy = CfnResponseHeadersPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResponseHeadersPolicy(id: String, initializer: @AwsCdkDsl
    CfnResponseHeadersPolicy.Builder.() -> Unit): CfnResponseHeadersPolicy =
    CfnResponseHeadersPolicy.Builder.create(this, id).apply(initializer).build()
