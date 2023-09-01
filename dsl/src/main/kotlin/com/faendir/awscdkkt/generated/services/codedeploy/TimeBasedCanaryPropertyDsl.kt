package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

@Generated
public fun buildTimeBasedCanaryProperty(initializer: @AwsCdkDsl
    CfnDeploymentConfig.TimeBasedCanaryProperty.Builder.() -> Unit = {}):
    CfnDeploymentConfig.TimeBasedCanaryProperty =
    CfnDeploymentConfig.TimeBasedCanaryProperty.Builder().apply(initializer).build()
