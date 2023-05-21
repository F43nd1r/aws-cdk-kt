package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public
    fun accessLogSettingProperty(initializer: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit
    = {}): CfnHttpApi.AccessLogSettingProperty =
    CfnHttpApi.AccessLogSettingProperty.builder().apply(initializer).build()
