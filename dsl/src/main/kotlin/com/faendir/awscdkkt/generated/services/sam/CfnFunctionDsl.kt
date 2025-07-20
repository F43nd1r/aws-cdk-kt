package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunction(id: String, initializer: @AwsCdkDsl CfnFunction.() -> Unit = {}): CfnFunction = CfnFunction(this, id).apply(initializer)

@Generated
public fun Construct.cfnFunction(
  id: String,
  props: CfnFunctionProps,
  initializer: @AwsCdkDsl CfnFunction.() -> Unit = {},
): CfnFunction = CfnFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFunction(id: String, initializer: @AwsCdkDsl CfnFunction.Builder.() -> Unit = {}): CfnFunction = CfnFunction.Builder.create(this, id).apply(initializer).build()
