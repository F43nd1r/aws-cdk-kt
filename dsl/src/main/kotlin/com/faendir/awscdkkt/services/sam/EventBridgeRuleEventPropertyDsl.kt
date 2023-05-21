package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun eventBridgeRuleEventProperty(initializer: CfnStateMachine.EventBridgeRuleEventProperty.Builder.() -> Unit
    = {}): CfnStateMachine.EventBridgeRuleEventProperty =
    CfnStateMachine.EventBridgeRuleEventProperty.builder().apply(initializer).build()
