package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppSyncLambdaDataSource
import software.amazon.awscdk.services.appsync.AppSyncLambdaDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.appSyncLambdaDataSource(
  id: String,
  props: AppSyncLambdaDataSourceProps,
  initializer: @AwsCdkDsl AppSyncLambdaDataSource.() -> Unit = {},
): AppSyncLambdaDataSource = AppSyncLambdaDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppSyncLambdaDataSource(id: String, initializer: @AwsCdkDsl
    AppSyncLambdaDataSource.Builder.() -> Unit = {}): AppSyncLambdaDataSource =
    AppSyncLambdaDataSource.Builder.create(this, id).apply(initializer).build()
