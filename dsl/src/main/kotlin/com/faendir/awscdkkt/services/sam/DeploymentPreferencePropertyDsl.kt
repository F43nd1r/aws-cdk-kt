package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun deploymentPreferenceProperty(initializer: CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit
    = {}): CfnFunction.DeploymentPreferenceProperty =
    CfnFunction.DeploymentPreferenceProperty.builder().apply(initializer).build()
