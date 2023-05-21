package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnRule

@Generated
public
    fun eventBridgeActionProperty(initializer: CfnRule.EventBridgeActionProperty.Builder.() -> Unit
    = {}): CfnRule.EventBridgeActionProperty =
    CfnRule.EventBridgeActionProperty.builder().apply(initializer).build()
