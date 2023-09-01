package com.faendir.awscdkkt.generated.services.databrew

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnProject
import software.amazon.awscdk.services.databrew.CfnProjectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProject(
  id: String,
  props: CfnProjectProps,
  initializer: @AwsCdkDsl CfnProject.() -> Unit = {},
): CfnProject = CfnProject(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProject(id: String, initializer: @AwsCdkDsl
    CfnProject.Builder.() -> Unit = {}): CfnProject = CfnProject.Builder.create(this,
    id).apply(initializer).build()
