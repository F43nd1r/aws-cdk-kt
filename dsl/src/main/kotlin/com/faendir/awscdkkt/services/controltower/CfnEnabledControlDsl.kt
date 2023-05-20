@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.controltower

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps
import software.constructs.Construct

public fun Construct.cfnEnabledControl(
  id: String,
  props: CfnEnabledControlProps,
  initializer: CfnEnabledControl.() -> Unit = {},
): CfnEnabledControl = CfnEnabledControl(this, id, props).apply(initializer)
