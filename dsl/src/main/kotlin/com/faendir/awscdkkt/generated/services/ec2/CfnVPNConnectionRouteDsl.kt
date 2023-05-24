package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNConnectionRoute(id: String, props: CfnVPNConnectionRouteProps):
    CfnVPNConnectionRoute = CfnVPNConnectionRoute(this, id, props)

@Generated
public fun Construct.cfnVPNConnectionRoute(
  id: String,
  props: CfnVPNConnectionRouteProps,
  initializer: @AwsCdkDsl CfnVPNConnectionRoute.() -> Unit,
): CfnVPNConnectionRoute = CfnVPNConnectionRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPNConnectionRoute(id: String, initializer: @AwsCdkDsl
    CfnVPNConnectionRoute.Builder.() -> Unit): CfnVPNConnectionRoute =
    CfnVPNConnectionRoute.Builder.create(this, id).apply(initializer).build()
