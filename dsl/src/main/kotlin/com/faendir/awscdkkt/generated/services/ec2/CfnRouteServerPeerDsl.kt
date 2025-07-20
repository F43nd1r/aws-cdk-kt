package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteServerPeer
import software.amazon.awscdk.services.ec2.CfnRouteServerPeerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteServerPeer(
  id: String,
  props: CfnRouteServerPeerProps,
  initializer: @AwsCdkDsl CfnRouteServerPeer.() -> Unit = {},
): CfnRouteServerPeer = CfnRouteServerPeer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteServerPeer(id: String, initializer: @AwsCdkDsl CfnRouteServerPeer.Builder.() -> Unit = {}): CfnRouteServerPeer = CfnRouteServerPeer.Builder.create(this, id).apply(initializer).build()
