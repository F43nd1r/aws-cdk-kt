package com.faendir.awscdkkt.services.devicefarm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject
import software.amazon.awscdk.services.devicefarm.CfnTestGridProjectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTestGridProject(
  id: String,
  props: CfnTestGridProjectProps,
  initializer: CfnTestGridProject.() -> Unit = {},
): CfnTestGridProject = CfnTestGridProject(this, id, props).apply(initializer)
