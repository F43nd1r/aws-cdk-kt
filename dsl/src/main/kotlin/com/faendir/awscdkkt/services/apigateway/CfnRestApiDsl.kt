package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRestApi(id: String, initializer: CfnRestApi.() -> Unit = {}): CfnRestApi =
    CfnRestApi(this, id).apply(initializer)

@Generated
public fun Construct.cfnRestApi(
  id: String,
  props: CfnRestApiProps,
  initializer: CfnRestApi.() -> Unit = {},
): CfnRestApi = CfnRestApi(this, id, props).apply(initializer)
