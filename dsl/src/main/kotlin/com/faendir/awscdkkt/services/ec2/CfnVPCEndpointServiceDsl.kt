package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEndpointService(id: String, initializer: CfnVPCEndpointService.() -> Unit
    = {}): CfnVPCEndpointService = CfnVPCEndpointService(this, id).apply(initializer)

@Generated
public fun Construct.cfnVPCEndpointService(
  id: String,
  props: CfnVPCEndpointServiceProps,
  initializer: CfnVPCEndpointService.() -> Unit = {},
): CfnVPCEndpointService = CfnVPCEndpointService(this, id, props).apply(initializer)
