package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@Generated
public
    fun scheduledActionTypeProperty(initializer: CfnScheduledAction.ScheduledActionTypeProperty.Builder.() -> Unit
    = {}): CfnScheduledAction.ScheduledActionTypeProperty =
    CfnScheduledAction.ScheduledActionTypeProperty.builder().apply(initializer).build()
