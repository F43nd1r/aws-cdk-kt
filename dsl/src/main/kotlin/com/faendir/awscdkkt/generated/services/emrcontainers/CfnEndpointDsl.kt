package com.faendir.awscdkkt.generated.services.emrcontainers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnEndpoint
import software.amazon.awscdk.services.emrcontainers.CfnEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEndpoint(
  id: String,
  props: CfnEndpointProps,
  initializer: @AwsCdkDsl CfnEndpoint.() -> Unit = {},
): CfnEndpoint = CfnEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEndpoint(id: String, initializer: @AwsCdkDsl CfnEndpoint.Builder.() -> Unit = {}): CfnEndpoint = CfnEndpoint.Builder.create(this, id).apply(initializer).build()
