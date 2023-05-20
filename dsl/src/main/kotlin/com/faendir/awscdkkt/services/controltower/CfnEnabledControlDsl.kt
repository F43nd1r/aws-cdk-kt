@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
