@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rolesanywhere

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rolesanywhere.CfnCRL
import software.amazon.awscdk.services.rolesanywhere.CfnCRLProps
import software.constructs.Construct

public fun Construct.cfnCRL(
  id: String,
  props: CfnCRLProps,
  initializer: CfnCRL.() -> Unit = {},
): CfnCRL = CfnCRL(this, id, props).apply(initializer)
