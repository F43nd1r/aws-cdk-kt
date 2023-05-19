@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

public fun alarmProperty(initializer: CfnDeploymentGroup.AlarmProperty.Builder.() -> Unit):
    CfnDeploymentGroup.AlarmProperty =
    CfnDeploymentGroup.AlarmProperty.builder().apply(initializer).build()
