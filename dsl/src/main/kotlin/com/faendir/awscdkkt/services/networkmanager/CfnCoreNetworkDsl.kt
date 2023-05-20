@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps
import software.constructs.Construct

public fun Construct.cfnCoreNetwork(
  id: String,
  props: CfnCoreNetworkProps,
  initializer: CfnCoreNetwork.() -> Unit = {},
): CfnCoreNetwork = CfnCoreNetwork(this, id, props).apply(initializer)
