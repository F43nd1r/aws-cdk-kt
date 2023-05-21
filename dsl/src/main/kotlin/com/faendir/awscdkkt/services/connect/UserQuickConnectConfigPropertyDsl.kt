package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect

@Generated
public
    fun userQuickConnectConfigProperty(initializer: CfnQuickConnect.UserQuickConnectConfigProperty.Builder.() -> Unit
    = {}): CfnQuickConnect.UserQuickConnectConfigProperty =
    CfnQuickConnect.UserQuickConnectConfigProperty.builder().apply(initializer).build()
