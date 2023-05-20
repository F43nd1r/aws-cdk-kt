@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
import software.constructs.Construct

public fun Construct.openSearchDataSource(
  id: String,
  props: OpenSearchDataSourceProps,
  initializer: OpenSearchDataSource.() -> Unit = {},
): OpenSearchDataSource = OpenSearchDataSource(this, id, props).apply(initializer)
