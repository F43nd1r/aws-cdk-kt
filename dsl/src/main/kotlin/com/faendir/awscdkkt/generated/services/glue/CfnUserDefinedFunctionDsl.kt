package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnUserDefinedFunction
import software.amazon.awscdk.services.glue.CfnUserDefinedFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserDefinedFunction(
  id: String,
  props: CfnUserDefinedFunctionProps,
  initializer: @AwsCdkDsl CfnUserDefinedFunction.() -> Unit = {},
): CfnUserDefinedFunction = CfnUserDefinedFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserDefinedFunction(id: String, initializer: @AwsCdkDsl CfnUserDefinedFunction.Builder.() -> Unit = {}): CfnUserDefinedFunction = CfnUserDefinedFunction.Builder.create(this, id).apply(initializer).build()
