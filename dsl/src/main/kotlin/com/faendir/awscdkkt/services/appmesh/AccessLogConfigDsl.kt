package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.AccessLogConfig

@Generated
public fun accessLogConfig(initializer: AccessLogConfig.Builder.() -> Unit = {}): AccessLogConfig =
    AccessLogConfig.builder().apply(initializer).build()
