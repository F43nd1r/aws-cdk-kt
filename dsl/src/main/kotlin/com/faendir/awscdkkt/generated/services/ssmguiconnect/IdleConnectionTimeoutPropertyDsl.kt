package com.faendir.awscdkkt.generated.services.ssmguiconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmguiconnect.CfnPreferences

@Generated
public fun buildIdleConnectionTimeoutProperty(initializer: @AwsCdkDsl
    CfnPreferences.IdleConnectionTimeoutProperty.Builder.() -> Unit = {}):
    CfnPreferences.IdleConnectionTimeoutProperty =
    CfnPreferences.IdleConnectionTimeoutProperty.Builder().apply(initializer).build()
