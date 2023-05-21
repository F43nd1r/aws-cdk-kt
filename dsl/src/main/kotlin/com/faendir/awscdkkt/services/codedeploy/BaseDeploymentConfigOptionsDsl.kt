package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigOptions

@Generated
public fun baseDeploymentConfigOptions(initializer: BaseDeploymentConfigOptions.Builder.() -> Unit =
    {}): BaseDeploymentConfigOptions =
    BaseDeploymentConfigOptions.builder().apply(initializer).build()
