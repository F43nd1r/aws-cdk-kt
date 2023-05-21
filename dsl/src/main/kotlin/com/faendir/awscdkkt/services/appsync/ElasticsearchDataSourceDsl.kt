@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
import software.constructs.Construct

@Deprecated(message =
    "software.amazon.awscdk.services.appsync.ElasticsearchDataSource is deprecated in CDK.")
@Generated
public fun Construct.elasticsearchDataSource(
  id: String,
  props: ElasticsearchDataSourceProps,
  initializer: ElasticsearchDataSource.() -> Unit = {},
): ElasticsearchDataSource = ElasticsearchDataSource(this, id, props).apply(initializer)
