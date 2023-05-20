@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

public
    fun elasticsearchClusterConfigProperty(initializer: CfnDomain.ElasticsearchClusterConfigProperty.Builder.() -> Unit):
    CfnDomain.ElasticsearchClusterConfigProperty =
    CfnDomain.ElasticsearchClusterConfigProperty.builder().apply(initializer).build()
