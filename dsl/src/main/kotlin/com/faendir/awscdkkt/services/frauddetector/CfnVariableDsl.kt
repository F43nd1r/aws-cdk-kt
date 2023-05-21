package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnVariable
import software.amazon.awscdk.services.frauddetector.CfnVariableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVariable(
  id: String,
  props: CfnVariableProps,
  initializer: CfnVariable.() -> Unit = {},
): CfnVariable = CfnVariable(this, id, props).apply(initializer)
