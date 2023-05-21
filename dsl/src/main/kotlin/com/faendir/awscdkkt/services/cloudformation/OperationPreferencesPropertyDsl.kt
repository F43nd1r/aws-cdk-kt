package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public
    fun operationPreferencesProperty(initializer: CfnStackSet.OperationPreferencesProperty.Builder.() -> Unit
    = {}): CfnStackSet.OperationPreferencesProperty =
    CfnStackSet.OperationPreferencesProperty.builder().apply(initializer).build()
