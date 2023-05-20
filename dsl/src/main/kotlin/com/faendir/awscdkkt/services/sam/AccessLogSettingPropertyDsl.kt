@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

public
    fun accessLogSettingProperty(initializer: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit):
    CfnHttpApi.AccessLogSettingProperty =
    CfnHttpApi.AccessLogSettingProperty.builder().apply(initializer).build()
