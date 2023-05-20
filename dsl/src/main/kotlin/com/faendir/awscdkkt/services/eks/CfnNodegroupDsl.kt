@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
