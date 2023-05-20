@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.CfnNodegroupProps
import software.constructs.Construct

public fun Construct.cfnNodegroup(
  id: String,
  props: CfnNodegroupProps,
  initializer: CfnNodegroup.() -> Unit = {},
): CfnNodegroup = CfnNodegroup(this, id, props).apply(initializer)
