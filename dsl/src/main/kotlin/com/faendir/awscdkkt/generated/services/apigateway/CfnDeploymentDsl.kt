package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDeploymentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeployment(id: String, props: CfnDeploymentProps): CfnDeployment =
    CfnDeployment(this, id, props)

@Generated
public fun Construct.cfnDeployment(
  id: String,
  props: CfnDeploymentProps,
  initializer: @AwsCdkDsl CfnDeployment.() -> Unit,
): CfnDeployment = CfnDeployment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeployment(id: String, initializer: @AwsCdkDsl
    CfnDeployment.Builder.() -> Unit): CfnDeployment = CfnDeployment.Builder.create(this,
    id).apply(initializer).build()
