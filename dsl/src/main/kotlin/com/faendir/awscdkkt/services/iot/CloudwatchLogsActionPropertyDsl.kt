@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun cloudwatchLogsActionProperty(initializer: CfnTopicRule.CloudwatchLogsActionProperty.Builder.() -> Unit):
    CfnTopicRule.CloudwatchLogsActionProperty =
    CfnTopicRule.CloudwatchLogsActionProperty.builder().apply(initializer).build()
