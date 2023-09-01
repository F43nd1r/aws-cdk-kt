package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public fun buildAccessLogSettingProperty(initializer: @AwsCdkDsl
    CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit = {}):
    CfnHttpApi.AccessLogSettingProperty =
    CfnHttpApi.AccessLogSettingProperty.Builder().apply(initializer).build()
