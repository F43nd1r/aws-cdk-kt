package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@Generated
public
    fun resizeClusterMessageProperty(initializer: CfnScheduledAction.ResizeClusterMessageProperty.Builder.() -> Unit
    = {}): CfnScheduledAction.ResizeClusterMessageProperty =
    CfnScheduledAction.ResizeClusterMessageProperty.builder().apply(initializer).build()
