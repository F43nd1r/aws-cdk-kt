package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes

@Generated
public fun buildEcsDeploymentGroupAttributes(initializer: @AwsCdkDsl
    EcsDeploymentGroupAttributes.Builder.() -> Unit = {}): EcsDeploymentGroupAttributes =
    EcsDeploymentGroupAttributes.Builder().apply(initializer).build()
