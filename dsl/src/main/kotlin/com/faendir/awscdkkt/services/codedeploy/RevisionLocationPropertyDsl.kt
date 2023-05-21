package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@Generated
public
    fun revisionLocationProperty(initializer: CfnDeploymentGroup.RevisionLocationProperty.Builder.() -> Unit
    = {}): CfnDeploymentGroup.RevisionLocationProperty =
    CfnDeploymentGroup.RevisionLocationProperty.builder().apply(initializer).build()
