package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource
import software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncEventBridgeDataSource(
  id: String,
  props: AppSyncEventBridgeDataSourceProps,
  initializer: @AwsCdkDsl AppSyncEventBridgeDataSource.() -> Unit = {},
): AppSyncEventBridgeDataSource = AppSyncEventBridgeDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncEventBridgeDataSource(id: String, initializer: @AwsCdkDsl AppSyncEventBridgeDataSource.Builder.() -> Unit = {}): AppSyncEventBridgeDataSource = AppSyncEventBridgeDataSource.Builder.create(this, id).apply(initializer).build()
