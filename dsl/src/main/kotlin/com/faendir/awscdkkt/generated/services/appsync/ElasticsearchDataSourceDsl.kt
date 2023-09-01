@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ElasticsearchDataSource.() -> Unit = {},
): ElasticsearchDataSource = ElasticsearchDataSource(this, id, props).apply(initializer)

@Deprecated(message =
    "software.amazon.awscdk.services.appsync.ElasticsearchDataSource is deprecated in CDK.")
@Generated
public fun Construct.buildElasticsearchDataSource(id: String, initializer: @AwsCdkDsl
    ElasticsearchDataSource.Builder.() -> Unit = {}): ElasticsearchDataSource =
    ElasticsearchDataSource.Builder.create(this, id).apply(initializer).build()
