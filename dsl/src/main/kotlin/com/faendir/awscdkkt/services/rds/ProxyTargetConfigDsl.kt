@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ProxyTargetConfig

public fun proxyTargetConfig(initializer: ProxyTargetConfig.Builder.() -> Unit): ProxyTargetConfig =
    ProxyTargetConfig.builder().apply(initializer).build()
