package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DkimIdentityConfig

@Generated
public fun dkimIdentityConfig(initializer: DkimIdentityConfig.Builder.() -> Unit = {}):
    DkimIdentityConfig = DkimIdentityConfig.builder().apply(initializer).build()
