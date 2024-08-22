package com.faendir.awscdkkt.generated.services.launchwizard

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.launchwizard.CfnDeployment
import software.amazon.awscdk.services.launchwizard.CfnDeploymentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeployment(
  id: String,
  props: CfnDeploymentProps,
  initializer: @AwsCdkDsl CfnDeployment.() -> Unit = {},
): CfnDeployment = CfnDeployment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeployment(id: String, initializer: @AwsCdkDsl
    CfnDeployment.Builder.() -> Unit = {}): CfnDeployment = CfnDeployment.Builder.create(this,
    id).apply(initializer).build()
