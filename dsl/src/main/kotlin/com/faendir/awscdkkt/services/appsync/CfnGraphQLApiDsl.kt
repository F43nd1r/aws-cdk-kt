@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
