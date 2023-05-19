@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun firehoseActionProperty(initializer: CfnTopicRule.FirehoseActionProperty.Builder.() -> Unit):
    CfnTopicRule.FirehoseActionProperty =
    CfnTopicRule.FirehoseActionProperty.builder().apply(initializer).build()
