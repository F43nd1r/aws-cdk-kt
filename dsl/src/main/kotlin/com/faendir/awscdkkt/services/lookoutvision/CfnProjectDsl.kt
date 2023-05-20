@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutvision

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutvision.CfnProject
import software.amazon.awscdk.services.lookoutvision.CfnProjectProps
import software.constructs.Construct

public fun Construct.cfnProject(
  id: String,
  props: CfnProjectProps,
  initializer: CfnProject.() -> Unit = {},
): CfnProject = CfnProject(this, id, props).apply(initializer)
