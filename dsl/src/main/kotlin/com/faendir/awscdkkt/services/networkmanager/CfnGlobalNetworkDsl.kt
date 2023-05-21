package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetwork
import software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalNetwork(id: String, initializer: CfnGlobalNetwork.() -> Unit = {}):
    CfnGlobalNetwork = CfnGlobalNetwork(this, id).apply(initializer)

@Generated
public fun Construct.cfnGlobalNetwork(
  id: String,
  props: CfnGlobalNetworkProps,
  initializer: CfnGlobalNetwork.() -> Unit = {},
): CfnGlobalNetwork = CfnGlobalNetwork(this, id, props).apply(initializer)
