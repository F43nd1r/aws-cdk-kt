@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps
import software.constructs.Construct

public fun Construct.cfnNode(
  id: String,
  props: CfnNodeProps,
  initializer: CfnNode.() -> Unit = {},
): CfnNode = CfnNode(this, id, props).apply(initializer)
