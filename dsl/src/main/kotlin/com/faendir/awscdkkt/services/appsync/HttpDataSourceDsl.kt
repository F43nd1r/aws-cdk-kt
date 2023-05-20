@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.HttpDataSourceProps
import software.constructs.Construct

public fun Construct.httpDataSource(
  id: String,
  props: HttpDataSourceProps,
  initializer: HttpDataSource.() -> Unit = {},
): HttpDataSource = HttpDataSource(this, id, props).apply(initializer)
