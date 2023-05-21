package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import software.amazon.awscdk.services.ssmcontacts.CfnRotationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRotation(
  id: String,
  props: CfnRotationProps,
  initializer: CfnRotation.() -> Unit = {},
): CfnRotation = CfnRotation(this, id, props).apply(initializer)
