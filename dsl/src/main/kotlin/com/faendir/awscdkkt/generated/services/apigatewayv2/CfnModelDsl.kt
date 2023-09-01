package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModel(
  id: String,
  props: CfnModelProps,
  initializer: @AwsCdkDsl CfnModel.() -> Unit = {},
): CfnModel = CfnModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModel(id: String, initializer: @AwsCdkDsl CfnModel.Builder.() -> Unit =
    {}): CfnModel = CfnModel.Builder.create(this, id).apply(initializer).build()
