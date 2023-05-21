package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun sAMPolicyTemplateProperty(initializer: CfnStateMachine.SAMPolicyTemplateProperty.Builder.() -> Unit
    = {}): CfnStateMachine.SAMPolicyTemplateProperty =
    CfnStateMachine.SAMPolicyTemplateProperty.builder().apply(initializer).build()
