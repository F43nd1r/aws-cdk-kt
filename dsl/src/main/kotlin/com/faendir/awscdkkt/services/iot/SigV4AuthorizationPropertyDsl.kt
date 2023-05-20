@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

public
    fun sigV4AuthorizationProperty(initializer: CfnTopicRule.SigV4AuthorizationProperty.Builder.() -> Unit):
    CfnTopicRule.SigV4AuthorizationProperty =
    CfnTopicRule.SigV4AuthorizationProperty.builder().apply(initializer).build()
