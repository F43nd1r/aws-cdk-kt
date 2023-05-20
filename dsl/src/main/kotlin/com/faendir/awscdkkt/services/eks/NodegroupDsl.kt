@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.NodegroupProps
import software.constructs.Construct

public fun Construct.nodegroup(
  id: String,
  props: NodegroupProps,
  initializer: Nodegroup.() -> Unit = {},
): Nodegroup = Nodegroup(this, id, props).apply(initializer)
