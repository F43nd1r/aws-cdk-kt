package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnMitigationAction

@Generated
public
    fun actionParamsProperty(initializer: CfnMitigationAction.ActionParamsProperty.Builder.() -> Unit
    = {}): CfnMitigationAction.ActionParamsProperty =
    CfnMitigationAction.ActionParamsProperty.builder().apply(initializer).build()
