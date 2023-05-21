package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun suppressionOptionsProperty(initializer: CfnConfigurationSet.SuppressionOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.SuppressionOptionsProperty =
    CfnConfigurationSet.SuppressionOptionsProperty.builder().apply(initializer).build()
