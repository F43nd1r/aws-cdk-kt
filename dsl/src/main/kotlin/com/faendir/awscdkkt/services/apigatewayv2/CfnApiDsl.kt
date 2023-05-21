package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApi(id: String, initializer: CfnApi.() -> Unit = {}): CfnApi = CfnApi(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnApi(
  id: String,
  props: CfnApiProps,
  initializer: CfnApi.() -> Unit = {},
): CfnApi = CfnApi(this, id, props).apply(initializer)
