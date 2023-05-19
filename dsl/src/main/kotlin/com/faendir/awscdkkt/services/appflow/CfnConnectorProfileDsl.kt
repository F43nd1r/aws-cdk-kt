@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
