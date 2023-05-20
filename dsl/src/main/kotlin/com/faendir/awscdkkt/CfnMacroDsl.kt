@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnMacro
import software.amazon.awscdk.CfnMacroProps
import software.constructs.Construct

public fun Construct.cfnMacro(
  id: String,
  props: CfnMacroProps,
  initializer: CfnMacro.() -> Unit = {},
): CfnMacro = CfnMacro(this, id, props).apply(initializer)
