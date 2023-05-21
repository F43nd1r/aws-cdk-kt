package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public fun redisSettingsProperty(initializer: CfnEndpoint.RedisSettingsProperty.Builder.() -> Unit =
    {}): CfnEndpoint.RedisSettingsProperty =
    CfnEndpoint.RedisSettingsProperty.builder().apply(initializer).build()
