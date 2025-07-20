package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSource
import software.amazon.awscdk.services.appsync.AppSyncOpenSearchDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncOpenSearchDataSource(
  id: String,
  props: AppSyncOpenSearchDataSourceProps,
  initializer: @AwsCdkDsl AppSyncOpenSearchDataSource.() -> Unit = {},
): AppSyncOpenSearchDataSource = AppSyncOpenSearchDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncOpenSearchDataSource(id: String, initializer: @AwsCdkDsl AppSyncOpenSearchDataSource.Builder.() -> Unit = {}): AppSyncOpenSearchDataSource = AppSyncOpenSearchDataSource.Builder.create(this, id).apply(initializer).build()
