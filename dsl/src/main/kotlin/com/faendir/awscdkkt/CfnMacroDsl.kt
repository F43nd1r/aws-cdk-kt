@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
