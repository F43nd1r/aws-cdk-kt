@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.appsync.RdsDataSourceProps
import software.constructs.Construct

public fun Construct.rdsDataSource(
  id: String,
  props: RdsDataSourceProps,
  initializer: RdsDataSource.() -> Unit = {},
): RdsDataSource = RdsDataSource(this, id, props).apply(initializer)
