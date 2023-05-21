package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcEndpoint(
  id: String,
  props: CfnVpcEndpointProps,
  initializer: CfnVpcEndpoint.() -> Unit = {},
): CfnVpcEndpoint = CfnVpcEndpoint(this, id, props).apply(initializer)
