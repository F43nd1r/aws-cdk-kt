@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
