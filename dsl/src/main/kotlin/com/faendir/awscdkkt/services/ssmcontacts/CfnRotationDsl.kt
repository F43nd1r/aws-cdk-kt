@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
import software.constructs.Construct

public fun Construct.cfnRotation(
  id: String,
  props: CfnRotationProps,
  initializer: CfnRotation.() -> Unit = {},
): CfnRotation = CfnRotation(this, id, props).apply(initializer)
