package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncHttpDataSource
import software.amazon.awscdk.services.appsync.AppSyncHttpDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncHttpDataSource(
  id: String,
  props: AppSyncHttpDataSourceProps,
  initializer: @AwsCdkDsl AppSyncHttpDataSource.() -> Unit = {},
): AppSyncHttpDataSource = AppSyncHttpDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncHttpDataSource(id: String, initializer: @AwsCdkDsl AppSyncHttpDataSource.Builder.() -> Unit = {}): AppSyncHttpDataSource = AppSyncHttpDataSource.Builder.create(this, id).apply(initializer).build()
