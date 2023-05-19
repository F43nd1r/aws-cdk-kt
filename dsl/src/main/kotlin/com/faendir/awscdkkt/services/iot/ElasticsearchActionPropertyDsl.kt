@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun elasticsearchActionProperty(initializer: CfnTopicRule.ElasticsearchActionProperty.Builder.() -> Unit):
    CfnTopicRule.ElasticsearchActionProperty =
    CfnTopicRule.ElasticsearchActionProperty.builder().apply(initializer).build()
