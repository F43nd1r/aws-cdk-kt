package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun buildDeploymentTargetsProperty(initializer: @AwsCdkDsl
    CfnStackSet.DeploymentTargetsProperty.Builder.() -> Unit = {}):
    CfnStackSet.DeploymentTargetsProperty =
    CfnStackSet.DeploymentTargetsProperty.Builder().apply(initializer).build()
