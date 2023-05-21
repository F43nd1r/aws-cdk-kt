@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps

@Deprecated(message =
    "software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps is deprecated in CDK.")
@Generated
public fun elasticsearchDataSourceProps(initializer: ElasticsearchDataSourceProps.Builder.() -> Unit
    = {}): ElasticsearchDataSourceProps =
    ElasticsearchDataSourceProps.builder().apply(initializer).build()
