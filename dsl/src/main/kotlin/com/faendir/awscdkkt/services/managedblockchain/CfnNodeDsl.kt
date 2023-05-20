@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
