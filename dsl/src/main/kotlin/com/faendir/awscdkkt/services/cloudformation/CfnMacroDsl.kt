@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnMacro
import software.amazon.awscdk.services.cloudformation.CfnMacroProps
import software.constructs.Construct

public fun Construct.cfnMacro(
  id: String,
  props: CfnMacroProps,
  initializer: CfnMacro.() -> Unit = {},
): CfnMacro = CfnMacro(this, id, props).apply(initializer)
