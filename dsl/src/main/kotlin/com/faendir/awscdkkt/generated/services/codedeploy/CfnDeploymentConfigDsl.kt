package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeploymentConfig(id: String): CfnDeploymentConfig =
    CfnDeploymentConfig(this, id)

@Generated
public fun Construct.cfnDeploymentConfig(id: String, initializer: @AwsCdkDsl
    CfnDeploymentConfig.() -> Unit): CfnDeploymentConfig = CfnDeploymentConfig(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnDeploymentConfig(id: String, props: CfnDeploymentConfigProps):
    CfnDeploymentConfig = CfnDeploymentConfig(this, id, props)

@Generated
public fun Construct.cfnDeploymentConfig(
  id: String,
  props: CfnDeploymentConfigProps,
  initializer: @AwsCdkDsl CfnDeploymentConfig.() -> Unit,
): CfnDeploymentConfig = CfnDeploymentConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeploymentConfig(id: String, initializer: @AwsCdkDsl
    CfnDeploymentConfig.Builder.() -> Unit): CfnDeploymentConfig =
    CfnDeploymentConfig.Builder.create(this, id).apply(initializer).build()
