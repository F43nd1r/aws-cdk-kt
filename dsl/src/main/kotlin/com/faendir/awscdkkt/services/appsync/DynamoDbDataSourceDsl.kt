package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.dynamoDbDataSource(
  id: String,
  props: DynamoDbDataSourceProps,
  initializer: DynamoDbDataSource.() -> Unit = {},
): DynamoDbDataSource = DynamoDbDataSource(this, id, props).apply(initializer)
