@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public
    fun autoRollbackConfigurationProperty(initializer: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit):
    CfnDeploymentGroup.AutoRollbackConfigurationProperty =
    CfnDeploymentGroup.AutoRollbackConfigurationProperty.builder().apply(initializer).build()
