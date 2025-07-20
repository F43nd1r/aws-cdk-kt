package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl DynamoDbDataSource.() -> Unit = {},
): DynamoDbDataSource = DynamoDbDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDynamoDbDataSource(id: String, initializer: @AwsCdkDsl DynamoDbDataSource.Builder.() -> Unit = {}): DynamoDbDataSource = DynamoDbDataSource.Builder.create(this, id).apply(initializer).build()
