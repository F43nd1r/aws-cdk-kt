package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOriginRequestPolicy(id: String, props: CfnOriginRequestPolicyProps):
    CfnOriginRequestPolicy = CfnOriginRequestPolicy(this, id, props)

@Generated
public fun Construct.cfnOriginRequestPolicy(
  id: String,
  props: CfnOriginRequestPolicyProps,
  initializer: @AwsCdkDsl CfnOriginRequestPolicy.() -> Unit,
): CfnOriginRequestPolicy = CfnOriginRequestPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOriginRequestPolicy(id: String, initializer: @AwsCdkDsl
    CfnOriginRequestPolicy.Builder.() -> Unit): CfnOriginRequestPolicy =
    CfnOriginRequestPolicy.Builder.create(this, id).apply(initializer).build()
