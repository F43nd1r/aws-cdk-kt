@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
import software.constructs.Construct

public fun Construct.elasticsearchDataSource(
  id: String,
  props: ElasticsearchDataSourceProps,
  initializer: ElasticsearchDataSource.() -> Unit = {},
): ElasticsearchDataSource = ElasticsearchDataSource(this, id, props).apply(initializer)
