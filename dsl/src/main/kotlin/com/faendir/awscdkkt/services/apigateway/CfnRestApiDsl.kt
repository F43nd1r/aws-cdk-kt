@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.constructs.Construct

public fun Construct.cfnRestApi(id: String, initializer: CfnRestApi.() -> Unit = {}): CfnRestApi =
    CfnRestApi(this, id).apply(initializer)

public fun Construct.cfnRestApi(
  id: String,
  props: CfnRestApiProps,
  initializer: CfnRestApi.() -> Unit = {},
): CfnRestApi = CfnRestApi(this, id, props).apply(initializer)
