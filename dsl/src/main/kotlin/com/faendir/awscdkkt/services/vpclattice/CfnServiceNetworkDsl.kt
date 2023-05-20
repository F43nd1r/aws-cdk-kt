@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps
import software.constructs.Construct

public fun Construct.cfnServiceNetwork(
  id: String,
  props: CfnServiceNetworkProps,
  initializer: CfnServiceNetwork.() -> Unit = {},
): CfnServiceNetwork = CfnServiceNetwork(this, id, props).apply(initializer)

public fun Construct.cfnServiceNetwork(id: String, initializer: CfnServiceNetwork.() -> Unit = {}):
    CfnServiceNetwork = CfnServiceNetwork(this, id).apply(initializer)
