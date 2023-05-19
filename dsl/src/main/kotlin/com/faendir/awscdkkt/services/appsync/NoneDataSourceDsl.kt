@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.amazon.awscdk.services.appsync.NoneDataSourceProps
import software.constructs.Construct

public fun Construct.noneDataSource(
  id: String,
  props: NoneDataSourceProps,
  initializer: NoneDataSource.() -> Unit = {},
): NoneDataSource = NoneDataSource(this, id, props).apply(initializer)
