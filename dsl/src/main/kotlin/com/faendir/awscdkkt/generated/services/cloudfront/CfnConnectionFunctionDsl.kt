package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnConnectionFunction
import software.amazon.awscdk.services.cloudfront.CfnConnectionFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnectionFunction(
  id: String,
  props: CfnConnectionFunctionProps,
  initializer: @AwsCdkDsl CfnConnectionFunction.() -> Unit = {},
): CfnConnectionFunction = CfnConnectionFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnectionFunction(id: String, initializer: @AwsCdkDsl CfnConnectionFunction.Builder.() -> Unit = {}): CfnConnectionFunction = CfnConnectionFunction.Builder.create(this, id).apply(initializer).build()
