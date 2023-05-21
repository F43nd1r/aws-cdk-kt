package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun autoRollbackConfigurationProperty(initializer: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.AutoRollbackConfigurationProperty =
    CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder().apply(initializer).build()
