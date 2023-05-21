package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun alarmConfigurationProperty(initializer: CfnDeploymentGroup.AlarmConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.AlarmConfigurationProperty =
    CfnDeploymentGroup.AlarmConfigurationProperty.builder().apply(initializer).build()
