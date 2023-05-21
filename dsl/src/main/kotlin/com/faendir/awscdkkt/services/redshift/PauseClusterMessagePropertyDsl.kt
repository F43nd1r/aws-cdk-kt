package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@Generated
public
    fun pauseClusterMessageProperty(initializer: CfnScheduledAction.PauseClusterMessageProperty.Builder.() -> Unit
    = {}): CfnScheduledAction.PauseClusterMessageProperty =
    CfnScheduledAction.PauseClusterMessageProperty.builder().apply(initializer).build()
