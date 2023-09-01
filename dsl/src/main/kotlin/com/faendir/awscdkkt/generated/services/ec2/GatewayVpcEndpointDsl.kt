package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayVpcEndpoint(
  id: String,
  props: GatewayVpcEndpointProps,
  initializer: @AwsCdkDsl GatewayVpcEndpoint.() -> Unit = {},
): GatewayVpcEndpoint = GatewayVpcEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGatewayVpcEndpoint(id: String, initializer: @AwsCdkDsl
    GatewayVpcEndpoint.Builder.() -> Unit = {}): GatewayVpcEndpoint =
    GatewayVpcEndpoint.Builder.create(this, id).apply(initializer).build()
