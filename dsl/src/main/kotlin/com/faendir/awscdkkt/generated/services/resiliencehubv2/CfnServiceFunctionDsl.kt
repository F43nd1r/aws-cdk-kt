package com.faendir.awscdkkt.generated.services.resiliencehubv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehubv2.CfnServiceFunction
import software.amazon.awscdk.services.resiliencehubv2.CfnServiceFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceFunction(
  id: String,
  props: CfnServiceFunctionProps,
  initializer: @AwsCdkDsl CfnServiceFunction.() -> Unit = {},
): CfnServiceFunction = CfnServiceFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceFunction(id: String, initializer: @AwsCdkDsl CfnServiceFunction.Builder.() -> Unit = {}): CfnServiceFunction = CfnServiceFunction.Builder.create(this, id).apply(initializer).build()
