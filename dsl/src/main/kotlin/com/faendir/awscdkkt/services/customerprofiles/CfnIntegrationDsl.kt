@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
import software.constructs.Construct

public fun Construct.cfnIntegration(
  id: String,
  props: CfnIntegrationProps,
  initializer: CfnIntegration.() -> Unit = {},
): CfnIntegration = CfnIntegration(this, id, props).apply(initializer)
