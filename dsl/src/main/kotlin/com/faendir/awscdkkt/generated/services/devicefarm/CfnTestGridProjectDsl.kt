package com.faendir.awscdkkt.generated.services.devicefarm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProjectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTestGridProject(id: String, props: CfnTestGridProjectProps):
    CfnTestGridProject = CfnTestGridProject(this, id, props)

@Generated
public fun Construct.cfnTestGridProject(
  id: String,
  props: CfnTestGridProjectProps,
  initializer: @AwsCdkDsl CfnTestGridProject.() -> Unit,
): CfnTestGridProject = CfnTestGridProject(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTestGridProject(id: String, initializer: @AwsCdkDsl
    CfnTestGridProject.Builder.() -> Unit): CfnTestGridProject =
    CfnTestGridProject.Builder.create(this, id).apply(initializer).build()
