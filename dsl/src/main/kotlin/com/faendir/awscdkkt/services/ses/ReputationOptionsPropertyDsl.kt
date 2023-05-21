package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun reputationOptionsProperty(initializer: CfnConfigurationSet.ReputationOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.ReputationOptionsProperty =
    CfnConfigurationSet.ReputationOptionsProperty.builder().apply(initializer).build()
