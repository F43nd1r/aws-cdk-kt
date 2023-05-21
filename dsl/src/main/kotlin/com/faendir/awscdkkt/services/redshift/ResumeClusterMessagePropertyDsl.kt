package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnScheduledAction

@Generated
public
    fun resumeClusterMessageProperty(initializer: CfnScheduledAction.ResumeClusterMessageProperty.Builder.() -> Unit
    = {}): CfnScheduledAction.ResumeClusterMessageProperty =
    CfnScheduledAction.ResumeClusterMessageProperty.builder().apply(initializer).build()
