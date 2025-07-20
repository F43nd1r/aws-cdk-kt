package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.ClientVpnRouteProps
import software.constructs.Construct

@Generated
public fun Construct.clientVpnRoute(
  id: String,
  props: ClientVpnRouteProps,
  initializer: @AwsCdkDsl ClientVpnRoute.() -> Unit = {},
): ClientVpnRoute = ClientVpnRoute(this, id, props).apply(initializer)

@Generated
public fun Construct.buildClientVpnRoute(id: String, initializer: @AwsCdkDsl ClientVpnRoute.Builder.() -> Unit = {}): ClientVpnRoute = ClientVpnRoute.Builder.create(this, id).apply(initializer).build()
