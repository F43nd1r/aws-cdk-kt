@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
