@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.finspace

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.finspace.CfnEnvironment
import software.amazon.awscdk.services.finspace.CfnEnvironmentProps
import software.constructs.Construct

public fun Construct.cfnEnvironment(
  id: String,
  props: CfnEnvironmentProps,
  initializer: CfnEnvironment.() -> Unit = {},
): CfnEnvironment = CfnEnvironment(this, id, props).apply(initializer)
