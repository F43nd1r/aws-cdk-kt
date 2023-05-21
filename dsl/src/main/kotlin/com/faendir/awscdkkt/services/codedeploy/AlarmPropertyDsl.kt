package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public fun alarmProperty(initializer: CfnDeploymentGroup.AlarmProperty.Builder.() -> Unit = {}):
    CfnDeploymentGroup.AlarmProperty =
    CfnDeploymentGroup.AlarmProperty.builder().apply(initializer).build()
