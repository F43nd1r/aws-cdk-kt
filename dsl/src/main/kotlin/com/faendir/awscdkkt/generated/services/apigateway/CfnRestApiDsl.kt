package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRestApi(id: String, initializer: @AwsCdkDsl CfnRestApi.() -> Unit = {}):
    CfnRestApi = CfnRestApi(this, id).apply(initializer)

@Generated
public fun Construct.cfnRestApi(
  id: String,
  props: CfnRestApiProps,
  initializer: @AwsCdkDsl CfnRestApi.() -> Unit = {},
): CfnRestApi = CfnRestApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRestApi(id: String, initializer: @AwsCdkDsl
    CfnRestApi.Builder.() -> Unit = {}): CfnRestApi = CfnRestApi.Builder.create(this,
    id).apply(initializer).build()
