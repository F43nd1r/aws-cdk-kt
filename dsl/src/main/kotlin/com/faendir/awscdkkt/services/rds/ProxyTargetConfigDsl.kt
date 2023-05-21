package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ProxyTargetConfig

@Generated
public fun proxyTargetConfig(initializer: ProxyTargetConfig.Builder.() -> Unit = {}):
    ProxyTargetConfig = ProxyTargetConfig.builder().apply(initializer).build()
