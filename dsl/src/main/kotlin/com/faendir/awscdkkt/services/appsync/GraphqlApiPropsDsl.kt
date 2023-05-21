package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.GraphqlApiProps

@Generated
public fun graphqlApiProps(initializer: GraphqlApiProps.Builder.() -> Unit = {}): GraphqlApiProps =
    GraphqlApiProps.builder().apply(initializer).build()
