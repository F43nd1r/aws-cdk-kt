package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps

@Generated
public fun dynamoDbDataSourceProps(initializer: DynamoDbDataSourceProps.Builder.() -> Unit = {}):
    DynamoDbDataSourceProps = DynamoDbDataSourceProps.builder().apply(initializer).build()
