@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnConnectorProfileProps
import software.constructs.Construct

public fun Construct.cfnConnectorProfile(
  id: String,
  props: CfnConnectorProfileProps,
  initializer: CfnConnectorProfile.() -> Unit = {},
): CfnConnectorProfile = CfnConnectorProfile(this, id, props).apply(initializer)
