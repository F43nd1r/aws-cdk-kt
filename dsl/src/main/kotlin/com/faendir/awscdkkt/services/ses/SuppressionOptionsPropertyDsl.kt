@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

public
    fun suppressionOptionsProperty(initializer: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit):
    CfnConfigurationSet.SuppressionOptionsProperty =
    CfnConfigurationSet.SuppressionOptionsProperty.builder().apply(initializer).build()
