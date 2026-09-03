package com.faendir.awscdkkt.generated.services.iotsecuretunneling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsecuretunneling.CfnTunnel
import software.amazon.awscdk.services.iotsecuretunneling.CfnTunnelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTunnel(id: String, initializer: @AwsCdkDsl CfnTunnel.() -> Unit = {}): CfnTunnel = CfnTunnel(this, id).apply(initializer)

@Generated
public fun Construct.cfnTunnel(
  id: String,
  props: CfnTunnelProps,
  initializer: @AwsCdkDsl CfnTunnel.() -> Unit = {},
): CfnTunnel = CfnTunnel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTunnel(id: String, initializer: @AwsCdkDsl CfnTunnel.Builder.() -> Unit = {}): CfnTunnel = CfnTunnel.Builder.create(this, id).apply(initializer).build()
