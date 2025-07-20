package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.appsync.RdsDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.rdsDataSource(
  id: String,
  props: RdsDataSourceProps,
  initializer: @AwsCdkDsl RdsDataSource.() -> Unit = {},
): RdsDataSource = RdsDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRdsDataSource(id: String, initializer: @AwsCdkDsl RdsDataSource.Builder.() -> Unit = {}): RdsDataSource = RdsDataSource.Builder.create(this, id).apply(initializer).build()
