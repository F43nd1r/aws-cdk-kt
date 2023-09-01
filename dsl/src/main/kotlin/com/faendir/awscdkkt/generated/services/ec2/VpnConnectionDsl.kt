package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.vpnConnection(
  id: String,
  props: VpnConnectionProps,
  initializer: @AwsCdkDsl VpnConnection.() -> Unit = {},
): VpnConnection = VpnConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVpnConnection(id: String, initializer: @AwsCdkDsl
    VpnConnection.Builder.() -> Unit = {}): VpnConnection = VpnConnection.Builder.create(this,
    id).apply(initializer).build()
