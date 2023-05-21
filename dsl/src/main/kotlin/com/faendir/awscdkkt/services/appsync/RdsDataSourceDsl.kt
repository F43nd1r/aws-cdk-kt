package com.faendir.awscdkkt.services.appsync

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
  initializer: RdsDataSource.() -> Unit = {},
): RdsDataSource = RdsDataSource(this, id, props).apply(initializer)
