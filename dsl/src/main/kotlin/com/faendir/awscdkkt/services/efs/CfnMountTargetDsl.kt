@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.amazon.awscdk.services.efs.CfnMountTargetProps
import software.constructs.Construct

public fun Construct.cfnMountTarget(
  id: String,
  props: CfnMountTargetProps,
  initializer: CfnMountTarget.() -> Unit = {},
): CfnMountTarget = CfnMountTarget(this, id, props).apply(initializer)
