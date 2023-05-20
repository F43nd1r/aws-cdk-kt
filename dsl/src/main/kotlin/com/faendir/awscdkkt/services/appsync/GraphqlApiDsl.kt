@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.GraphqlApiProps
import software.constructs.Construct

public fun Construct.graphqlApi(
  id: String,
  props: GraphqlApiProps,
  initializer: GraphqlApi.() -> Unit = {},
): GraphqlApi = GraphqlApi(this, id, props).apply(initializer)
