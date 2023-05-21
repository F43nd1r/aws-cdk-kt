package com.faendir.awscdkkt.services.appsync

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
  initializer: LambdaDataSource.() -> Unit = {},
): LambdaDataSource = LambdaDataSource(this, id, props).apply(initializer)
