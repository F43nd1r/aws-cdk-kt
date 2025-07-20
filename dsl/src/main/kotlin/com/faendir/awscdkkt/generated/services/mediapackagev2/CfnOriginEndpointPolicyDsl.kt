package com.faendir.awscdkkt.generated.services.mediapackagev2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicy
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOriginEndpointPolicy(
  id: String,
  props: CfnOriginEndpointPolicyProps,
  initializer: @AwsCdkDsl CfnOriginEndpointPolicy.() -> Unit = {},
): CfnOriginEndpointPolicy = CfnOriginEndpointPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOriginEndpointPolicy(id: String, initializer: @AwsCdkDsl CfnOriginEndpointPolicy.Builder.() -> Unit = {}): CfnOriginEndpointPolicy = CfnOriginEndpointPolicy.Builder.create(this, id).apply(initializer).build()
