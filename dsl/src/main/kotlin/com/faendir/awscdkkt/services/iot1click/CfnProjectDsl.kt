@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot1click

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps
import software.constructs.Construct

public fun Construct.cfnProject(
  id: String,
  props: CfnProjectProps,
  initializer: CfnProject.() -> Unit = {},
): CfnProject = CfnProject(this, id, props).apply(initializer)
