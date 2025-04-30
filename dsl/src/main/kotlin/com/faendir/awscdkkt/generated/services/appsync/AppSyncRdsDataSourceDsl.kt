package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncRdsDataSource
import software.amazon.awscdk.services.appsync.AppSyncRdsDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncRdsDataSource(
  id: String,
  props: AppSyncRdsDataSourceProps,
  initializer: @AwsCdkDsl AppSyncRdsDataSource.() -> Unit = {},
): AppSyncRdsDataSource = AppSyncRdsDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncRdsDataSource(id: String, initializer: @AwsCdkDsl
    AppSyncRdsDataSource.Builder.() -> Unit = {}): AppSyncRdsDataSource =
    AppSyncRdsDataSource.Builder.create(this, id).apply(initializer).build()
