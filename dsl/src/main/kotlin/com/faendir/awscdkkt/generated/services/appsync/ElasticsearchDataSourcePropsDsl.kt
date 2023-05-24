@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps

@Deprecated(message =
    "software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps is deprecated in CDK.")
@Generated
public fun buildElasticsearchDataSourceProps(initializer: @AwsCdkDsl
    ElasticsearchDataSourceProps.Builder.() -> Unit): ElasticsearchDataSourceProps =
    ElasticsearchDataSourceProps.Builder().apply(initializer).build()
