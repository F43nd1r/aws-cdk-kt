package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.GraphqlApiProps
import software.constructs.Construct

@Generated
public fun Construct.graphqlApi(id: String, props: GraphqlApiProps): GraphqlApi = GraphqlApi(this,
    id, props)

@Generated
public fun Construct.graphqlApi(
  id: String,
  props: GraphqlApiProps,
  initializer: @AwsCdkDsl GraphqlApi.() -> Unit,
): GraphqlApi = GraphqlApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGraphqlApi(id: String, initializer: @AwsCdkDsl
    GraphqlApi.Builder.() -> Unit): GraphqlApi = GraphqlApi.Builder.create(this,
    id).apply(initializer).build()
