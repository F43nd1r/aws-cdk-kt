package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnTopicRule

@Generated
public fun lambdaActionProperty(initializer: CfnTopicRule.LambdaActionProperty.Builder.() -> Unit =
    {}): CfnTopicRule.LambdaActionProperty =
    CfnTopicRule.LambdaActionProperty.builder().apply(initializer).build()
