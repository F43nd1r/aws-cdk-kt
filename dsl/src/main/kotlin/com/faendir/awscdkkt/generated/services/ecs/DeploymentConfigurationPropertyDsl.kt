package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public fun buildDeploymentConfigurationProperty(initializer: @AwsCdkDsl
    CfnService.DeploymentConfigurationProperty.Builder.() -> Unit = {}):
    CfnService.DeploymentConfigurationProperty =
    CfnService.DeploymentConfigurationProperty.Builder().apply(initializer).build()
