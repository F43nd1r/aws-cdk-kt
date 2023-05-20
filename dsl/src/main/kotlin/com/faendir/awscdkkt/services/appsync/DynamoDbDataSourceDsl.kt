@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
import software.constructs.Construct

public fun Construct.dynamoDbDataSource(
  id: String,
  props: DynamoDbDataSourceProps,
  initializer: DynamoDbDataSource.() -> Unit = {},
): DynamoDbDataSource = DynamoDbDataSource(this, id, props).apply(initializer)
