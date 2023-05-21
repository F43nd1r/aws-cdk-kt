package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.WorkmailActionConfig

@Generated
public fun workmailActionConfig(initializer: WorkmailActionConfig.Builder.() -> Unit = {}):
    WorkmailActionConfig = WorkmailActionConfig.builder().apply(initializer).build()
