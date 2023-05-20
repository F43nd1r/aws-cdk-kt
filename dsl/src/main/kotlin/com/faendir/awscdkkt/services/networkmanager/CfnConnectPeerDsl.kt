@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps
import software.constructs.Construct

public fun Construct.cfnConnectPeer(
  id: String,
  props: CfnConnectPeerProps,
  initializer: CfnConnectPeer.() -> Unit = {},
): CfnConnectPeer = CfnConnectPeer(this, id, props).apply(initializer)
