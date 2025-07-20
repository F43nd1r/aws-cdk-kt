package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientVpnRoute(
  id: String,
  props: CfnClientVpnRouteProps,
  initializer: @AwsCdkDsl CfnClientVpnRoute.() -> Unit = {},
): CfnClientVpnRoute = CfnClientVpnRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClientVpnRoute(id: String, initializer: @AwsCdkDsl CfnClientVpnRoute.Builder.() -> Unit = {}): CfnClientVpnRoute = CfnClientVpnRoute.Builder.create(this, id).apply(initializer).build()
