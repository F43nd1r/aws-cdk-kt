@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

public
    fun deploymentAlarmsProperty(initializer: CfnService.DeploymentAlarmsProperty.Builder.() -> Unit):
    CfnService.DeploymentAlarmsProperty =
    CfnService.DeploymentAlarmsProperty.builder().apply(initializer).build()
