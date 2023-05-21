package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.GraphqlApiAttributes

@Generated
public fun graphqlApiAttributes(initializer: GraphqlApiAttributes.Builder.() -> Unit = {}):
    GraphqlApiAttributes = GraphqlApiAttributes.builder().apply(initializer).build()
