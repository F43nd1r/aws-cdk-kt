package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public
    fun elasticsearchActionProperty(initializer: CfnTopicRule.ElasticsearchActionProperty.Builder.() -> Unit
    = {}): CfnTopicRule.ElasticsearchActionProperty =
    CfnTopicRule.ElasticsearchActionProperty.builder().apply(initializer).build()
