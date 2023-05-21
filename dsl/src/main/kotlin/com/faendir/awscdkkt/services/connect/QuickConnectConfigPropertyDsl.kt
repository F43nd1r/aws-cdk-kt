package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect

@Generated
public
    fun quickConnectConfigProperty(initializer: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit
    = {}): CfnQuickConnect.QuickConnectConfigProperty =
    CfnQuickConnect.QuickConnectConfigProperty.builder().apply(initializer).build()
