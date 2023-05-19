@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
import software.constructs.Construct

public fun Construct.cfnGraphQLApi(
  id: String,
  props: CfnGraphQLApiProps,
  initializer: CfnGraphQLApi.() -> Unit = {},
): CfnGraphQLApi = CfnGraphQLApi(this, id, props).apply(initializer)
