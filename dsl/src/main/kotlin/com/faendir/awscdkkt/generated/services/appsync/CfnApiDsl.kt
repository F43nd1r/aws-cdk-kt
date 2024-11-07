package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApi
import software.amazon.awscdk.services.appsync.CfnApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApi(
  id: String,
  props: CfnApiProps,
  initializer: @AwsCdkDsl CfnApi.() -> Unit = {},
): CfnApi = CfnApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApi(id: String, initializer: @AwsCdkDsl CfnApi.Builder.() -> Unit =
    {}): CfnApi = CfnApi.Builder.create(this, id).apply(initializer).build()
