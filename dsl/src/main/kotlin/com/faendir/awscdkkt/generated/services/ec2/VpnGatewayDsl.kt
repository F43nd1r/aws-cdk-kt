package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnGateway
import software.amazon.awscdk.services.ec2.VpnGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.vpnGateway(id: String, props: VpnGatewayProps): VpnGateway = VpnGateway(this,
    id, props)

@Generated
public fun Construct.vpnGateway(
  id: String,
  props: VpnGatewayProps,
  initializer: @AwsCdkDsl VpnGateway.() -> Unit,
): VpnGateway = VpnGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpnGateway(id: String, initializer: @AwsCdkDsl
    VpnGateway.Builder.() -> Unit): VpnGateway = VpnGateway.Builder.create(this,
    id).apply(initializer).build()
