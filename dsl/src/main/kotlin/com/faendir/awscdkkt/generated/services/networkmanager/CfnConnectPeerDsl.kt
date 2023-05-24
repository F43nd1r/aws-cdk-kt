package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectPeer(id: String, props: CfnConnectPeerProps): CfnConnectPeer =
    CfnConnectPeer(this, id, props)

@Generated
public fun Construct.cfnConnectPeer(
  id: String,
  props: CfnConnectPeerProps,
  initializer: @AwsCdkDsl CfnConnectPeer.() -> Unit,
): CfnConnectPeer = CfnConnectPeer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectPeer(id: String, initializer: @AwsCdkDsl
    CfnConnectPeer.Builder.() -> Unit): CfnConnectPeer = CfnConnectPeer.Builder.create(this,
    id).apply(initializer).build()
