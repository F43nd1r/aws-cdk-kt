@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
