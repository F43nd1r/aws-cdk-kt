package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun elasticsearchConfigProperty(initializer: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.ElasticsearchConfigProperty =
    CfnDataSource.ElasticsearchConfigProperty.builder().apply(initializer).build()
