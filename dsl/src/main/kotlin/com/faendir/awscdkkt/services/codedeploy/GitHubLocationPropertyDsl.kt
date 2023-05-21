package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun gitHubLocationProperty(initializer: CfnDeploymentGroup.GitHubLocationProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.GitHubLocationProperty =
    CfnDeploymentGroup.GitHubLocationProperty.builder().apply(initializer).build()
