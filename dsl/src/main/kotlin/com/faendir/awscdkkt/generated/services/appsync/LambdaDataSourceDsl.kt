package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.appsync.LambdaDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaDataSource(
  id: String,
  props: LambdaDataSourceProps,
  initializer: @AwsCdkDsl LambdaDataSource.() -> Unit = {},
): LambdaDataSource = LambdaDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaDataSource(id: String, initializer: @AwsCdkDsl LambdaDataSource.Builder.() -> Unit = {}): LambdaDataSource = LambdaDataSource.Builder.create(this, id).apply(initializer).build()
