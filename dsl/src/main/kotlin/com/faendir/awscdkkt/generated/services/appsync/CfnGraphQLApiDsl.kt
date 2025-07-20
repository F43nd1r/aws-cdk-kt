package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGraphQLApi(
  id: String,
  props: CfnGraphQLApiProps,
  initializer: @AwsCdkDsl CfnGraphQLApi.() -> Unit = {},
): CfnGraphQLApi = CfnGraphQLApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGraphQLApi(id: String, initializer: @AwsCdkDsl CfnGraphQLApi.Builder.() -> Unit = {}): CfnGraphQLApi = CfnGraphQLApi.Builder.create(this, id).apply(initializer).build()
