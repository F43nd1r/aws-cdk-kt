package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSource
import software.amazon.awscdk.services.appsync.AppSyncDynamoDbDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncDynamoDbDataSource(
  id: String,
  props: AppSyncDynamoDbDataSourceProps,
  initializer: @AwsCdkDsl AppSyncDynamoDbDataSource.() -> Unit = {},
): AppSyncDynamoDbDataSource = AppSyncDynamoDbDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncDynamoDbDataSource(id: String, initializer: @AwsCdkDsl
    AppSyncDynamoDbDataSource.Builder.() -> Unit = {}): AppSyncDynamoDbDataSource =
    AppSyncDynamoDbDataSource.Builder.create(this, id).apply(initializer).build()
