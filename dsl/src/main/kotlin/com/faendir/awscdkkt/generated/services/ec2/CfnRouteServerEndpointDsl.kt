package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteServerEndpoint
import software.amazon.awscdk.services.ec2.CfnRouteServerEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteServerEndpoint(
  id: String,
  props: CfnRouteServerEndpointProps,
  initializer: @AwsCdkDsl CfnRouteServerEndpoint.() -> Unit = {},
): CfnRouteServerEndpoint = CfnRouteServerEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteServerEndpoint(id: String, initializer: @AwsCdkDsl
    CfnRouteServerEndpoint.Builder.() -> Unit = {}): CfnRouteServerEndpoint =
    CfnRouteServerEndpoint.Builder.create(this, id).apply(initializer).build()
