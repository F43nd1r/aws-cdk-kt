package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun iAMPolicyDocumentProperty(initializer: CfnStateMachine.IAMPolicyDocumentProperty.Builder.() -> Unit
    = {}): CfnStateMachine.IAMPolicyDocumentProperty =
    CfnStateMachine.IAMPolicyDocumentProperty.builder().apply(initializer).build()
