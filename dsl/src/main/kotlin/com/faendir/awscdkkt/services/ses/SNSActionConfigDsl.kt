package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.SNSActionConfig

@Generated
public fun sNSActionConfig(initializer: SNSActionConfig.Builder.() -> Unit = {}): SNSActionConfig =
    SNSActionConfig.builder().apply(initializer).build()
