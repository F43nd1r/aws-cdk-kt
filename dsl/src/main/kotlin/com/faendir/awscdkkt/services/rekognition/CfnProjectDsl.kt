@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnProject
import software.amazon.awscdk.services.rekognition.CfnProjectProps
import software.constructs.Construct

public fun Construct.cfnProject(
  id: String,
  props: CfnProjectProps,
  initializer: CfnProject.() -> Unit = {},
): CfnProject = CfnProject(this, id, props).apply(initializer)
