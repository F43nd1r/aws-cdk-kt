package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVariable.() -> Unit = {},
): CfnVariable = CfnVariable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVariable(id: String, initializer: @AwsCdkDsl CfnVariable.Builder.() -> Unit = {}): CfnVariable = CfnVariable.Builder.create(this, id).apply(initializer).build()
