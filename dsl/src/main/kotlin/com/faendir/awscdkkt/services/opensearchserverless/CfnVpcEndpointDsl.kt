@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
import software.constructs.Construct

public fun Construct.cfnVpcEndpoint(
  id: String,
  props: CfnVpcEndpointProps,
  initializer: CfnVpcEndpoint.() -> Unit = {},
): CfnVpcEndpoint = CfnVpcEndpoint(this, id, props).apply(initializer)
