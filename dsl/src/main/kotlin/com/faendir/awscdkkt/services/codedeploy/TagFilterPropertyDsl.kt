package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public fun tagFilterProperty(initializer: CfnDeploymentGroup.TagFilterProperty.Builder.() -> Unit =
    {}): CfnDeploymentGroup.TagFilterProperty =
    CfnDeploymentGroup.TagFilterProperty.builder().apply(initializer).build()
